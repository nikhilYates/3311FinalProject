package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Course;
import itemManagement.Textbook;
import itemManagement.TextbookAccess;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextbookAccessTest {
	private TextbookAccess textbookAccess;
	private List<Course> courses;
	private List<Textbook> textbooks;

	@Before
	public void setUp() {
		textbookAccess = new TextbookAccess("student123");
		courses = new ArrayList<>(
				Arrays.asList(new Course("CS101", "Intro to CS"), new Course("CS102", "Data Structures")));
		textbooks = new ArrayList<>(Arrays.asList(new Textbook("TB101", "Intro to CS Textbook"),
				new Textbook("TB102", "Data Structures Textbook")));
		textbookAccess.setCoursesEnrolled(courses);
		textbookAccess.setTextbooks(textbooks);
	}

	@Test
	public void testGetStudentID() {
		assertEquals("Student ID should match", "student123", textbookAccess.getStudentID());
	}

	@Test
	public void testListMyCourses() {
		assertEquals("Should list all enrolled courses", courses, textbookAccess.listMyCourses("student123"));
	}

	@Test
	public void testListTextbooks() {
		assertEquals("Should list all textbooks for a course", textbooks, textbookAccess.listTextbooks("CS101"));
	}

	@Test
	public void testAccessTextbook() {
		// This test checks the console output, you might need a different approach to
		// test this functionality
		textbookAccess.accessTextbook("TB101");
	}

	@Test
	public void testRemoveAccess() {
		textbookAccess.removeAccess(textbooks.get(0));
		assertFalse("Textbook should be removed from the list",
				textbookAccess.getTextbooks().contains(textbooks.get(0)));
	}

	@Test
	public void testSetCoursesEnrolled() {
		List<Course> newCourses = Arrays.asList(new Course("CS103", "Algorithms"));
		textbookAccess.setCoursesEnrolled(newCourses);
		assertEquals("Courses should be updated", newCourses, textbookAccess.getCoursesEnrolled());
	}

	@Test
	public void testSetTextbooks() {
		List<Textbook> newTextbooks = Arrays.asList(new Textbook("TB103", "Algorithms Textbook"));
		textbookAccess.setTextbooks(newTextbooks);
		assertEquals("Textbooks should be updated", newTextbooks, textbookAccess.getTextbooks());
	}

	@Test
	public void testCoursesEnrolledNotEmpty() {
		assertFalse("Courses enrolled list should not be empty", textbookAccess.getCoursesEnrolled().isEmpty());
	}

	@Test
	public void testTextbooksNotEmpty() {
		assertFalse("Textbooks list should not be empty", textbookAccess.getTextbooks().isEmpty());
	}

	@Test
	public void testAccessNonexistentTextbook() {
		// Assuming there's a way to check if the textbook was not accessed, e.g.,
		// through a flag or method
	}

	@Test
	public void testRemoveNonexistentTextbook() {
		Textbook nonexistentTextbook = new Textbook("TB999", "Nonexistent Textbook");
		textbookAccess.removeAccess(nonexistentTextbook);
		// Assuming there's a way to verify that the removal did not affect the
		// textbooks list
	}

	@Test
	public void testTextbookAccessAfterRemoval() {
		textbookAccess.removeAccess(textbooks.get(0));
		// Assuming there's a way to check that the textbook is no longer accessible
	}
}
