package itemManagement;

public class PhysicalItem extends PhysicalItemState {
	private String itemID;
	private String title;
	private String location;
	public boolean rentalStatus; // true if currently rented, false otherwise
	private boolean purchaseOption; // true if available for purchase, false otherwise
	protected int availableCopies;
	private PhysicalItemState state;

	public PhysicalItem() {

	}

	public PhysicalItem(String itemID, String title, String location, boolean purchaseOption) {
		this.itemID = itemID;
		this.title = title;
		this.location = location;
		this.purchaseOption = purchaseOption;
		this.rentalStatus = false; // Assuming item is not rented initially
		this.availableCopies = 20; // Default number of copies
		this.state = new OpenState(); // By default all items are available for rent
	}

	public void setState(PhysicalItemState state) {
		this.state = state;
	}

	@Override
	public boolean displayState() {
		if (availableCopies > 0) {
			System.out.println(title + ", Available");
			this.state = new OpenState();
			return true; // Open state
		} else {
			System.out.println(title + ", Not Available");
			this.state = new ClosedState();
			return false; // Closed state
		}
	}

	@Override
	public void rentOut(PhysicalItem item) {
		if (availableCopies > 0) { // Ensure there are copies available to rent.
			availableCopies--;
			rentalStatus = true; // Item is now rented.
			this.state = new OpenState(); // Item remains in the open state if copies are still available.

			if (availableCopies <= 0) { // If no more copies are available after renting, change the state.
				this.state = new ClosedState();
				rentalStatus = false; // Technically, the item isn't available for rent anymore.
			}
		}
	}

	@Override
	public void returnItem(PhysicalItem item) {
		if (availableCopies < 20) { // Assuming 20 is the max number of copies available.
			availableCopies++;
			rentalStatus = false; // Item is no longer rented out.
			this.state = new OpenState(); // Item is available for rent again.
		}
	}

	public void printStatus() {
		System.out
				.println("Item ID: " + itemID + ", Title: " + title + ", Location: " + location + ", Copies available: "
						+ availableCopies + ", Rental Status: " + (rentalStatus ? "Rented" : "Available"));
	}

	// Getters and Setters for the new attributes
	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isPurchaseOption() {
		return purchaseOption;
	}

	public void setPurchaseOption(boolean purchaseOption) {
		this.purchaseOption = purchaseOption;
	}

	public void setAvailableCopies(int availableCopies) {

		this.availableCopies = availableCopies;
	}

	public int getAvailableCopies() {

		return availableCopies;
	}

	public PhysicalItem getItemByID(String itemid) {

		System.out.println("Getting PHYSICALITEMBYID:");
		System.out.println(this.title);

		return this;
	}

}
