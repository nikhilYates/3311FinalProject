package projectTest;

import userManagement.*;
import org.junit.Before;
import org.junit.Test;

import itemManagement.ItemRepo;
import itemManagement.PhysicalItem;

import static org.junit.Assert.*;
import java.io.IOException;
import java.time.LocalDate;

public class StudentTest {

	private Student student;

	@Before
	public void setUp() {
		// Initialize Student with ID, email, row number, major, and year
		student = new Student(1, "student@example.com", 0, "Science", 3);

		// Reset and initialize ItemRepo with necessary items
		ItemRepo.reset();
		ItemRepo.addItem(new PhysicalItem("003", "Test Book 1", "Library Section A", true));
		ItemRepo.addItem(new PhysicalItem("004", "Test Book 2", "Library Section B", true));
	}

	@Test
	public void testStudentMajorInitially() {
		assertEquals("Science", student.getMajor());
	}

	@Test
	public void testSetMajor() throws IOException {
		student.setMajor("Mathematics");
		assertEquals("Mathematics", student.getMajor());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetMajorWithNull() throws IOException {
		student.setMajor(null);
	}

	@Test
	public void testStudentYearInitially() {
		assertEquals(3, student.getYear());
	}

	@Test
	public void testSetYear() throws IOException {
		student.setYear(4);
		assertEquals(4, student.getYear());
	}

	@Test
	public void testStudentEmail() {
		assertEquals("student@example.com", student.getEmail());
	}

	@Test
	public void testStudentUserID() {
		assertEquals(1, student.getUserID());
	}

	@Test
	public void testStudentUserType() {
		assertEquals("Student", student.getUsertype());
	}

	@Test
	public void testGetRentalListEmptyInitially() {
		assertTrue(student.getRentalList().isEmpty());
	}

	@Test
	public void testAddToRentalList() {
		// Ensure the item with ID "003" exists in the ItemRepo
		assertNotNull("Item with ID '003' should exist in ItemRepo", ItemRepo.getItemById("003"));

		RentalTransaction rental = new RentalTransaction(1, 1, "003", LocalDate.now(), LocalDate.now().plusDays(30),
				0.0, false);
		student.addToRentalList(rental);
		assertEquals(1, student.getRentalList().size());
	}

	@Test
	public void testRemoveFromRentalList() {
		RentalTransaction rental = new RentalTransaction(1, 1, "003", LocalDate.now(), LocalDate.now().plusDays(30),
				0.0, false);
		student.addToRentalList(rental);
		student.removeFromRentalList(rental);
		assertTrue(student.getRentalList().isEmpty());
	}

	@Test
	public void testRentalListSizeAfterMultipleAdditions() {
		student.addToRentalList(
				new RentalTransaction(1, 1, "003", LocalDate.now(), LocalDate.now().plusDays(30), 0.0, false));
		student.addToRentalList(
				new RentalTransaction(2, 1, "004", LocalDate.now(), LocalDate.now().plusDays(15), 0.0, false));
		assertEquals(2, student.getRentalList().size());
	}

	@Test
	public void testComprehensiveReportExecution() {
		// Assuming comprehensiveReport() method prints a report to the console
		// This test checks if the method can execute without throwing an exception
		student.comprehensiveReport();
		assertTrue(true); // Pass if no exception is thrown
	}

	@Test
	public void testChangeMajorAgain() throws IOException {
		student.setMajor("Biology");
		assertEquals("Biology", student.getMajor());
	}

	@Test
	public void testRentalListNotEmptyAfterAdding() {
		RentalTransaction rental = new RentalTransaction(2, 1, "004", LocalDate.now(), LocalDate.now().plusDays(20),
				0.0, false);
		student.addToRentalList(rental);
		assertFalse(student.getRentalList().isEmpty());
	}

	@Test
	public void testChangeYearAgain() throws IOException {
		student.setYear(2);
		assertEquals(2, student.getYear());
	}

	// You can add more tests here to cover further functionality as needed.
}
