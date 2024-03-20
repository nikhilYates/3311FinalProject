package userManagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
		if(checkRentalAbility(rentalList) == false) {
			
			return false;
		}
		
		rentalList.add(physicalItem);
		System.out.println(physicalItem.getItemid() + " succesfully checked out! You have 30 days to return this item before a late penalty is applied.");
		return true;
	}
	
	/**
	 * want to see if the user's rental list is over the rental limit, or if user has more than 3 items overdue
	 * @param rentalList
	 * @return
	 */
	public boolean checkRentalAbility(List<RentalTransaction> rentalList) {
		
		if(rentalList.size() >= 10) {
			
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
		
		
		return null;
	}
	
	
	
	
	
	// after login, show the list of hardcover books that a user is currently renting & their due dates (req 3)
	public List<RentalTransaction> getCurrentHardcoverRentals(List<RentalTransaction> physicalItemRentals) {
			
			
			
			
		return null;
	}
		
	// getCurrentHardcoverRentals helper method that will display a warning if any of the rented books are due within the next 24 hours
	public boolean rentalDueSoonPrompt(List<RentalTransaction> hardCoverRentals) {
			return true;
	}
	
	
	
	
	/**
	 * Calculate the total penalty applied to the account based on late items
	 * @param physicalItemRentals
	 * @return
	 */
	public double calculateLateFees(List<RentalTransaction> rentalList) {
		
		List<RentalTransaction> lateItems = countOverdueItems(rentalList);
		
		double fee = 0.00;
		
		
		for (RentalTransaction lateItem : lateItems) {
			
			long daysLate = ChronoUnit.DAYS.between(lateItem.getDueDate(), LocalDate.now());
			fee += daysLate * 0.50;
			
		}
		
		return fee;
	}
	
	
	/**
	 * Previous method checks total outstanding fee balance. This method checks overdue balance for a single item
	 * @param rental
	 * @return
	 */
	public double calculateItemLateFee(RentalTransaction rental) {
		
		double lateFee = 0.00;
		long daysLate = ChronoUnit.DAYS.between(rental.getDueDate(), LocalDate.now());
		
		lateFee += daysLate * 0.50;
		
		return lateFee;
		
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
				
				
				double rentalLateFee = calculateItemLateFee(rental); 
				
				if(rentalLateFee > 0.00) {
					
					System.out.println("Late penalty of " + rentalLateFee + " must be paid.");
				}
				
				rentalList.remove(rental);
				System.out.println("Item succesfully returned!");
			}
		}
		
	}

	
	
	
}
