package main;
import java.time.LocalDate;
import java.util.*;

import itemManagement.*;
import userManagement.*;


public class Main {

	
	public static void main(String[] args) {
		
		
		PhysicalItem item1 = new PhysicalItem("001", "The Great Gatsby", "Shelf A1", true);
		PhysicalItem item2 = new PhysicalItem("002", "1984", "Shelf B2", false);
		PhysicalItem item3 = new PhysicalItem("003", "To Kill a Mockingbird", "Shelf C3", true);
		PhysicalItem item4 = new PhysicalItem("004", "Moby Dick", "Shelf D4", false);
		PhysicalItem item5 = new PhysicalItem("005", "Pride and Prejudice", "Shelf E5", true);

		

		// Assuming RentalTransaction class and constructor are defined correctly

		RentalTransaction transaction1 = new RentalTransaction("user01", "001", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 15), 1.50, false);
		RentalTransaction transaction2 = new RentalTransaction("user01", "003", LocalDate.of(2024, 3, 5), LocalDate.of(2024, 3, 19), 2.00, false);
		RentalTransaction transaction3 = new RentalTransaction("user01", "005", LocalDate.of(2024, 3, 10), LocalDate.of(2024, 3, 24), 2.50, true);
		
		List<RentalTransaction> userRentals = new ArrayList<>();
		
		/**
		 * NEED a method in User that creates a list of rentals (i.e add to constructor)
		 */
		
		
		System.out.println("PHYSICAL ITEM TESTING");
		System.out.println(item1.getTitle());
		
		
		UserManager userOps = new CommonUserOperations();
		
		User user = new Student(1, "nikhil.yates", 10, "ComputerScience", 4);
		
		
		user.addToRentalList(transaction1);
		
		user.getRentalList();
		
		
		
	}
	
	
	
	
}
