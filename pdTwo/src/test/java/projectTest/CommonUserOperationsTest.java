package projectTest;

import userManagement.*;
import itemManagement.*;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

public class CommonUserOperationsTest {

	private CommonUserOperations operations;
	private List<RentalTransaction> rentalList;
	private Map<String, PhysicalItem> itemRepository;

	@Before
	public void setUp() {
		ItemRepo.reset();
		operations = new CommonUserOperations();
		rentalList = new ArrayList<>();
		itemRepository = new HashMap<>();

		// Initialize item repository with sample items
		itemRepository.put("001", new PhysicalItem("001", "Test Item 1", "Location A", true));
		itemRepository.put("002", new PhysicalItem("002", "Test Item 2", "Location B", true));

		// Assuming this method clears the repository and sets up initial conditions
		ItemRepo.initializeWithDefaultItems(); // Implement this method as needed
		// Ensure the item with ID "001" has less than 20 available copies before the
		// test
		PhysicalItem item = ItemRepo.getItemById("001");
		if (item != null) {
			item.setAvailableCopies(19); // Set to one less than the max for this test
		}
	}

	private RentalTransaction createRentalTransaction(String itemId, boolean isReturned) {
		LocalDate today = LocalDate.now();
		return new RentalTransaction(rentalList.size() + 1, "user01", itemId, today.minusDays(5), // Rented 5 days ago
				today.plusDays(25), // Due in 25 days
				0.0, // No late penalty
				isReturned);
	}

	@Test
	public void testRentPhysicalItem_Success() {
		RentalTransaction transaction = createRentalTransaction("001", false);
		assertTrue("The item should be rented successfully.", operations.rentPhysicalItem(transaction, rentalList));
		assertEquals("The rental list should contain the rented item.", 1, rentalList.size());
	}

	@Test
	public void testRentPhysicalItem_Failure_MaxRentals() {
		for (int i = 0; i < 10; i++) {
			rentalList.add(createRentalTransaction("002", false));
		}
		RentalTransaction transaction = createRentalTransaction("001", false);
		assertFalse("Renting should fail due to max rentals reached.",
				operations.rentPhysicalItem(transaction, rentalList));
	}

	@Test
	public void testUpdatePhysicalItemInventory_Return() {
		RentalTransaction transaction = createRentalTransaction("001", true);
		operations.updatePhysicalItemInventory(transaction, true);
		// Now the assertion should pass if the available copies are correctly
		// incremented but capped at 20
		assertEquals("The available copies should not exceed 20.", 20,
				ItemRepo.getItemById("001").getAvailableCopies());
	}

	@Test
	public void testUpdatePhysicalItemInventory_Rent() {
		PhysicalItem testItem = ItemRepo.getItemById("001");
		assertNotNull("Item should exist before test.", testItem);

		// Directly manipulate available copies before method call
		testItem.setAvailableCopies(20);

		RentalTransaction transaction = createRentalTransaction("001", false);
		operations.updatePhysicalItemInventory(transaction, false);

		// Assert available copies after method call
		assertEquals("Available copies should decrement by 1.", 19, testItem.getAvailableCopies());
	}

	@Test
	public void testCheckRentalAbility_Success() {
		assertTrue("The user should be able to rent items.", operations.checkRentalAbility(rentalList));
	}

	@Test
	public void testCheckRentalAbility_Failure_MaxRentals() {
		for (int i = 0; i < 10; i++) {
			rentalList.add(createRentalTransaction("002", false));
		}
		assertFalse("The user should not be able to rent more items.", operations.checkRentalAbility(rentalList));
	}

	@Test
	public void testCountOverdueItems_None() {
		rentalList.add(createRentalTransaction("001", false));
		List<RentalTransaction> overdueItems = operations.countOverdueItems(rentalList);
		assertTrue("There should be no overdue items.", overdueItems.isEmpty());
	}

	@Test
	public void testCountOverdueItems_Some() {
		RentalTransaction overdueTransaction = createRentalTransaction("002", false);
		overdueTransaction.setDueDate(LocalDate.now().minusDays(1)); // Set overdue
		rentalList.add(overdueTransaction);
		List<RentalTransaction> overdueItems = operations.countOverdueItems(rentalList);
		assertEquals("There should be one overdue item.", 1, overdueItems.size());
	}

	@Test
	public void testGetCurrentHardcoverRentals() {
		// Ensure the item ID matches the criterion used by getCurrentHardcoverRentals
		// to identify hardcover books
		rentalList.add(createRentalTransaction("BK001", false)); // Updated item ID to "BK001"
		List<RentalTransaction> hardcoverRentals = operations.getCurrentHardcoverRentals(rentalList);
		assertEquals("There should be one hardcover rental.", 1, hardcoverRentals.size());
	}

	@Test
	public void testRentalDueSoonPrompt_DueSoon() {
		RentalTransaction dueSoonTransaction = createRentalTransaction("001", false);
		// Set the due date to be less than 24 hours away, using LocalDateTime for more
		// precise control
		dueSoonTransaction.setDueDate(LocalDateTime.now().plusHours(23).toLocalDate()); // Assuming setDueDate accepts
																						// LocalDate
		assertTrue("The rental should be considered due soon.", operations.rentalDueSoonPrompt(dueSoonTransaction));
	}

	@Test
	public void testRentalDueSoonPrompt_NotDueSoon() {
		RentalTransaction notDueSoonTransaction = createRentalTransaction("001", false);
		assertFalse("The rental is not due soon.", operations.rentalDueSoonPrompt(notDueSoonTransaction));
	}

	@Test
	public void testCalculateLateFees_None() {
		rentalList.add(createRentalTransaction("001", false));
		assertEquals("There should be no late fees.", 0.0, operations.calculateLateFees(rentalList), 0.01);
	}

	@Test
	public void testCalculateLateFees_Some() {
		RentalTransaction lateTransaction = createRentalTransaction("002", false);
		lateTransaction.setLatePenalty(5.0); // Set late penalty
		rentalList.add(lateTransaction);
		assertEquals("The total late fees should be calculated.", 5.0, operations.calculateLateFees(rentalList), 0.01);
	}
}
