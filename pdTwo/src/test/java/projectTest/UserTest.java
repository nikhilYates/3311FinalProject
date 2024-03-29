package projectTest;

import userManagement.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.time.LocalDate;
import java.util.*;
import static org.junit.Assert.*;

public class UserTest {

    private Faculty faculty;
    private Student student;
    private NonFaculty nonFaculty;
    private Visitor visitor;
    private final String testFilePath = "test_user.xlsx";

    @Before
    public void setUp() throws Exception {
        createTestWorkbook(testFilePath);

        // Initialize users with the row number in the test Excel file
        faculty = new Faculty(1, "faculty@example.com", 1, "Engineering");
        student = new Student(2, "student@example.com", 2, "Science", 4);
        nonFaculty = new NonFaculty(3, "nonfaculty@example.com", 3);
        visitor = new Visitor(4, "visitor@example.com", 4);
    }

    @Test
    public void testFacultyDepartment() throws IOException {
        faculty.setDepartment("Mathematics");
        assertEquals("Mathematics", faculty.getDepartment());
    }

    @Test
    public void testStudentMajor() throws IOException {
        student.setMajor("Biology");
        assertEquals("Biology", student.getMajor());
    }

    @Test
    public void testUserLogin() throws IOException {
        assertNotNull(User.login("faculty@example.com", "password"));
    }

    @Test
    public void testUserSignup() throws IOException {
        assertTrue(User.signup(5, "newuser@example.com", "password", Student.class));
    }

    @Test
    public void testDeleteUser() throws IOException {
        assertTrue(faculty.deleteUser());
    }

    @Test
    public void testVerifyUser() throws IOException {
        User.verifyUser("faculty@example.com");
        // Verification logic here
    }

    @Test
    public void testGetRentalList() {
        assertTrue(faculty.getRentalList().isEmpty());
    }

    @Test
    public void testAddToRentalList() {
        RentalTransaction rental = new RentalTransaction(1, 1, "001", LocalDate.now(), LocalDate.now().plusDays(30), 0.0, false);
        faculty.addToRentalList(rental);
        assertEquals(1, faculty.getRentalList().size());
    }

    @Test
    public void testComprehensiveReport() {
        faculty.comprehensiveReport();
        // Check for expected output or interactions
    }

    @After
    public void tearDown() {
        // Clean up the test Excel file
        new File(testFilePath).delete();
    }

    private void createTestWorkbook(String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("TestData");

        // Create a header row
        Row headerRow = sheet.createRow(0);
        String[] columnHeaders = {"UserID", "Email", "Password", "UserType", "Validation", "Department", "Major", "Year"};
        for (int i = 0; i < columnHeaders.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columnHeaders[i]);
        }

        // Create test data rows
        Object[][] testData = {
                {1, "faculty@example.com", "password", "Faculty", true, "Engineering", "", 0},
                {2, "student@example.com", "password", "Student", true, "Science", "Biology", 4},
                {3, "nonfaculty@example.com", "password", "NonFaculty", true, "", "", 0},
                {4, "visitor@example.com", "password", "Visitor", true, "", "", 0}
        };

        for (int i = 0; i < testData.length; i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < testData[i].length; j++) {
                Cell cell = row.createCell(j);
                if (testData[i][j] instanceof String) {
                    cell.setCellValue((String) testData[i][j]);
                } else if (testData[i][j] instanceof Boolean) {
                    cell.setCellValue((Boolean) testData[i][j]);
                } else if (testData[i][j] instanceof Integer) {
                    cell.setCellValue((Integer) testData[i][j]);
                }
            }
        }

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } finally {
            workbook.close();
        }
    }
}
