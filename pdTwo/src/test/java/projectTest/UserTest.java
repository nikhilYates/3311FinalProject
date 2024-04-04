package projectTest;

import userManagement.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import itemManagement.ItemRepo;
import itemManagement.PhysicalItem;

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
    private String testFilePath;

    @Before
    public void setUp() throws Exception {
        testFilePath = new File("src/test/resources/test_user.xlsx").getAbsolutePath();
        
        createTestWorkbook(testFilePath);

        faculty = new Faculty(1, "faculty@example.com", 0, "Engineering") {
            protected Workbook getWorkbook() throws IOException {
                FileInputStream fileInputStream = new FileInputStream(new File(testFilePath));
                return new XSSFWorkbook(fileInputStream);
            }
        };
        
        student = new Student(2, "student@example.com", 2, "Science", 4) {
            @Override
            protected Workbook getWorkbook() throws IOException {
                FileInputStream fileInputStream = new FileInputStream(new File(testFilePath));
                return new XSSFWorkbook(fileInputStream);
            }
        };

        nonFaculty = new NonFaculty(3, "nonfaculty@example.com", 3) {
            @Override
            protected Workbook getWorkbook() throws IOException {
                FileInputStream fileInputStream = new FileInputStream(new File(testFilePath));
                return new XSSFWorkbook(fileInputStream);
            }
        };

        visitor = new Visitor(4, "visitor@example.com", 4) {
            @Override
            protected Workbook getWorkbook() throws IOException {
                FileInputStream fileInputStream = new FileInputStream(new File(testFilePath));
                return new XSSFWorkbook(fileInputStream);
            }
        };


        ItemRepo.reset();
        ItemRepo.addItem(new PhysicalItem("001", "Test Item 1", "Location A", true));
        ItemRepo.addItem(new PhysicalItem("002", "Test Item 2", "Location B", true));
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
        assertFalse("Rental list should not be empty after adding a rental", faculty.getRentalList().isEmpty());
        assertEquals("The rental list should contain exactly 1 rental after adding a rental", 1, faculty.getRentalList().size());
    }

    @Test
    public void testComprehensiveReport() {
        faculty.comprehensiveReport();
        // Check for expected output or interactions
    }

//    @After
//    public void tearDown() {
//        // Clean up the test Excel file
//        new File(testFilePath).delete();
//    }

    private void createTestWorkbook(String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("TestData");

        // Define column headers
        String[] columnHeaders = {"UserID", "Email", "Password", "UserType", "Validation", "Department", "Major", "Year"};

        // Create header row
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < columnHeaders.length; i++) {
            headerRow.createCell(i).setCellValue(columnHeaders[i]);
        }

        // Create test data
        Object[][] testData = {
            {1, "faculty@example.com", "password", "Faculty", true, "Engineering", "", 0},
            {2, "student@example.com", "password", "Student", true, "Science", "Biology", 4},
            {3, "nonfaculty@example.com", "password", "NonFaculty", true, "", "", 0},
            {4, "visitor@example.com", "password", "Visitor", true, "", "", 0}
        };

        // Populate sheet with test data
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

        // Write the workbook to the file system
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } finally {
            workbook.close();
        }
    }
}
