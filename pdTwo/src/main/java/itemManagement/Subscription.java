package itemManagement;

import java.util.Objects;

public class Subscription implements Product {
	private String subscriptionID;
	private String userEmail;
	private boolean isActive; // Represents the status of the subscription

	// Constructor to create a new Subscription object
	public Subscription(String subscriptionID, String userEmail) {
		this.subscriptionID = subscriptionID;
		this.userEmail = userEmail;
		this.isActive = true; // When a subscription is created, it's active by default
	}

	// Method to cancel the subscription
	public void cancel() {
		// Set the subscription as inactive
		this.isActive = false;
	}

	// Getters and Setters
	public String getSubscriptionID() {
		return subscriptionID;
	}

	public void setSubscriptionID(String subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Subscription that = (Subscription) o;
		return Objects.equals(subscriptionID, that.subscriptionID) && Objects.equals(userEmail, that.userEmail);
	}
}
