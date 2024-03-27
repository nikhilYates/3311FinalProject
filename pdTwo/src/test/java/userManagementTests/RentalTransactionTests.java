package userManagementTests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

import userManagement.RentalTransaction;

class RentalTransactionTests {

	@Test
	public void testRentalTransactionConstruction() {
	    LocalDate rentalDate = LocalDate.of(2023, 3, 1);
	    // dueDate is 30 days after rental date
	    LocalDate dueDate = LocalDate.of(2023, 3, 31);
	    RentalTransaction transaction = new RentalTransaction(3, "user1", "item1", rentalDate, dueDate, 0, false);
	    assertNotNull(transaction);
	    assertEquals(3, transaction.getTransactionID());
	    assertEquals("user1", transaction.getUserid());
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
	    RentalTransaction transaction = new RentalTransaction(1, "s001", "001", rentalDate, dueDate, 0, false);
	    
	    // what the late penalty should be
	    double latePenalty = 0.50 * ChronoUnit.DAYS.between(dueDate, currentDate);

	    // check the expected late penalty with the actual late penalty
	    assertEquals(latePenalty, transaction.getLatePenalty());
	    
	}
	
	@Test
	public void testLatePenaltyOnDueDate() {
		
		LocalDate rentalDate = LocalDate.of(2024, 4, 1);
		LocalDate dueDate = rentalDate.plusDays(30);
		
		RentalTransaction transaction = new RentalTransaction(2, "s001", "001", rentalDate, dueDate, 0, false);
		
		assertEquals(0, transaction.getLatePenalty());
	}
	

	



}
