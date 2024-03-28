package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Textbook;

import static org.junit.Assert.*;

public class TextbookTest {

	private Textbook textbook;

	@Before
	public void setUp() {
		textbook = new Textbook("TB001", "Introduction to Programming");
	}

	@Test
	public void testTextbookID() {
		assertEquals("Textbook ID should be TB001", "TB001", textbook.getTextbookID());
	}

	@Test
	public void testTitle() {
		assertEquals("Title should be Introduction to Programming", "Introduction to Programming", textbook.getTitle());
	}

	@Test
	public void testTextbookIDNotNull() {
		assertNotNull("Textbook ID should not be null", textbook.getTextbookID());
	}

	@Test
	public void testTitleNotNull() {
		assertNotNull("Title should not be null", textbook.getTitle());
	}

	@Test
	public void testTextbookIDNotEmpty() {
		assertFalse("Textbook ID should not be empty", textbook.getTextbookID().isEmpty());
	}

	@Test
	public void testTitleNotEmpty() {
		assertFalse("Title should not be empty", textbook.getTitle().isEmpty());
	}

	@Test
	public void testTextbookIDAndTitleNotNull() {
		Textbook textbook = new Textbook("TB001", "Introduction to Algorithms");
		assertNotNull("Textbook ID should not be null", textbook.getTextbookID());
		assertNotNull("Textbook title should not be null", textbook.getTitle());
	}

	@Test
	public void testTextbookIDIsConsistent() {
		String expectedID = "TB001";
		Textbook textbook = new Textbook(expectedID, "Introduction to Algorithms");
		assertEquals("Textbook ID should remain consistent", expectedID, textbook.getTextbookID());
	}

	@Test
	public void testTextbookEquality() {
		Textbook textbook1 = new Textbook("TB001", "Introduction to Algorithms");
		Textbook textbook2 = new Textbook("TB001", "Introduction to Algorithms");
		assertEquals("Two textbooks with the same ID and title should be equal", textbook1, textbook2);
	}

	@Test
	public void testTitleIsConsistent() {
		String expectedTitle = "Introduction to Algorithms";
		Textbook textbook = new Textbook("TB001", expectedTitle);
		assertEquals("Title should remain consistent", expectedTitle, textbook.getTitle());
	}

}
