package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Course;
import itemManagement.DigitalItem;

import static org.junit.Assert.*;

public class CourseTest {
	private Course course;
	private String courseID = "CS101";
	private String courseName = "Introduction to Computer Science";

	@Before
	public void setUp() {
		course = new Course(courseID, courseName);
	}

	@Test
	public void testConstructorNotNull() {
		assertNotNull("Course object should not be null after construction", course);
	}

	@Test
	public void testGetCourseID() {
		assertEquals("Course ID should match the one provided at construction", courseID, course.getCourseID());
	}

	@Test
	public void testGetCourseName() {
		assertEquals("Course name should match the one provided at construction", courseName, course.getCourseName());
	}

	@Test
	public void testCourseNameNotEmpty() {
		assertNotEquals("Course name should not be empty", "", course.getCourseName().trim());
	}

	@Test
	public void testCourseIDNotEmpty() {
		assertNotEquals("Course ID should not be empty", "", course.getCourseID().trim());
	}

	@Test
	public void testCourseImplementsDigitalItem() {
		assertTrue("Course should implement DigitalItem interface", course instanceof DigitalItem);
	}

	@Test
	public void testSetCourseID() {
		String newID = "CS102";
		course.setCourseID(newID);
		assertEquals("setCourseID should update the course ID", newID, course.getCourseID());
	}

	@Test
	public void testSetCourseName() {
		String newName = "Data Structures";
		course.setCourseName(newName);
		assertEquals("setCourseName should update the course name", newName, course.getCourseName());
	}

	@Test
	public void testCourseIDCaseSensitivity() {
		String lowerCaseID = "cs101";
		course.setCourseID(lowerCaseID);
		assertEquals("Course ID should be case-sensitive", lowerCaseID, course.getCourseID());
	}

	@Test
	public void testCourseNameCaseSensitivity() {
		String lowerCaseName = "introduction to computer science";
		course.setCourseName(lowerCaseName);
		assertEquals("Course name should be case-sensitive", lowerCaseName, course.getCourseName());
	}

	@Test
	public void testCourseIDIntegrity() {
		String originalID = course.getCourseID();
		course.setCourseID("CS102");
		assertNotEquals("Changing the course ID should not match the original", originalID, course.getCourseID());
	}

	@Test
	public void testCourseNameIntegrity() {
		String originalName = course.getCourseName();
		course.setCourseName("Data Structures");
		assertNotEquals("Changing the course name should not match the original", originalName, course.getCourseName());
	}
}
