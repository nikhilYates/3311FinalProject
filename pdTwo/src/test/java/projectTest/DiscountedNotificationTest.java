package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.DiscountedNotification;
import itemManagement.Item;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DiscountedNotificationTest {
    private DiscountedNotification notification;
    private String clientID = "client123";
    private Item item1;
    private Item item2;

    @Before
    public void setUp() {
        notification = new DiscountedNotification(clientID);
        item1 = new Item("item1", "Gadget 1", 100.0, 80.0); // Assuming constructor Item(String id, String name, double price, double discountPrice)
        item2 = new Item("item2", "Gadget 2", 200.0, 150.0);
    }

    @Test
    public void testConstructor() {
        assertNotNull("Notification object should not be null", notification);
        assertEquals("Client ID should match the one provided at construction", clientID, notification.getClientID());
    }

    @Test
    public void testAddDiscountedItem() {
        notification.setDiscountedItems(new ArrayList<>(List.of(item1)));
        assertEquals("Discounted items list should contain one item", 1, notification.listDiscountedItems().size());
        assertTrue("Discounted items list should contain the added item", notification.listDiscountedItems().contains(item1));
    }

    @Test
    public void testListDiscountedItems() {
        notification.setDiscountedItems(new ArrayList<>(List.of(item1, item2)));
        List<Item> discountedItems = notification.listDiscountedItems();
        assertEquals("Discounted items list should contain two items", 2, discountedItems.size());
        assertTrue("Discounted items list should contain item1", discountedItems.contains(item1));
        assertTrue("Discounted items list should contain item2", discountedItems.contains(item2));
    }

    @Test
    public void testSelectItemForPurchaseFound() {
        notification.setDiscountedItems(new ArrayList<>(List.of(item1)));
        assertTrue("Selecting an existing item for purchase should return true", notification.selectItemForPurchase(item1.getId()));
    }

    @Test
    public void testSelectItemForPurchaseNotFound() {
        assertFalse("Selecting a non-existing item for purchase should return false", notification.selectItemForPurchase("nonExistingId"));
    }

    @Test
    public void testProcessPurchaseItemExists() {
        notification.setDiscountedItems(new ArrayList<>(List.of(item1)));
        assertTrue("Processing purchase for an existing item should return true", notification.processPurchase(item1));
        assertFalse("Item should be removed from the list after purchase", notification.listDiscountedItems().contains(item1));
    }

    @Test
    public void testProcessPurchaseItemDoesNotExist() {
        assertFalse("Processing purchase for a non-existing item should return false", notification.processPurchase(item2));
    }

    @Test
    public void testNotifyDiscounts() {
        notification.setDiscountedItems(new ArrayList<>(List.of(item1)));
        // This method will print notifications to the console.
        // In a real test, you'd capture stdout or use a logging framework to assert the output.
        notification.notifyDiscounts();
    }

    @Test
    public void testSetClientID() {
        String newClientID = "newClient123";
        notification.setClientID(newClientID);
        assertEquals("Client ID should be updated", newClientID, notification.getClientID());
    }

    @Test
    public void testClearDiscountedItems() {
        notification.setDiscountedItems(new ArrayList<>(List.of(item1, item2)));
        notification.setDiscountedItems(new ArrayList<>()); // Clearing the list
        assertTrue("Discounted items list should be empty after clearing", notification.listDiscountedItems().isEmpty());
    }

    @Test
    public void testSetDiscountedItemsImmutable() {
        List<Item> externalList = new ArrayList<>(List.of(item1));
        notification.setDiscountedItems(externalList);
        externalList.add(item2); // Attempt to modify list outside of DiscountedNotification
        assertEquals("Modifying external list should not affect internal list size", 1, notification.listDiscountedItems().size());
    }

    @Test
    public void testRemoveDiscountedItem() {
        notification.setDiscountedItems(new ArrayList<>(List.of(item1, item2)));
        notification.processPurchase(item1); // Using processPurchase to remove item1
        assertFalse("Item1 should be removed from the list", notification.listDiscountedItems().contains(item1));
        assertTrue("Item2 should remain in the list", notification.listDiscountedItems().contains(item2));
    }
}
