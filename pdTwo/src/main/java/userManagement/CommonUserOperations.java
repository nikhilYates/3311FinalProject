package userManagement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import itemManagement.PhysicalItem;

public abstract class CommonUserOperations implements UserManager {

	/**
	 *  add an item to a users rental list (i.e., let a user rent an item)
	 * @param physicalItem
	 * @param rentalList
	 * @return
	 */
	public boolean rentPhysicalItem(RentalTransaction physicalItem, List<RentalTransaction> rentalList) {
		
		// check if a user can even rent an item. If not, return false and prompt the user
		PhysicalItem itemToCheck = new PhysicalItem().getItemByID(physicalItem.getItemid());
		
		if(checkRentalAbility(rentalList) == false || itemToCheck.getAvailableCopies() < 1 ) {
			
			System.out.println("Unable to rent this item.");
			return false;
		}
		
		rentalList.add(physicalItem);
		System.out.println(physicalItem.getItemid() + " succesfully checked out! You have 30 days to return this item before a late penalty is applied.");
		return true;
	}
	
	
	/**
	 * We are going to get a physicalItem by ID, and update it's inventory by 1/-1 depending on whether a user
	 * is renting or returning an item
	 * @param physicalItem
	 * @param operation : true = return, false = rent
	 */
	public void updatePhysicalItemInventory(RentalTransaction physicalItem, boolean operation) {
		
		PhysicalItem itemToUpdate = new PhysicalItem().getItemByID(physicalItem.getItemid());
		
		// if user is returning a book:
		if(operation == true) {
			itemToUpdate.setAvailableCopies(itemToUpdate.getAvailableCopies() + 1);
		
		} 
		// else if user is checking a book out
		else {
			
			itemToUpdate.setAvailableCopies(itemToUpdate.getAvailableCopies() - 1);
		}
			
	}
	
	/**
	 * want to see if the user's rental list is over the rental limit, or if user has more than 3 items overdue
	 * @param rentalList
	 * @return
	 */
	public boolean checkRentalAbility(List<RentalTransaction> rentalList) {
		
		if(rentalList.size() >= 10) {
			
			System.out.println("You have reached the maximum number of rentals for this account. ");
			return false;
		}
		
		/**
		 * NEED TO ADD: check if a user has more than 3 items overdue. Use helper method
		 */
		
		return true;
	}
	
	/**
	 * Get the number of overdue items based on the rental and due dates
	 * To also be used by the calculateLateFees method
	 * @param rentalList
	 * @return number of overdue items
	 */
	public List<RentalTransaction> countOverdueItems(List<RentalTransaction> rentalList) {
		
		
		List<RentalTransaction> overdueItems = new ArrayList<>();
		
		for (RentalTransaction rental : rentalList) {
			
			if(ChronoUnit.DAYS.between(rental.getDueDate(), LocalDate.now()) > 0) {
				
				overdueItems.add(rental);
			}
		}
		
		return overdueItems;
	}
	
	
	
	
	
	/**
	 *  after login, show the list of hardcover books that a user is currently renting & their due dates (req 3)
	 * @param physicalItemRentals
	 * @return a list of all hardCoverRentals -> will display the due dates in the user interface!
	 */
	public List<RentalTransaction> getCurrentHardcoverRentals(List<RentalTransaction> physicalItemRentals) {
			
			
		List<RentalTransaction> hardCoverRentals = new ArrayList<>();
		
		for(RentalTransaction rental : physicalItemRentals) {
			
			if(rental.getItemid().startsWith("BK")) {
				
				hardCoverRentals.add(rental);
			}
		}
			
		return hardCoverRentals;
	}
		
	
	/**
	 *  getCurrentHardcoverRentals helper method that will display a warning if any of the rented books are due within the next 24 hours
	 * @param rental
	 * @return true if the item is due in the next 24 hours, false otherwise
	 */
	public boolean rentalDueSoonPrompt(RentalTransaction rental) {
			
		if(ChronoUnit.DAYS.between(LocalDate.now(), rental.getDueDate()) <= 1) {
			
			return true;
			
		}
		
		return false;
	}
	
	
	
	
	/**
	 * Calculate the TOTAL penalty applied to the account based on late items
	 * @param physicalItemRentals
	 * @return
	 */
	public double calculateLateFees(List<RentalTransaction> rentalList) {
		
		double totalPenalty = 0.00;
		
		for(RentalTransaction rental : rentalList) {
			
			if(rental.getLatePenalty() > 0) {
				
				totalPenalty += rental.getLatePenalty();
			}
		}
		
		return totalPenalty;
	}
	
	
	
	/**
	 * A user can return a physical item
	 * @param itemid
	 * @param userid
	 * @param rentalList
	 */
	public void returnItem(String itemid, String userid, List<RentalTransaction> rentalList) {
		
		for(RentalTransaction rental : rentalList) {
			
			if(rental.getItemid().equals(itemid) && rental.getUserid().equals(userid)) {
					
				if(rental.getLatePenalty() > 0.00) {
					
					System.out.println("Late penalty of " + rental.getLatePenalty() + " must be paid.");
				}
				
				rentalList.remove(rental);
				System.out.println("Item succesfully returned!");
			}
		}
		
	}

	
	
	
}
