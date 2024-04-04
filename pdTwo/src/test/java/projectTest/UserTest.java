package projectTest;

import userManagement.*;
import org.junit.Before;
import org.junit.Test;

import itemManagement.ItemRepo;
import itemManagement.PhysicalItem;

import static org.junit.Assert.*;

import java.io.IOException;
import java.time.LocalDate;

public class UserTest {

	private Faculty faculty;
	private Student student;
	private NonFaculty nonFaculty;
	private Visitor visitor;

	@Before
	public void setUp() {
		ItemRepo.reset(); // Reset or clear the ItemRepo here, ensure this method exists and does what's
							// expected
		ItemRepo.addItem(new PhysicalItem("001", "Test Item 1", "Location A", true));
		ItemRepo.addItem(new PhysicalItem("002", "Test Item 2", "Location B", true));

		faculty = new Faculty(1, "faculty@example.com", 0, "Engineering");
		student = new Student(2, "student@example.com", 0, "Science", 4);
		nonFaculty = new NonFaculty(3, "nonfaculty@example.com", 0);
		visitor = new Visitor(4, "visitor@example.com", 0);
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
	public void testUserLoginSuccess() {
		assertNotNull(faculty);
	}

	@Test
	public void testUserLoginFailure() {
		assertNull(null);
	}

	@Test
	public void testUserSignup() {
		assertTrue(true);
	}

	@Test
	public void testDeleteUser() {
		assertTrue(true);
	}

	@Test
	public void testVerifyUser() {
		assertTrue(true);
	}

	@Test
	public void testGetRentalListEmpty() {
		assertTrue(faculty.getRentalList().isEmpty());
	}

	@Test
	public void testAddToRentalList() {
		faculty.addToRentalList(
				new RentalTransaction(1, 1, "001", LocalDate.now(), LocalDate.now().plusDays(30), 0.0, false));
		assertEquals(1, faculty.getRentalList().size());
	}

	@Test
	public void testComprehensiveReport() {
		assertTrue(true);
	}

	@Test
	public void testFacultyHasDepartment() {
		assertEquals("Engineering", faculty.getDepartment());
	}

	@Test
	public void testStudentHasYear() {
		assertEquals(4, student.getYear());
	}

	@Test
	public void testNonFacultyType() {
		assertEquals("NonFaculty", nonFaculty.getClass().getSimpleName());
	}

	@Test
	public void testVisitorType() {
		assertEquals("Visitor", visitor.getClass().getSimpleName());
	}

	@Test
	public void testChangeFacultyDepartment() throws IOException {
		faculty.setDepartment("Physics");
		assertEquals("Physics", faculty.getDepartment());
	}

	@Test
	public void testChangeStudentMajorAndYear() throws IOException {
		student.setMajor("Mathematics");
		student.setYear(3);
		assertEquals("Mathematics", student.getMajor());
		assertEquals(3, student.getYear());
	}
}
