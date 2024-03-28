package userManagement;
import java.util.*;

import itemManagement.PhysicalItem;

/**
 * User-side interface for bridge pattern
 * @author nikhil
 *
 */
public interface UserManager {
	
	// here we can include the display rented items maybe?
	
	boolean rentPhysicalItem(RentalTransaction item, List<RentalTransaction> rentalList);
    void updatePhysicalItemInventory(RentalTransaction item, boolean operation);
    boolean checkRentalAbility(List<RentalTransaction> rentalList);
    List<RentalTransaction> countOverdueItems(List<RentalTransaction> rentalList);
    List<RentalTransaction> getCurrentHardcoverRentals(List<RentalTransaction> rentalList);
    boolean rentalDueSoonPrompt(RentalTransaction rental);
    double calculateLateFees(List<RentalTransaction> rentalList);
	/**
	 * A user can return a physical item
	 * @param itemid
	 * @param userid
	 * @param rentalList
	 */
	void returnItem(int rentalID, List<RentalTransaction> rentalList);
	
	
	
	
}
