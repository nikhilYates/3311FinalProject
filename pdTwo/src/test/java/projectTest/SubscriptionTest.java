package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Subscription;

import static org.junit.Assert.*;

public class SubscriptionTest {
	private Subscription subscription;

	@Before
	public void setUp() {
		subscription = new Subscription("sub123", "user@example.com");
	}

	@Test
	public void testSubscriptionIsActiveOnCreation() {
		assertTrue("Subscription should be active upon creation", subscription.isActive());
	}

	@Test
	public void testCancelSubscription() {
		subscription.cancel();
		assertFalse("Subscription should be inactive after cancellation", subscription.isActive());
	}

	@Test
	public void testGetSubscriptionID() {
		assertEquals("Subscription ID should match", "sub123", subscription.getSubscriptionID());
	}

	@Test
	public void testSetSubscriptionID() {
		subscription.setSubscriptionID("sub456");
		assertEquals("Subscription ID should be updated", "sub456", subscription.getSubscriptionID());
	}

	@Test
	public void testGetUserEmail() {
		assertEquals("User email should match", "user@example.com", subscription.getUserEmail());
	}

	@Test
	public void testSetUserEmail() {
		subscription.setUserEmail("newuser@example.com");
		assertEquals("User email should be updated", "newuser@example.com", subscription.getUserEmail());
	}

	@Test
	public void testSetActiveTrue() {
		subscription.setActive(true);
		assertTrue("Subscription should be active", subscription.isActive());
	}

	@Test
	public void testSetActiveFalse() {
		subscription.setActive(false);
		assertFalse("Subscription should be inactive", subscription.isActive());
	}

	@Test
	public void testSubscriptionIDNotNull() {
		assertNotNull("Subscription ID should not be null", subscription.getSubscriptionID());
	}

	@Test
	public void testUserEmailNotNull() {
		assertNotNull("User email should not be null", subscription.getUserEmail());
	}

	@Test
	public void testReactivateSubscription() {
		subscription.cancel();
		subscription.setActive(true);
		assertTrue("Subscription should be reactivated", subscription.isActive());
	}

	@Test
	public void testSubscriptionEquality() {
		Subscription anotherSubscription = new Subscription("sub123", "user@example.com");
		assertEquals("Subscriptions with the same ID and email should be equal", subscription, anotherSubscription);
	}
}
