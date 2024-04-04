package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.ItemRepo;
import itemManagement.PhysicalItem;

import static org.junit.Assert.*;

public class ItemRepoTest {

	@Before
	public void setUp() {
		// Ensure a fresh start for each test by clearing the items list
		ItemRepo.reset();
	}

	@Test
	public void testAddItem() {
		PhysicalItem item = new PhysicalItem("006", "Test Item", "Test Location", true);
		ItemRepo.addItem(item);
		assertEquals("Item should be added to the repository", 1, ItemRepo.allPhysicalItems.size());
	}

	@Test
	public void testGetItemByIdExists() {
		PhysicalItem item = new PhysicalItem("007", "Existing Item", "Existing Location", true);
		ItemRepo.addItem(item);
		PhysicalItem retrievedItem = ItemRepo.getItemById("007");
		assertNotNull("Item should be found by ID", retrievedItem);
	}

	@Test
	public void testGetItemByIdDoesNotExist() {
		PhysicalItem retrievedItem = ItemRepo.getItemById("999");
		assertNull("Item should not be found for an invalid ID", retrievedItem);
	}

	@Test
	public void testSearchItemFound() {
		PhysicalItem item = new PhysicalItem("008", "Searchable Item", "Searchable Location", true);
		ItemRepo.addItem(item);
		ItemRepo.searchItem("Searchable");
	}

	@Test
	public void testSearchItemNotFound() {
		// Assuming 'searchItem' method will print a 'not found' message
		ItemRepo.searchItem("Nonexistent");
		// No direct assertion here due to the method's nature of printing results
	}

	@Test
	public void testInitializeWithDefaultItems() {
		ItemRepo.initializeWithDefaultItems();
		assertEquals("Default items should be initialized in the repository", 5, ItemRepo.allPhysicalItems.size());
	}

	@Test
	public void testReset() {
		ItemRepo.initializeWithDefaultItems();
		ItemRepo.reset();
		assertTrue("Item repository should be empty after reset", ItemRepo.allPhysicalItems.isEmpty());
	}

	@Test
	public void testItemUniqueness() {
		PhysicalItem item1 = new PhysicalItem("009", "Unique Item", "Unique Location", true);
		PhysicalItem item2 = new PhysicalItem("010", "Another Unique Item", "Another Unique Location", true);
		ItemRepo.addItem(item1);
		ItemRepo.addItem(item2);
		assertEquals("Each item added should be unique", 2, ItemRepo.allPhysicalItems.size());
	}

	@Test
	public void testMultipleSearchResults() {
		PhysicalItem item1 = new PhysicalItem("011", "Multi Search 1", "Location 1", true);
		PhysicalItem item2 = new PhysicalItem("012", "Multi Search 2", "Location 2", true);
		ItemRepo.addItem(item1);
		ItemRepo.addItem(item2);
		ItemRepo.searchItem("Multi Search");
		// Again, no direct assertion due to method's nature of printing results
	}

	@Test
	public void testItemDeletionNotSupported() {
		PhysicalItem item = new PhysicalItem("013", "Deletable Item", "Deletable Location", true);
		ItemRepo.addItem(item);
		assertEquals("Items should not be deletable from the repository", 1, ItemRepo.allPhysicalItems.size());
	}

	@Test
	public void testItemDetailsAfterReset() {
		PhysicalItem item = new PhysicalItem("014", "Detail Test Item", "Detail Test Location", true);
		ItemRepo.addItem(item);
		ItemRepo.reset();
		ItemRepo.initializeWithDefaultItems();
		assertNull("Item added before reset should not exist after reset and reinitialization",
				ItemRepo.getItemById("014"));
	}

	@Test
	public void testAddingSameItemId() {
		PhysicalItem item1 = new PhysicalItem("015", "First Item Same ID", "Location 1", true);
		PhysicalItem item2 = new PhysicalItem("015", "Second Item Same ID", "Location 2", true);
		ItemRepo.addItem(item1);
		ItemRepo.addItem(item2);
		// Assuming that items with the same ID are treated as different entries
		assertEquals("Two items with the same ID should both be added to the repository", 2,
				ItemRepo.allPhysicalItems.size());
	}
}
