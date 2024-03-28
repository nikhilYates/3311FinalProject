package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.PhysicalItem;

import static org.junit.Assert.*;

public class PhysicalItemTest {

    private PhysicalItem item;

    @Before
    public void setUp() {
        item = new PhysicalItem("001", "The Great Gatsby", "Shelf A1", true);
    }

    @Test
    public void testItemInitialization() {
        assertEquals("001", item.getItemID());
        assertEquals("The Great Gatsby", item.getTitle());
        assertEquals("Shelf A1", item.getLocation());
        assertTrue(item.isPurchaseOption());
        assertFalse(item.rentalStatus); // Assuming rentalStatus is accessible
        assertEquals(20, item.getAvailableCopies());
    }

    @Test
    public void testRentOutAvailableItem() {
        assertTrue(item.displayState());
        item.rentOut(item);
        assertEquals(19, item.getAvailableCopies());
        assertTrue(item.rentalStatus);
    }

    @Test
    public void testReturnRentedItem() {
        item.rentOut(item);
        item.returnItem(item);
        assertEquals(20, item.getAvailableCopies());
        assertFalse(item.rentalStatus);
    }

    @Test
    public void testRentOutUnavailableItem() {
        item.setAvailableCopies(0);
        assertFalse(item.displayState());
        item.rentOut(item);
        assertEquals(0, item.getAvailableCopies());
    }

    @Test
    public void testStateTransitionToClosed() {
        for (int i = 0; i < 20; i++) {
            item.rentOut(item);
        }
        assertEquals(0, item.getAvailableCopies());
        assertFalse(item.displayState());
    }

    @Test
    public void testStateTransitionToOpen() {
        item.setAvailableCopies(0);
        item.returnItem(item);
        assertTrue(item.displayState());
        assertEquals(1, item.getAvailableCopies());
    }

    @Test
    public void testItemIDSetter() {
        item.setItemID("002");
        assertEquals("002", item.getItemID());
    }

    @Test
    public void testTitleSetter() {
        item.setTitle("1984");
        assertEquals("1984", item.getTitle());
    }

    @Test
    public void testLocationSetter() {
        item.setLocation("Shelf B2");
        assertEquals("Shelf B2", item.getLocation());
    }

    @Test
    public void testPurchaseOptionSetter() {
        item.setPurchaseOption(false);
        assertFalse(item.isPurchaseOption());
    }

    @Test
    public void testPrintStatus() {
        item.printStatus(); // Manual check for the printed status
    }

    @Test
    public void testGetItemByID() {
        PhysicalItem resultItem = item.getItemByID("001");
        assertNotNull(resultItem);
        assertEquals("The Great Gatsby", resultItem.getTitle());
    }
}
