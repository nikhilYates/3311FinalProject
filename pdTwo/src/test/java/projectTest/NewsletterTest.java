package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.Newsletter;
import itemManagement.Subscription;

import java.util.List;

import static org.junit.Assert.*;

public class NewsletterTest {
    private Newsletter newsletter;
    private String newsletterID = "NL001";
    private String title = "Weekly Insights";

    @Before
    public void setUp() {
        newsletter = new Newsletter(newsletterID, title);
    }

    @Test
    public void testConstructor() {
        assertEquals("Newsletter ID should be set correctly", newsletterID, newsletter.getNewsletterID());
        assertEquals("Title should be set correctly", title, newsletter.getTitle());
        assertFalse("Subscription status should be false by default", newsletter.isSubscriptionStatus());
    }

    @Test
    public void testSubscribe() {
        newsletter.subscribe();
        assertTrue("Subscription status should be true after subscribing", newsletter.isSubscriptionStatus());
    }

    @Test
    public void testUnsubscribe() {
        newsletter.subscribe(); // Ensure it's subscribed first
        newsletter.unsubscribe();
        assertFalse("Subscription status should be false after unsubscribing", newsletter.isSubscriptionStatus());
    }

    @Test
    public void testSetNewsletterID() {
        String newID = "NL002";
        newsletter.setNewsletterID(newID);
        assertEquals("Newsletter ID should be updated", newID, newsletter.getNewsletterID());
    }

    @Test
    public void testSetTitle() {
        String newTitle = "Daily Digest";
        newsletter.setTitle(newTitle);
        assertEquals("Title should be updated", newTitle, newsletter.getTitle());
    }

    @Test
    public void testListSubscriptionsEmpty() {
        assertTrue("Subscription list should be empty initially", newsletter.listSubscriptions().isEmpty());
    }

    @Test
    public void testAddSubscription() {
        Subscription subscription = new Subscription("sub001", "user@example.com");
        newsletter.listSubscriptions().add(subscription);
        assertFalse("Subscription list should not be empty after adding a subscription", newsletter.listSubscriptions().isEmpty());
        assertTrue("Subscription list should contain the added subscription", newsletter.listSubscriptions().contains(subscription));
    }

    @Test
    public void testCancelSubscriptionExists() {
        Subscription subscription = new Subscription("sub002", "user@example.com");
        newsletter.listSubscriptions().add(subscription);
        assertTrue("Canceling an existing subscription should return true", newsletter.cancelSubscription("sub002"));
    }

    @Test
    public void testCancelSubscriptionNotExists() {
        assertFalse("Canceling a non-existing subscription should return false", newsletter.cancelSubscription("sub003"));
    }

    @Test
    public void testConfirmCancellation() {
        assertTrue("Confirm cancellation should always return true", newsletter.confirmCancellation());
    }

    @Test
    public void testListNewsletters() {
        List<Newsletter> newsletters = newsletter.listNewsletters();
        assertNotNull("listNewsletters should not return null", newsletters);
        assertTrue("listNewsletters should return an empty list by default", newsletters.isEmpty());
    }

    @Test
    public void testChooseNewsletter() {
        Newsletter chosenNewsletter = newsletter.chooseNewsletter(newsletterID);
        assertNotNull("chooseNewsletter should not return null", chosenNewsletter);
        assertEquals("chooseNewsletter should return a newsletter with the specified ID", newsletterID, chosenNewsletter.getNewsletterID());
    }

    @Test
    public void testReadOnlineSubscriptionStatus() {
        newsletter.subscribe();
        // Normally, you'd assert the output here. For simplicity, just call the method.
        newsletter.readOnline();
        newsletter.unsubscribe();
        newsletter.readOnline(); // You should see different output based on subscription status.
    }
}
