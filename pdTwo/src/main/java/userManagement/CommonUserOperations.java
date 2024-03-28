package userManagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import itemManagement.ItemRepo;
import itemManagement.PhysicalItem;

public class CommonUserOperations implements UserManager {

	/**
	 * add an item to a users rental list (i.e., let a user rent an item)
	 * 
	 * @param physicalItem
	 * @param rentalList
	 * @return
	 */
	@Override
	public boolean rentPhysicalItem(RentalTransaction physicalItem, List<RentalTransaction> rentalList) {
		PhysicalItem itemToCheck = ItemRepo.getItemById(physicalItem.getItemid());

		if (checkRentalAbility(rentalList) && itemToCheck.getAvailableCopies() > 0) {
			rentalList.add(physicalItem);
			System.out.println(physicalItem.getItemid()
					+ " successfully checked out! You have 30 days to return this item before a late penalty is applied.");
			// Decrement available copies of the item
			itemToCheck.setAvailableCopies(itemToCheck.getAvailableCopies() - 1);
			return true;
		}
		System.out.println("Unable to rent this item.");
		return false;
	}

	/**
	 * We are going to get a physicalItem by ID, and update it's inventory by 1/-1
	 * depending on whether a user is renting or returning an item
	 * 
	 * @param physicalItem
	 * @param operation    : true = return, false = rent
	 */
	@Override
	public void updatePhysicalItemInventory(RentalTransaction physicalItem, boolean operation) {
		PhysicalItem itemToUpdate = ItemRepo.getItemById(physicalItem.getItemid());

		if (itemToUpdate != null) {
			if (operation) { // Returning item
				if (itemToUpdate.getAvailableCopies() < 20) {
					itemToUpdate.setAvailableCopies(itemToUpdate.getAvailableCopies() + 1);
				}
			} else { // Renting item
				if (itemToUpdate.getAvailableCopies() > 0) {
					itemToUpdate.setAvailableCopies(itemToUpdate.getAvailableCopies() - 1);
				}
			}
		}
	}

	/**
	 * want to see if the user's rental list is over the rental limit, or if user
	 * has more than 3 items overdue
	 * 
	 * @param rentalList
	 * @return
	 */
	@Override
	public boolean checkRentalAbility(List<RentalTransaction> rentalList) {

		if (rentalList.size() >= 10) {

			System.out.println("You have reached the maximum number of rentals for this account. ");
			return false;
		}

		/**
		 * NEED TO ADD: check if a user has more than 3 items overdue. Use helper method
		 */

		return true;
	}

	/**
	 * Get the number of overdue items based on the rental and due dates To also be
	 * used by the calculateLateFees method
	 * 
	 * @param rentalList
	 * @return number of overdue items
	 */
	@Override
	public List<RentalTransaction> countOverdueItems(List<RentalTransaction> rentalList) {

		List<RentalTransaction> overdueItems = new ArrayList<>();

		for (RentalTransaction rental : rentalList) {

			if (ChronoUnit.DAYS.between(rental.getDueDate(), LocalDate.now()) > 0) {

				overdueItems.add(rental);
			}
		}

		return overdueItems;
	}

	/**
	 * after login, show the list of hardcover books that a user is currently
	 * renting & their due dates (req 3)
	 * 
	 * @param physicalItemRentals
	 * @return a list of all hardCoverRentals -> will display the due dates in the
	 *         user interface!
	 */
	@Override
	public List<RentalTransaction> getCurrentHardcoverRentals(List<RentalTransaction> physicalItemRentals) {

		List<RentalTransaction> hardCoverRentals = new ArrayList<>();

		for (RentalTransaction rental : physicalItemRentals) {

			if (rental.getItemid().startsWith("BK")) {

				hardCoverRentals.add(rental);
			}
		}

		return hardCoverRentals;
	}

	/**
	 * getCurrentHardcoverRentals helper method that will display a warning if any
	 * of the rented books are due within the next 24 hours
	 * 
	 * @param rental
	 * @return true if the item is due in the next 24 hours, false otherwise
	 */
	public boolean rentalDueSoonPrompt(RentalTransaction rental) {
		// Assuming RentalTransaction.getDueDate() returns a LocalDate
		LocalDate dueDate = rental.getDueDate();
		long daysUntilDue = ChronoUnit.DAYS.between(LocalDate.now(), dueDate);

		// The rental is considered due soon if it is due within the next 24 hours
		// (i.e., 0 or 1 day until due)
		return daysUntilDue <= 1;
	}

	/**
	 * Calculate the TOTAL penalty applied to the account based on late items
	 * 
	 * @param physicalItemRentals
	 * @return
	 */
	@Override
	public double calculateLateFees(List<RentalTransaction> rentalList) {

		double totalPenalty = 0.00;

		for (RentalTransaction rental : rentalList) {

			if (rental.getLatePenalty() > 0) {

				totalPenalty += rental.getLatePenalty();
			}
		}

		return totalPenalty;
	}

	/**
	 * A user can return a physical item
	 * 
	 * @param itemid
	 * @param userid
	 * @param rentalList
	 */
	@Override
	public void returnItem(int rentalID, List<RentalTransaction> rentalList) {

		for (RentalTransaction rental : rentalList) {

			if (rental.getTransactionID() == rentalID) {

				if (rental.getLatePenalty() > 0.00) {

					System.out.println("Late penalty of " + rental.getLatePenalty() + " must be paid.");
				}

				rental.setReturned(true);
				rentalList.remove(rental);
				System.out.println("Item succesfully returned!");
			}
		}

	}

}
