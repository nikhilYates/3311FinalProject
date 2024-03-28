package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.ItemRepo;
import itemManagement.PhysicalItem;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;

import userManagement.CommonUserOperations;
import userManagement.Faculty;
import userManagement.RentalTransaction;
import userManagement.User;
import java.io.*;
import java.time.LocalDate;
import java.util.*;
import static org.junit.Assert.*;

public class FacultyTest {

    private Faculty faculty;
    private CommonUserOperations operations; // For CommonUserOperations instance
    private List<RentalTransaction> rentalList; // For a list of RentalTransaction objects
    private final String testFilePath = "test_user.xlsx";

    @Before
    public void setUp() throws Exception {
		ItemRepo.reset();
		operations = new CommonUserOperations();
        rentalList = new ArrayList<>();
        
        // Initialize ItemRepo with sample items
        ItemRepo.addItem(new PhysicalItem("001", "Test Item 1", "Location A", true));
        ItemRepo.addItem(new PhysicalItem("002", "Test Item 2", "Location B", true));        
    	// Set up a test Excel file and a Faculty instance
        // Note: Implement createTestWorkbook() to set up a workbook with test data
        createTestWorkbook(testFilePath);

        faculty = new Faculty(1, "test@university.edu", 0, "Engineering");
    }

    @Test
    public void testFacultyConstructor() {
        assertEquals("Engineering", faculty.getDepartment());
    }

    @Test
    public void testSetDepartment() throws IOException {
        faculty.setDepartment("Science");
        assertEquals("Science", faculty.getDepartment());
        // Additional verification needed to check if Excel file is updated
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDepartmentWithNull() throws IOException {
        faculty.setDepartment(null);
    }

    @Test
    public void testLoginSuccessful() throws IOException {
        User loggedInUser = User.login("test@university.edu", "password");
        assertNotNull(loggedInUser);
        assertTrue(loggedInUser instanceof Faculty);
    }

    @Test
    public void testLoginFailure() throws IOException {
        User loggedInUser = User.login("wrong@university.edu", "password");
        assertNull(loggedInUser);
    }

    @Test
    public void testSignup() throws IOException {
        boolean success = User.signup(2, "newfaculty@university.edu", "newpass", Faculty.class);
        assertTrue(success);
        // Verify by attempting to login with the new credentials
    }

    @Test
    public void testDeleteUser() throws IOException {
        boolean deleted = faculty.deleteUser();
        assertTrue(deleted);
        // Verify by checking the absence of the user in the Excel file
    }

    @Test
    public void testVerifyUser() throws IOException {
        User.verifyUser("test@university.edu");
        // Verify by checking the user's validation status in the Excel file
    }

    @Test
    public void testGetRentalListEmpty() {
        List<RentalTransaction> rentalList = faculty.getRentalList();
        assertTrue(rentalList.isEmpty());
    }

    @Test
    public void testAddToRentalList() {
        LocalDate rentalDate = LocalDate.now();
        LocalDate dueDate = rentalDate.plusDays(30);

        RentalTransaction rental = new RentalTransaction(1, faculty.getUserID(), "itemid", rentalDate, dueDate, 0.0, false);
        faculty.addToRentalList(rental);

        assertFalse(faculty.getRentalList().isEmpty());
        RentalTransaction addedRental = faculty.getRentalList().get(0);
        assertEquals("itemid", addedRental.getItemid());
        assertEquals(rentalDate, addedRental.getRentalDate());
        assertEquals(dueDate, addedRental.getDueDate());
        assertEquals(0.0, addedRental.getLatePenalty(), 0.01);
        assertFalse(addedRental.isReturned());
    }

    @Test
    public void testComprehensiveReport() {
        faculty.comprehensiveReport();
        // This test might be more about verifying the output format and content,
        // possibly by capturing standard output
    }

    @After
    public void tearDown() {
        // Clean up the test Excel file
        new File(testFilePath).delete();
    }

    private void createTestWorkbook(String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook(); // Create a new workbook
        Sheet sheet = workbook.createSheet("TestData"); // Create a new sheet named "TestData"

        // Create a header row and populate it with column names
        Row headerRow = sheet.createRow(0);
        String[] columnHeaders = {"UserID", "Email", "Password", "UserType", "Validation", "Department", "Major", "Year"};
        for (int i = 0; i < columnHeaders.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columnHeaders[i]);
        }

        // Add a row of test data
        Row dataRow = sheet.createRow(1);
        Object[] testData = {1, "test@example.com", "password123", "Faculty", true, "Engineering", "", 0};
        for (int i = 0; i < testData.length; i++) {
            Cell cell = dataRow.createCell(i);
            if (testData[i] instanceof String) {
                cell.setCellValue((String) testData[i]);
            } else if (testData[i] instanceof Boolean) {
                cell.setCellValue((Boolean) testData[i]);
            } else if (testData[i] instanceof Integer) {
                cell.setCellValue((Integer) testData[i]);
            }
        }

        // Write the workbook to the file system
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } finally {
            workbook.close(); // Close the workbook to free resources
        }
    }

}
