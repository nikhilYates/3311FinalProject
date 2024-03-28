package itemManagement;

public class Item implements DigitalItem {
	private String id;
	private String name;
	private double price;
	private double discountPrice;

	// Constructor initializes the item with its ID, name, and prices
	public Item(String id, String name, double price, double discountPrice) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountPrice = discountPrice;
	}

	public Item(String string, String string2) {
		this.id = string;
		this.name = string2;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	// Additional methods for item behavior could be implemented here
	// For example, method to calculate the percentage of discount, check stock
	// levels, etc.
}
