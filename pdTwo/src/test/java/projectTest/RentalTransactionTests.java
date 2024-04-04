package projectTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

import org.junit.jupiter.api.Test;

import userManagement.CommonUserOperations;
import userManagement.RentalTransaction;

class RentalTransactionTests {

	@Test
	public void testRentalTransactionConstruction() {
		LocalDate rentalDate = LocalDate.of(2023, 3, 1);
		LocalDate dueDate = LocalDate.of(2023, 3, 31);
		RentalTransaction transaction = new RentalTransaction(3, 1, "item1", rentalDate, dueDate, 0, false);
		assertNotNull(transaction);
		assertEquals(3, transaction.getTransactionID());
		assertEquals(1, transaction.getUserid()); // Changed "user1" to 1 to match the expected integer type
		assertEquals("item1", transaction.getItemid());
		assertEquals(rentalDate, transaction.getRentalDate());
		assertEquals(dueDate, transaction.getDueDate());
		assertFalse(transaction.isReturned());
	}

	@Test
	public void testLatePenaltyBeforeDueDate() {
		LocalDate rentalDate = LocalDate.of(2023, 8, 1);
		LocalDate dueDate = rentalDate.plusDays(30);
		LocalDate currentDate = LocalDate.now();

		// create rental transaction instance
		RentalTransaction transaction = new RentalTransaction(1, 2, "001", rentalDate, dueDate, 0, false);

		// what the late penalty should be
		double latePenalty = 0.50 * ChronoUnit.DAYS.between(dueDate, currentDate);

		// check the expected late penalty with the actual late penalty
		assertEquals(latePenalty, transaction.getLatePenalty());

	}

	@Test
	public void testLatePenaltyOnDueDate() {

		LocalDate rentalDate = LocalDate.of(2024, 4, 1);
		LocalDate dueDate = rentalDate.plusDays(30);

		RentalTransaction transaction = new RentalTransaction(2, 2, "001", rentalDate, dueDate, 0, false);

		assertEquals(0, transaction.getLatePenalty());
	}

	@Test
	public void testReturnedItemAttributeUpdate() {

		CommonUserOperations ops = new CommonUserOperations();

		List<RentalTransaction> testRentalList = new ArrayList<>();

		RentalTransaction t1 = new RentalTransaction(1, 1, "001", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 31),
				0, false);
		RentalTransaction t2 = new RentalTransaction(2, 1, "002", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 31),
				0, false);
		RentalTransaction t3 = new RentalTransaction(3, 1, "003", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 31),
				0, false);
		RentalTransaction t4 = new RentalTransaction(4, 1, "004", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 31),
				0, false);

		testRentalList.add(t1);
		testRentalList.add(t2);
		testRentalList.add(t3);
		testRentalList.add(t4);

		// make sure that the status of the isReturned attribute has not changed
		// (default = false)
		assertEquals(false, t1.isReturned());
		assertEquals(false, t2.isReturned());
		assertEquals(false, t3.isReturned());
		assertEquals(false, t4.isReturned());

		// return an item from transaction 3
		ops.returnItem(3, testRentalList);

		// now it should show that the item has been returned but not change the rest
		assertEquals(true, t3.isReturned());
		assertEquals(false, t1.isReturned());
		assertEquals(false, t2.isReturned());
		assertEquals(false, t4.isReturned());

	}

	@Test
	public void testGetRentalDueDate() {

		LocalDate rentalDate = LocalDate.of(2024, 3, 16);

		// empty due date rental object
		RentalTransaction rental = new RentalTransaction(1, 1, "001", rentalDate, null, 0, false);

		assertEquals(LocalDate.of(2024, 4, 15), rental.getDueDate());

	}

	@Test
	public void testUpdateToLatePenalty() {

		LocalDate dueDate = LocalDate.now().minusDays(4);
		RentalTransaction rental = new RentalTransaction(1, 1, "001", dueDate.minusDays(30), dueDate, 0, false);

		assertEquals(2.0, rental.getLatePenalty());

	}

	@Test
	public void testGetUserId() {
		// Use the numeric user ID that matches the one used in the RentalTransaction
		// constructor
		int userId = 11;
		RentalTransaction rental = new RentalTransaction(1, userId, "001", LocalDate.of(2024, 3, 1),
				LocalDate.of(2024, 3, 31), 0, false);

		// Assert that the actual user ID matches the expected numeric user ID
		assertEquals(userId, rental.getUserid());
	}

	@Test
	public void testGetItemId() {

		String itemid = "006";
		RentalTransaction rental = new RentalTransaction(1, 11, null, LocalDate.of(2024, 3, 1),
				LocalDate.of(2024, 3, 31), 0, false);

		rental.setItemid(itemid);

		assertEquals(itemid, rental.getItemid());
	}

	@Test
	public void testGetRentalDate() {

		RentalTransaction rental = new RentalTransaction(1, 12, "001", null, null, 0, false);

		rental.setRentalDate(LocalDate.of(2024, 2, 28));
		assertEquals(LocalDate.of(2024, 2, 28), rental.getRentalDate());
	}

	@Test
	public void testGetDueDateFromNewRentalDate() {

		RentalTransaction rental = new RentalTransaction(1, 13, "001", null, null, 0, false);
		rental.setRentalDate(LocalDate.of(2024, 2, 28));

		// we should expect a due date of march 29 2024 since that is exactly 30 days
		// after the rental date
		assertEquals(LocalDate.of(2024, 3, 29), rental.getDueDate());
	}

}