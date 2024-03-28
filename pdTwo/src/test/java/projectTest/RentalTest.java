package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Item;
import itemManagement.Rental;

import java.util.Date;
import static org.junit.Assert.*;

public class RentalTest {
    private Rental rental;
    private Item item;
    private Date rentDate;
    private Date dueDate;

    @Before
    public void setUp() {
        item = new Item("001", "Book", 10.0, 8.0);
        rentDate = new Date();
        dueDate = new Date(rentDate.getTime() + 7 * 24 * 60 * 60 * 1000); // 7 days later
        rental = new Rental(item, rentDate, dueDate);
    }

    @Test
    public void testGetItem() {
        assertEquals("Should return the correct item", item, rental.getItem());
    }

    @Test
    public void testSetItem() {
        Item newItem = new Item("002", "New Book", 12.0, 10.0);
        rental.setItem(newItem);
        assertEquals("Should set a new item", newItem, rental.getItem());
    }

    @Test
    public void testGetRentDate() {
        assertEquals("Should return the correct rent date", rentDate, rental.getRentDate());
    }

    @Test
    public void testSetRentDate() {
        Date newRentDate = new Date();
        rental.setRentDate(newRentDate);
        assertEquals("Should set a new rent date", newRentDate, rental.getRentDate());
    }

    @Test
    public void testGetDueDate() {
        assertEquals("Should return the correct due date", dueDate, rental.getDueDate());
    }

    @Test
    public void testSetDueDate() {
        Date newDueDate = new Date(dueDate.getTime() + 7 * 24 * 60 * 60 * 1000); // Extend due date by 7 days
        rental.setDueDate(newDueDate);
        assertEquals("Should set a new due date", newDueDate, rental.getDueDate());
    }

    @Test
    public void testDueDateAfterRentDate() {
        assertTrue("Due date should be after rent date", rental.getDueDate().after(rental.getRentDate()));
    }

    @Test
    public void testRentDateBeforeDueDate() {
        assertTrue("Rent date should be before due date", rental.getRentDate().before(rental.getDueDate()));
    }

    @Test
    public void testExtendDueDate() {
        Date extendedDueDate = new Date(dueDate.getTime() + 3 * 24 * 60 * 60 * 1000); // Extend due date by 3 days
        rental.setDueDate(extendedDueDate);
        assertEquals("Due date should be extended", extendedDueDate, rental.getDueDate());
    }

    @Test
    public void testShortenDueDate() {
        Date shortenedDueDate = new Date(dueDate.getTime() - 3 * 24 * 60 * 60 * 1000); // Shorten due date by 3 days
        rental.setDueDate(shortenedDueDate);
        assertEquals("Due date should be shortened", shortenedDueDate, rental.getDueDate());
    }

    @Test
    public void testChangeItemPrice() {
        double newPrice = 9.0;
        item.setPrice(newPrice);
        assertEquals("Item price should be updated", newPrice, rental.getItem().getPrice(), 0.0);
    }

    @Test
    public void testChangeItemDiscountPrice() {
        double newDiscountPrice = 7.0;
        item.setDiscountPrice(newDiscountPrice);
        assertEquals("Item discount price should be updated", newDiscountPrice, rental.getItem().getDiscountPrice(), 0.0);
    }

    @Test
    public void testChangeItemName() {
        String newName = "Updated Book";
        item.setName(newName);
        assertEquals("Item name should be updated", newName, rental.getItem().getName());
    }
}
