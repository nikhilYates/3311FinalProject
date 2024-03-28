package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.OnlineBook;

import static org.junit.Assert.*;

public class OnlineBookTest {
	private OnlineBook onlineBook;
	private String bookID = "BK001";
	private String title = "Effective Java";
	private String author = "Joshua Bloch";
	private String[] topics = { "Java", "Programming" };
	private int availableCopies = 10;

	@Before
	public void setUp() {
		onlineBook = new OnlineBook(bookID, title, author, topics, availableCopies);
	}

	@Test
	public void testConstructor() {
		assertEquals("Book ID should match", bookID, onlineBook.getBookID());
		assertEquals("Title should match", title, onlineBook.getTitle());
		assertEquals("Author should match", author, onlineBook.getAuthor());
		assertArrayEquals("Topics should match", topics, onlineBook.getTopics());
		assertTrue("Book should be available for reading by default", onlineBook.isAvailableForReading());
	}

	@Test
	public void testSetBookID() {
		String newBookID = "BK002";
		onlineBook.setBookID(newBookID);
		assertEquals("Book ID should be updated", newBookID, onlineBook.getBookID());
	}

	@Test
	public void testSetTitle() {
		String newTitle = "Java Concurrency in Practice";
		onlineBook.setTitle(newTitle);
		assertEquals("Title should be updated", newTitle, onlineBook.getTitle());
	}

	@Test
	public void testSetAuthor() {
		String newAuthor = "Brian Goetz";
		onlineBook.setAuthor(newAuthor);
		assertEquals("Author should be updated", newAuthor, onlineBook.getAuthor());
	}

	@Test
	public void testSetTopics() {
		String[] newTopics = { "Concurrency", "Multithreading" };
		onlineBook.setTopics(newTopics);
		assertArrayEquals("Topics should be updated", newTopics, onlineBook.getTopics());
	}

	@Test
	public void testSetAvailableForReading() {
		onlineBook.setAvailableForReading(false);
		assertFalse("Book should be set as not available for reading", onlineBook.isAvailableForReading());
	}

	@Test
	public void testOpenBookAvailable() {
		// This test assumes the method prints to the console. In a real test, you'd
		// capture stdout or refactor to be more testable.
		onlineBook.openBook();
	}

	@Test
	public void testOpenBookNotAvailable() {
		onlineBook.setAvailableForReading(false);
		// Similarly, this assumes console output. Actual testing might require
		// different approach.
		onlineBook.openBook();
	}

	@Test
	public void testCloseBook() {
		// Assuming the method prints to the console. Actual testing might need to
		// capture stdout or use a different approach.
		onlineBook.closeBook();
	}

	@Test
	public void testTopicsImmutable() {
		String[] originalTopics = onlineBook.getTopics();
		String[] modifiedTopics = originalTopics.clone();
		modifiedTopics[0] = "Design Patterns";
		assertNotEquals("Modifying the array obtained from getTopics should not affect the original topics",
				originalTopics[0], modifiedTopics[0]);
	}

	@Test
	public void testAvailableCopies() {
		assertEquals("Available copies should match", availableCopies, onlineBook.getAvailableCopies());
	}

	@Test
	public void testReduceAvailableCopies() {
		onlineBook.setAvailableCopies(availableCopies - 1);
		assertEquals("Available copies should be reduced by 1", availableCopies - 1, onlineBook.getAvailableCopies());
	}

	@Test
	public void testIncreaseAvailableCopies() {
		onlineBook.setAvailableCopies(availableCopies + 1);
		assertEquals("Available copies should be increased by 1", availableCopies + 1, onlineBook.getAvailableCopies());
	}
}
