package itemManagement;

import java.util.Date;

public class Rental implements Product {
	private Item item;
	private Date rentDate;
	private Date dueDate;

	// Constructor to create a new Rental object with an item, rent date, and due
	// date
	public Rental(Item item, Date rentDate, Date dueDate) {
		this.item = item;
		this.rentDate = rentDate;
		this.dueDate = dueDate;
	}

	// Getter for the item
	public Item getItem() {
		return item;
	}

	// Setter for the item
	public void setItem(Item item) {
		this.item = item;
	}

	// Getter for the rent date
	public Date getRentDate() {
		return rentDate;
	}

	// Setter for the rent date
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	// Getter for the due date
	public Date getDueDate() {
		return dueDate;
	}

	// Setter for the due date
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
