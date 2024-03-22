package main;
import java.time.LocalDate;
import java.util.*;

import itemManagement.*;
import userManagement.*;


public class Main {

	
	public static void main(String[] args) {
		
		
		ItemRepo.addItem(new PhysicalItem("001", "The Great Gatsby", "Shelf A1", true));
		ItemRepo.addItem(new PhysicalItem("002", "1984", "Shelf B2", false));
		ItemRepo.addItem(new PhysicalItem("003", "To Kill a Mockingbird", "Shelf C3", true));
		ItemRepo.addItem(new PhysicalItem("004", "Moby Dick", "Shelf D4", false));
		ItemRepo.addItem(new PhysicalItem("005", "Pride and Prejudice", "Shelf E5", true));

		ItemRepo.printList(ItemRepo.allPhysicalItems);

		// Assuming RentalTransaction class and constructor are defined correctly

		RentalTransaction transaction1 = new RentalTransaction("user01", "001", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 15), 1.50, false);
		RentalTransaction transaction2 = new RentalTransaction("user01", "003", LocalDate.of(2024, 3, 5), LocalDate.of(2024, 3, 19), 2.00, false);
		RentalTransaction transaction3 = new RentalTransaction("user01", "005", LocalDate.of(2024, 3, 10), LocalDate.of(2024, 3, 24), 2.50, true);
		
		List<RentalTransaction> userRentals = new ArrayList<>();
		
		/**
		 * NEED a method in User that creates a list of rentals (i.e add to constructor)
		 */
		
		
		UserManager userOps = new CommonUserOperations();
		
		User user = new Student(1, "nikhil.yates", 10, "ComputerScience", 4);
		
		
		user.addToRentalList(transaction1);
		
		user.getRentalList();
		
		
		
		
		User user2 = new Student(2, "bob.smalls", 11, "ComputerScience", 4);
		
		
		user2.getRentalList();
		
		
	}
	
	
	
	
}
