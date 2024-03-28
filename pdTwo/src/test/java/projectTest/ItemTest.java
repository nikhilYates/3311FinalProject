package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Item;

import static org.junit.Assert.*;

public class ItemTest {
	private Item item;
	private String id = "item1";
	private String name = "Gadget";
	private double price = 100.0;
	private double discountPrice = 80.0;

	@Before
	public void setUp() {
		item = new Item(id, name, price, discountPrice);
	}

	@Test
	public void testConstructorWithFourParameters() {
		assertEquals("ID should match constructor argument", id, item.getId());
		assertEquals("Name should match constructor argument", name, item.getName());
		assertEquals("Price should match constructor argument", price, item.getPrice(), 0.01);
		assertEquals("Discount price should match constructor argument", discountPrice, item.getDiscountPrice(), 0.01);
	}

	@Test
	public void testConstructorWithTwoParameters() {
		Item itemTwoParams = new Item(id, name);
		assertEquals("ID should match constructor argument", id, itemTwoParams.getId());
		assertEquals("Name should match constructor argument", name, itemTwoParams.getName());
	}

	@Test
	public void testSetId() {
		String newId = "item2";
		item.setId(newId);
		assertEquals("ID should be updated by setId", newId, item.getId());
	}

	@Test
	public void testSetName() {
		String newName = "New Gadget";
		item.setName(newName);
		assertEquals("Name should be updated by setName", newName, item.getName());
	}

	@Test
	public void testSetPrice() {
		double newPrice = 150.0;
		item.setPrice(newPrice);
		assertEquals("Price should be updated by setPrice", newPrice, item.getPrice(), 0.01);
	}

	@Test
	public void testSetDiscountPrice() {
		double newDiscountPrice = 120.0;
		item.setDiscountPrice(newDiscountPrice);
		assertEquals("Discount price should be updated by setDiscountPrice", newDiscountPrice, item.getDiscountPrice(),
				0.01);
	}

	@Test
	public void testPriceGreaterThanZero() {
		item.setPrice(1.0);
		assertTrue("Price should be greater than 0", item.getPrice() > 0);
	}

	@Test
	public void testDiscountPriceGreaterThanZero() {
		item.setDiscountPrice(1.0);
		assertTrue("Discount price should be greater than 0", item.getDiscountPrice() > 0);
	}

	@Test
	public void testDiscountPriceLessThanPrice() {
		assertTrue("Discount price should be less than or equal to the price",
				item.getDiscountPrice() <= item.getPrice());
	}

	@Test
	public void testPriceNotNegative() {
		item.setPrice(-1.0);
		assertFalse("Price should not be negative", item.getPrice() < 0);
	}

	@Test
	public void testDiscountPriceNotNegative() {
		item.setDiscountPrice(-1.0);
		assertFalse("Discount price should not be negative", item.getDiscountPrice() < 0);
	}

	@Test
	public void testDiscountCalculation() {
		double expectedDiscount = ((price - discountPrice) / price) * 100;
		double actualDiscount = ((item.getPrice() - item.getDiscountPrice()) / item.getPrice()) * 100;
		assertEquals("Discount calculation should be correct", expectedDiscount, actualDiscount, 0.01);
	}
}
