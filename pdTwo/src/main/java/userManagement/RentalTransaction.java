package userManagement;
import java.time.LocalDate;

import itemManagement.PhysicalItem;



public class RentalTransaction {
	
	/**
	 * this class is used to keep track of transactions between users and items (i.e., a user renting an item) 
	 * and each instance gets added to the users rental list 
	 */
	

	private String userid;
	private String itemid;
	private LocalDate rentalDate;
	private LocalDate dueDate;
	private boolean isReturned;
	
	
	public RentalTransaction(String userid, String itemid, LocalDate rentalDate, LocalDate dueDate, boolean isReturned) {
		
		this.setUserid(userid);
		this.setItemid(itemid);
		this.setRentalDate(rentalDate);
		this.setDueDate(dueDate);
		this.setReturned(isReturned);
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getItemid() {
		return itemid;
	}


	public void setItemid(String itemid) {
		this.itemid = itemid;
	}


	public LocalDate getRentalDate() {
		return rentalDate;
	}


	public void setRentalDate(LocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public boolean isReturned() {
		return isReturned;
	}


	public void setReturned(boolean isReturned) {
		this.isReturned = isReturned;
	}
	
	
	
}
