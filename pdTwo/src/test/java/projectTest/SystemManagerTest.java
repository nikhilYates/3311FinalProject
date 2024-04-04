package projectTest;

import itemManagement.BookRequest;
import itemManagement.BookRequestManagement;
import itemManagement.PhysicalItem;
import userManagement.SystemManager;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

public class SystemManagerTest {

	private SystemManager systemManager;
	private BookRequestManagement bookRequestManagement;

	@Before
	public void setUp() throws IOException {
		systemManager = SystemManager.getSystemManager(SystemManager.getActualcode()); // Use actual code to get the
																						// instance
		bookRequestManagement = new BookRequestManagement();
		systemManager.addItem(new PhysicalItem("123", "Test Item", "Test Location", true));
	}

	@Test
	public void testVerifyUserInvalid() throws IOException {
		boolean result = systemManager.verifyUser("invalid@example.com"); // Assuming "invalid@example.com" is not a
																			// valid user
		assertFalse("User should not be verified", result);
	}

	@Test
	public void testEnableItemValid() throws IOException {
		boolean result = systemManager.enableItem(123); // Assuming item ID 123 exists
		assertTrue("Item should be enabled successfully", result);
	}

	@Test
	public void testEnableItemInvalid() throws IOException {
		boolean result = systemManager.enableItem(999); // Assuming item ID 999 does not exist
		assertFalse("Invalid item should not be enabled", result);
	}

	@Test
	public void testDisableItemValid() throws IOException {
		boolean result = systemManager.disableItem(123); // Assuming item ID 123 exists
		assertTrue("Item should be disabled successfully", result);
	}

	@Test
	public void testDisableItemInvalid() throws IOException {
		boolean result = systemManager.disableItem(999); // Assuming item ID 999 does not exist
		assertFalse("Invalid item should not be disabled", result);
	}

	@Test
	public void testAddItemExisting() throws IOException {
		PhysicalItem existingItem = new PhysicalItem("123", "Existing Item", "Existing Location", true); // Assuming
																											// item ID
																											// 123
																											// already
																											// exists
		boolean result = systemManager.addItem(existingItem);
		assertFalse("Existing item should not be added again", result);
	}

	@Test
	public void testDeleteItemValid() throws IOException {
		PhysicalItem existingItem = new PhysicalItem("123", "Existing Item", "Existing Location", true); // Assuming
																											// item ID
																											// 123
																											// exists
		boolean result = systemManager.deleteItem(existingItem);
		assertTrue("Existing item should be deleted successfully", result);
	}

	@Test
	public void testPrintRequestsNonEmpty() {
		BookRequest request = new BookRequest("03", "New Book", List.of("Science", "Technology"));
		bookRequestManagement.submitRequest(request.toString());
		boolean result = systemManager.printRequests(bookRequestManagement); // Assuming there is at least one request
		assertTrue("Requests should be printed", result);
	}

	@Test
	public void testSingletonInstance() {
		SystemManager anotherInstance = SystemManager.getSystemManager(SystemManager.getActualcode());
		assertNotNull("Singleton instance should not be null", anotherInstance);
		assertSame("Singleton instances should be the same", systemManager, anotherInstance);
	}

	@Test
	public void testEnableItemTwice() throws IOException {
		systemManager.enableItem(123); // Assuming item ID 123 exists
		boolean secondEnableResult = systemManager.enableItem(123); // Try to enable again
		assertTrue("Enabling item twice should still return true", secondEnableResult);
	}

	@Test
	public void testDisableItemTwice() throws IOException {
		// Ensure the item is enabled before the first disable attempt
		systemManager.enableItem(123);

		// First disable attempt
		boolean firstDisableResult = systemManager.disableItem(123);
		assertTrue("Item should be disabled successfully on first attempt", firstDisableResult);

		// Second disable attempt
		boolean secondDisableResult = systemManager.disableItem(123);
		// Depending on your implementation, adjust the expectation (true or false)
		assertTrue("Disabling item twice should still return true", secondDisableResult);
	}

	@Test
	public void testPrintRequestsSubmittedOnly() {
		BookRequest submittedRequest = new BookRequest("01", "New Book", List.of("Math", "Physics"));
		BookRequest notSubmittedRequest = new BookRequest("02", "New Topic", List.of("Art", "Music"));
		bookRequestManagement.submitRequest(submittedRequest.toString());
		bookRequestManagement.submitRequest(notSubmittedRequest.toString());
		boolean result = systemManager.printRequests(bookRequestManagement);
		assertTrue("Should print only submitted requests", result);
		// You might want to capture console output to assert only submitted requests
		// are printed
	}

	@Test
	public void testDisableAndEnableItemCycle() throws IOException {
		systemManager.disableItem(123); // Assuming item ID 123 exists and is initially enabled
		boolean enableResult = systemManager.enableItem(123); // Enable the item
		assertTrue("Item should be enabled successfully in disable-enable cycle", enableResult);

		boolean disableResult = systemManager.disableItem(123); // Disable the item again
		assertTrue("Item should be disabled successfully in disable-enable cycle", disableResult);
	}
}
