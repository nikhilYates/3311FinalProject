package itemManagement;

import java.util.ArrayList;
import java.util.List;

public class DiscountedNotification implements Product{
    private String clientID;
    private List<Item> discountedItems;

    public DiscountedNotification(String clientID) {
        this.clientID = clientID;
        this.discountedItems = new ArrayList<>(); // Initialization of the list
    }

    // Method to notify the client about the discounted items
    public void notifyDiscounts() {
        // In a real application, you might send an email or a push notification.
        for (Item item : discountedItems) {
            System.out.println("Notification for client " + clientID + 
                               ": Discount on " + item.getName() + 
                               ", now for $" + item.getDiscountPrice());
        }
    }

    // Method to list all the items that currently have a discount
    public List<Item> listDiscountedItems() {
        return discountedItems; // This would typically return a copy to avoid external modifications
    }

    // Method to simulate the process of selecting an item for purchase
    public boolean selectItemForPurchase(String itemId) {
        for (Item item : discountedItems) {
            if (item.getId().equals(itemId)) {
                // In a real application, more complex logic could be applied
                System.out.println("Item " + item.getName() + " selected for purchase.");
                return true;
            }
        }
        System.out.println("Item with ID " + itemId + " not found among discounted items.");
        return false;
    }

    // Method to process the purchase of a discounted item
    public boolean processPurchase(Item item) {
        // Here you would implement the purchase logic, possibly integrating with a payment system
        if (discountedItems.contains(item)) {
            discountedItems.remove(item); // The item is no longer discounted after purchase
            System.out.println("Purchase processed for item: " + item.getName());
            return true;
        } else {
            System.out.println("Item " + item.getName() + " is not available for purchase.");
            return false;
        }
    }

    // Getters and Setters
    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
    
    public void setDiscountedItems(List<Item> discountedItems) {
        this.discountedItems = discountedItems;
    }
}
