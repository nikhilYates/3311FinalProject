package projectTest;

import userManagement.*;
import org.junit.Before;
import org.junit.Test;

import itemManagement.ItemRepo;
import itemManagement.PhysicalItem;

import static org.junit.Assert.*;
import java.io.IOException;
import java.time.LocalDate;

public class FacultyTest {

    private Faculty faculty;

    @Before
    public void setUp() {
        // Initialize Faculty with ID, email, row number, and department
        faculty = new Faculty(1, "faculty@example.com", 0, "Engineering");

        // Reset and initialize ItemRepo with necessary items
        ItemRepo.reset();
        ItemRepo.addItem(new PhysicalItem("001", "Test Item 1", "Location A", true));
        ItemRepo.addItem(new PhysicalItem("002", "Test Item 2", "Location B", true));
    }

    @Test
    public void testFacultyDepartmentInitially() {
        assertEquals("Engineering", faculty.getDepartment());
    }

    @Test
    public void testSetDepartment() throws IOException {
        faculty.setDepartment("Mathematics");
        assertEquals("Mathematics", faculty.getDepartment());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDepartmentWithNull() throws IOException {
        faculty.setDepartment(null);
    }

    @Test
    public void testFacultyEmail() {
        assertEquals("faculty@example.com", faculty.getEmail());
    }

    @Test
    public void testFacultyUserID() {
        assertEquals(1, faculty.getUserID());
    }

    @Test
    public void testFacultyUserType() {
        assertEquals("Faculty", faculty.getUsertype());
    }

    @Test
    public void testGetRentalListEmptyInitially() {
        assertTrue(faculty.getRentalList().isEmpty());
    }

    @Test
    public void testAddToRentalList() {
        // Ensure the item with ID "001" exists in the ItemRepo
        assertNotNull("Item with ID '001' should exist in ItemRepo", ItemRepo.getItemById("001"));

        RentalTransaction rental = new RentalTransaction(1, 1, "001", LocalDate.now(), LocalDate.now().plusDays(30), 0.0, false);
        faculty.addToRentalList(rental);
        assertEquals(1, faculty.getRentalList().size());
    }

    @Test
    public void testRemoveFromRentalList() {
        RentalTransaction rental = new RentalTransaction(1, 1, "001", LocalDate.now(), LocalDate.now().plusDays(30), 0.0, false);
        faculty.addToRentalList(rental);
        faculty.removeFromRentalList(rental);
        assertTrue(faculty.getRentalList().isEmpty());
    }

    @Test
    public void testRentalListSizeAfterMultipleAdditions() {
        faculty.addToRentalList(new RentalTransaction(1, 1, "001", LocalDate.now(), LocalDate.now().plusDays(30), 0.0, false));
        faculty.addToRentalList(new RentalTransaction(2, 1, "002", LocalDate.now(), LocalDate.now().plusDays(15), 0.0, false));
        assertEquals(2, faculty.getRentalList().size());
    }

    @Test
    public void testComprehensiveReportExecution() {
        // Assuming comprehensiveReport() method prints a report to the console
        // This test checks if the method can execute without throwing an exception
        faculty.comprehensiveReport();
        assertTrue(true); // Pass if no exception is thrown
    }

    @Test
    public void testChangeDepartmentAgain() throws IOException {
        faculty.setDepartment("Physics");
        assertEquals("Physics", faculty.getDepartment());
    }

    @Test
    public void testRentalListNotEmptyAfterAdding() {
        RentalTransaction rental = new RentalTransaction(2, 1, "003", LocalDate.now(), LocalDate.now().plusDays(20), 0.0, false);
        faculty.addToRentalList(rental);
        assertFalse(faculty.getRentalList().isEmpty());
    }

    @Test
    public void testMultipleDepartmentsChange() throws IOException {
        faculty.setDepartment("Biology");
        faculty.setDepartment("Chemistry");
        assertEquals("Chemistry", faculty.getDepartment());
    }

    @Test
    public void testRentalListContainsSpecificRental() {
        RentalTransaction rental = new RentalTransaction(3, 1, "004", LocalDate.now(), LocalDate.now().plusDays(10), 0.0, false);
        faculty.addToRentalList(rental);
        assertTrue(faculty.getRentalList().contains(rental));
    }

    @Test
    public void testRentalListDoesNotContainRemovedRental() {
        RentalTransaction rental = new RentalTransaction(4, 1, "005", LocalDate.now(), LocalDate.now().plusDays(25), 0.0, false);
        faculty.addToRentalList(rental);
        faculty.removeFromRentalList(rental);
        assertFalse(faculty.getRentalList().contains(rental));
    }

    // You can add more tests here to cover further functionality as needed.
}
