package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Item;
import itemManagement.Rental;
import itemManagement.RentalManagement;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class RentalManagementTest {
	private RentalManagement rentalManagement;
	private String userID = "user123";
	private Rental rental1, rental2;

	@Before
	public void setUp() {
		rentalManagement = new RentalManagement(userID);
		// Sample rental items setup
		Item item1 = new Item("item1", "Book1");
		Item item2 = new Item("item2", "Book2");
		Date rentDate = new Date();
		Date dueDate = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000); // Due in one week
		rental1 = new Rental(item1, rentDate, dueDate);
		rental2 = new Rental(item2, rentDate, dueDate);
	}

	@Test
	public void testConstructor() {
		assertEquals("UserID should be set correctly", userID, rentalManagement.getUserID());
		assertTrue("Rented items list should be empty initially", rentalManagement.listRentedItems().isEmpty());
	}

	@Test
	public void testAddRentalItem() {
		// Assuming addRental method is implemented in the RentalManagement class
		rentalManagement.addRental(rental1);

		List<Rental> rentedItems = rentalManagement.listRentedItems();
		assertFalse("Rented items list should not be empty after adding an item", rentedItems.isEmpty());
		assertEquals("Rented items list should contain 1 item", 1, rentedItems.size());
	}

	@Test
	public void testListRentedItems() {
		rentalManagement.addRental(rental1);
		rentalManagement.addRental(rental2);
		List<Rental> rentedItems = rentalManagement.listRentedItems();
		assertEquals("Expected 2 rented items", 2, rentedItems.size());
	}

	@Test
	public void testSelectRentedItemFound() {
		// Ensure the rental item is added to the internal list through the appropriate
		// method
		rentalManagement.addRental(rental1);
		// Now attempt to select the rental item
		Rental selectedRental = rentalManagement.selectRentedItem("item1");
		assertNotNull("Selected rental should not be null", selectedRental);
		assertEquals("Selected item ID should match", "item1", selectedRental.getItem().getId());
	}

	@Test
	public void testSelectRentedItemNotFound() {
		assertNull("Selecting a non-existent item should return null",
				rentalManagement.selectRentedItem("nonExistentID"));
	}

	@Test
	public void testDisplayDueDates() {
		rentalManagement.listRentedItems().add(rental1);
		rentalManagement.listRentedItems().add(rental2);
		// This test assumes the method prints to the console. In a real test, you'd
		// capture stdout or refactor to be more testable.
		rentalManagement.displayDueDates();
	}

	@Test
	public void testDisplayRentalDetails() {
		rentalManagement.listRentedItems().add(rental1);
		// Similarly, this assumes console output. Actual testing might need a different
		// approach.
		rentalManagement.displayRentalDetails(rental1);
	}

	@Test
	public void testSetUserID() {
		String newUserID = "newUser123";
		rentalManagement.setUserID(newUserID);
		assertEquals("UserID should be updated", newUserID, rentalManagement.getUserID());
	}

	@Test
	public void testRentalItemRemoval() {
		rentalManagement.listRentedItems().add(rental1);
		rentalManagement.listRentedItems().remove(rental1);
		assertTrue("Rented items list should be empty after removing the item",
				rentalManagement.listRentedItems().isEmpty());
	}

	@Test
	public void testDueDateExtension() {
		rentalManagement.listRentedItems().add(rental1);
		Date newDueDate = new Date(rental1.getDueDate().getTime() + 3 * 24 * 60 * 60 * 1000); // Extend due date by 3
																								// days
		rental1.setDueDate(newDueDate);
		assertEquals("Due date should be extended", newDueDate, rental1.getDueDate());
	}

	@Test
	public void testEmptyRentalListAfterUserIDChange() {
		rentalManagement.listRentedItems().add(rental1);
		rentalManagement.setUserID("newUser123");
		assertTrue("Rented items list should be empty after changing the userID",
				rentalManagement.listRentedItems().isEmpty());
	}

	@Test
	public void testRentalListImmutableFromOutside() {
		List<Rental> externalList = rentalManagement.listRentedItems();
		externalList.add(rental1);
		assertTrue("Changes to external list should not affect internal rented items list",
				rentalManagement.listRentedItems().isEmpty());
	}
}
