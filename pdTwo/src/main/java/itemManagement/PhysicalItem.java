package itemManagement;

public class PhysicalItem extends PhysicalItemState {
    private String itemID;
    private String title;
    private String location;
    private boolean rentalStatus; // true if currently rented, false otherwise
    private boolean purchaseOption; // true if available for purchase, false otherwise
    private int availableCopies;
    private PhysicalItemState state;

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
            return true;
        } else {
            System.out.println(title + ", Not Available");
            this.state = new ClosedState();
            return false;
        }
    }

    @Override
    public void rentOut(PhysicalItem item) {
        state.rentOut(this);
        if (state.displayState()) {
            availableCopies--; // Assuming decrement by 1 for each rental
            rentalStatus = true;
        }
        if (availableCopies <= 0) {
            this.state = new ClosedState();
            availableCopies = 0;
            rentalStatus = false;
        }
    }

    @Override
    public void returnItem(PhysicalItem item) {
        if (rentalStatus) {
            availableCopies++;
            rentalStatus = false;
            state.returnItem(this);
        }
    }

    public void printStatus() {
        System.out.println("Item ID: " + itemID + ", Title: " + title + ", Location: " + location + ", Copies available: " + availableCopies + ", Rental Status: " + (rentalStatus ? "Rented" : "Available"));
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
}
