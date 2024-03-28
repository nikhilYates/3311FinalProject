package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Course;
import itemManagement.CourseManagement;
import itemManagement.Textbook;

import static org.junit.Assert.*;

public class CourseManagementTest {
	private CourseManagement courseManagement;
	private String facultyID = "faculty123";

	@Before
	public void setUp() {
		courseManagement = new CourseManagement(facultyID);
	}

	@Test
	public void testConstructor() {
		assertEquals(facultyID, courseManagement.getFacultyID());
		assertTrue(courseManagement.getCoursesTaught().isEmpty());
		assertTrue(courseManagement.getTextbooksUsed().isEmpty());
	}

	@Test
	public void testAddCourse() {
		Course course = new Course("CS101", "Intro to CS");
		courseManagement.getCoursesTaught().add(course);
		assertFalse(courseManagement.getCoursesTaught().isEmpty());
		assertEquals(1, courseManagement.getCoursesTaught().size());
		assertEquals(course, courseManagement.getCoursesTaught().get(0));
	}

	@Test
	public void testAddTextbook() {
		Textbook textbook = new Textbook("TB101", "Algorithms");
		courseManagement.getTextbooksUsed().add(textbook);
		assertFalse(courseManagement.getTextbooksUsed().isEmpty());
		assertEquals(1, courseManagement.getTextbooksUsed().size());
		assertEquals(textbook, courseManagement.getTextbooksUsed().get(0));
	}

	@Test
	public void testRemoveCourse() {
		Course course = new Course("CS101", "Intro to CS");
		courseManagement.getCoursesTaught().add(course);
		courseManagement.getCoursesTaught().remove(course);
		assertTrue(courseManagement.getCoursesTaught().isEmpty());
	}

	@Test
	public void testRemoveTextbook() {
		Textbook textbook = new Textbook("TB101", "Algorithms");
		courseManagement.getTextbooksUsed().add(textbook);
		courseManagement.getTextbooksUsed().remove(textbook);
		assertTrue(courseManagement.getTextbooksUsed().isEmpty());
	}

	@Test
	public void testNotifyNewEditions() {
		String textbookID = "TB101";
		courseManagement.notifyNewEditions(textbookID);
		// This test should check the output to the console, but since capturing console
		// output in JUnit is non-trivial,
		// we're acknowledging the call here. In a real test, consider using a Logger
		// and verifying the log output.
	}

	@Test
	public void testNotifyUnavailability() {
		String textbookID = "TB101";
		courseManagement.notifyUnavailability(textbookID);
		// Similar to testNotifyNewEditions, this test should ideally verify console
		// output or log messages.
	}

	@Test
	public void testTrackCourses() {
		courseManagement.trackCourses(facultyID);
		// Assuming trackCourses should modify coursesTaught based on the facultyID.
		// Since the method's implementation is not given,
		// this is a placeholder for when the method is implemented.
	}

	@Test
	public void testFacultyIDGetter() {
		assertEquals(facultyID, courseManagement.getFacultyID());
	}

	@Test
	public void testCoursesTaughtGetter() {
		assertNotNull(courseManagement.getCoursesTaught());
	}

	@Test
	public void testTextbooksUsedGetter() {
		assertNotNull(courseManagement.getTextbooksUsed());
	}

	@Test
	public void testCoursesTaughtListIsMutable() {
		Course course1 = new Course("CS101", "Intro to CS");
		Course course2 = new Course("CS102", "Data Structures");
		courseManagement.getCoursesTaught().add(course1);
		courseManagement.getCoursesTaught().add(course2);
		assertEquals(2, courseManagement.getCoursesTaught().size());
	}

	@Test
	public void testTextbooksUsedListIsMutable() {
		Textbook textbook1 = new Textbook("TB101", "Algorithms");
		Textbook textbook2 = new Textbook("TB102", "Data Mining");
		courseManagement.getTextbooksUsed().add(textbook1);
		courseManagement.getTextbooksUsed().add(textbook2);
		assertEquals(2, courseManagement.getTextbooksUsed().size());
	}
}
