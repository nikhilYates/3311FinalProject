package itemManagement;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class RentalManagement {
    private String userID;
    private List<Rental> rentedItems;

    public RentalManagement(String userID) {
        this.userID = userID;
        this.rentedItems = new LinkedList<>(); // A LinkedList is chosen for efficient removal of elements
    }

    // List all rented items for a given user
    public List<Rental> listRentedItems() {
        return new LinkedList<>(rentedItems);
    }

    // Display due dates of all items rented by the user
    public void displayDueDates() {
        for (Rental rental : rentedItems) {
            System.out.println("Item: " + rental.getItem().getName() + 
                               ", Due Date: " + rental.getDueDate());
        }
    }

    // Select a specific rental item using its ID
    public Rental selectRentedItem(String itemID) {
        for (Rental rental : rentedItems) {
            if (rental.getItem().getId().equals(itemID)) {
                return rental;
            }
        }
        return null; // or throw an exception depending on your error handling strategy
    }

    // Display details of a specific rental transaction
    public void displayRentalDetails(Rental rental) {
        System.out.println("Rental Details for item " + rental.getItem().getName() + ":");
        System.out.println("Rented on: " + rental.getRentDate());
        System.out.println("Due on: " + rental.getDueDate());
        // Additional details can be displayed as needed
    }

    // Getters and Setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

}