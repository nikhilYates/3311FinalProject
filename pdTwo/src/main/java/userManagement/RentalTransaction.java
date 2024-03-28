package userManagement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import itemManagement.PhysicalItem;



public class RentalTransaction {
	
	/**
	 * this class is used to keep track of transactions between users and items (i.e., a user renting an item) 
	 * and each instance gets added to the users rental list 
	 */
	
	private int transactionID;
	private String userid;
	private String itemid;
	private LocalDate rentalDate;
	private LocalDate dueDate;
	private double latePenalty = 0;
	private boolean isReturned = false;
	
	
	public RentalTransaction(int transactionID, String userid, String itemid, LocalDate rentalDate, LocalDate dueDate, double latePenalty, boolean isReturned) {
		
		this.setTransactionID(transactionID);
		this.setUserid(userid);
		this.setItemid(itemid);
		this.setRentalDate(rentalDate);
		this.latePenalty = latePenalty;
		this.setReturned(isReturned);
	}
	
	public double getLatePenalty() {
		
		long daysLate = ChronoUnit.DAYS.between(this.getDueDate(), LocalDate.now());
		
		if(daysLate >= 0) {
		
			this.latePenalty += daysLate * 0.50;
		}
		
		return latePenalty;
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
	    // If dueDate has been explicitly set, return it
	    if (this.dueDate != null) {
	        return this.dueDate;
	    }
	    // Otherwise, calculate it as 30 days from the rental date
	    return this.rentalDate.plusDays(30);
	}



	public boolean isReturned() {
		return isReturned;
	}


	public void setReturned(boolean isReturned) {
		this.isReturned = isReturned;
	}


	public int getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public void setDueDate(LocalDate day) {
		this.dueDate = day;
	}

	public void setLatePenalty(double d) {
		this.latePenalty = d;
	}
	
	
	
}
