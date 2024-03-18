package itemManagement;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements DigitalItem{
    private String newsletterID;
    private String title;
    private boolean subscriptionStatus; // true if the user is subscribed, false otherwise
    private List<Subscription> subscriptions;

    public Newsletter(String newsletterID, String title) {
        this.newsletterID = newsletterID;
        this.title = title;
        this.subscriptionStatus = false; // Default status
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe() {
        this.subscriptionStatus = true;
        System.out.println("Subscription to " + title + " is now active.");
    }

    public void unsubscribe() {
        this.subscriptionStatus = false;
        System.out.println("Subscription to " + title + " has been cancelled.");
    }

    public void readOnline() {
        if (this.subscriptionStatus) {
            System.out.println("Reading the newsletter: " + title);
            // Here, the logic to display the newsletter content would be implemented
        } else {
            System.out.println("You must subscribe to read the newsletter.");
        }
    }

    public List<Newsletter> listNewsletters() {
        // This would normally be fetched from a database or external source
        // Dummy implementation with empty list to comply with the method's signature
        return new ArrayList<>();
    }

    public Newsletter chooseNewsletter(String newsletterID) {
        // Search for the newsletter by ID and return it if found
        // Dummy implementation returns the same newsletter
        return new Newsletter(newsletterID, "Dummy Newsletter Title");
    }

    public void loadNewsletterFrame(Newsletter newsletter) {
        // This method would open a new frame and load the newsletter content
        // For now, it just prints a message
        System.out.println("Opening newsletter frame for: " + newsletter.getTitle());
    }

    public List<Subscription> listSubscriptions() {
        // Return a list of all active subscriptions
        return subscriptions;
    }

    public boolean cancelSubscription(String subscriptionID) {
        for (Subscription subscription : subscriptions) {
            if (subscription.getSubscriptionID().equals(subscriptionID)) {
                subscriptions.remove(subscription);
                System.out.println("Subscription with ID " + subscriptionID + " has been cancelled.");
                return true;
            }
        }
        System.out.println("Subscription with ID " + subscriptionID + " not found.");
        return false;
    }

    public boolean confirmCancellation() {
        // This method would typically confirm the cancellation action with the user
        System.out.println("Cancellation confirmed.");
        return true;
    }

    // Getters and setters
    public String getNewsletterID() {
        return newsletterID;
    }

    public void setNewsletterID(String newsletterID) {
        this.newsletterID = newsletterID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(boolean subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }
}

// Subscription class placeholder to make the sub/unsub logic work
class Subscription {
    private String subscriptionID;
    private String userEmail;
    // Constructor, getters, setters

    public String getSubscriptionID() {
        return subscriptionID;
    }

    // ... other methods as needed
}
