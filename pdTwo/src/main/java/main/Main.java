package main;

import java.time.LocalDate;
import java.util.*;

import itemManagement.*;
import userManagement.*;

public class Main {

	public static void main(String[] args) {

		ItemRepo.addItem(new PhysicalItem("001", "The Great Gatsby", "Shelf A1", true));
		ItemRepo.addItem(new PhysicalItem("002", "1984", "Shelf B2", false));
		ItemRepo.addItem(new PhysicalItem("003", "To Kill a Mockingbird", "Shelf C3", true));
		ItemRepo.addItem(new PhysicalItem("004", "Moby Dick", "Shelf D4", false));
		ItemRepo.addItem(new PhysicalItem("005", "Pride and Prejudice", "Shelf E5", true));

		ItemRepo.printList(ItemRepo.allPhysicalItems);

		// Assuming RentalTransaction class and constructor are defined correctly

		RentalTransaction transaction1 = new RentalTransaction(1, 1, "001", LocalDate.of(2024, 3, 1),
				LocalDate.of(2024, 3, 15), 1.50, false);
		RentalTransaction transaction2 = new RentalTransaction(2, 1, "003", LocalDate.of(2024, 3, 5),
				LocalDate.of(2024, 3, 19), 2.00, false);
		RentalTransaction transaction3 = new RentalTransaction(3, 1, "005", LocalDate.of(2024, 3, 10),
				LocalDate.of(2024, 3, 24), 2.50, true);

		List<RentalTransaction> userRentals = new ArrayList<>();

		/**
		 * NEED a method in User that creates a list of rentals (i.e add to constructor)
		 */

		UserManager userOps = new CommonUserOperations();

		User user = new Student(1, "nikhil.yates", 10, "ComputerScience", 4);

		user.addToRentalList(transaction1);
		user.addToRentalList(transaction2);
		user.addToRentalList(transaction3);

		user.comprehensiveReport();

		User user2 = new Student(2, "bob.smalls", 11, "ComputerScience", 4);

		user2.getRentalList();
		user2.addToRentalList(transaction3);
		user2.getRentalList();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter search term: ");
		String searchTerm = scanner.nextLine();
		ItemRepo.searchItem(searchTerm);
		scanner.close();

		/*
		 * CourseManagement (REQ 6)
		 * 
		 */
		// Create a CourseManagement instance for a faculty member
		CourseManagement courseManagement = new CourseManagement("faculty123");

		// Assuming methods to add courses and textbooks are implemented
		courseManagement.getCoursesTaught().add(new Course("CS101", "Introduction to Computer Science"));
		courseManagement.getTextbooksUsed().add(new Textbook("TXB123", "Computer Science: An Overview"));

		// Track courses for the faculty member (for now, this will do nothing)
		courseManagement.trackCourses("faculty123");

		// Notify the faculty member about new editions of textbooks
		courseManagement.notifyNewEditions("TXB123");

		// Notify the faculty member about the unavailability of a textbook
		courseManagement.notifyUnavailability("TXB456"); // TXB456 is a dummy ID for the test

		// Output the courses and textbooks for verification
		System.out.println("Courses taught by faculty123:");
		for (Course course : courseManagement.getCoursesTaught()) {
			System.out.println(course.getCourseID() + ": " + course.getCourseName());
		}

		System.out.println("\nTextbooks used by faculty123:");
		for (Textbook textbook : courseManagement.getTextbooksUsed()) {
			System.out.println(textbook.getTextbookID() + ": " + textbook.getTitle());
		}

		/*
		 * TextBookAccess (REQ 8)
		 * 
		 */

		// Sample data setup
		Course course1 = new Course("CSE101", "Introduction to Computer Science");
		Course course2 = new Course("CSE102", "Data Structures and Algorithms");
		List<Course> courses = new ArrayList<>(Arrays.asList(course1, course2));

		Textbook textbook1 = new Textbook("TB101", "Computer Science: An Overview");
		Textbook textbook2 = new Textbook("TB102", "Algorithms Unlocked");
		List<Textbook> textbooks = new ArrayList<>(Arrays.asList(textbook1, textbook2));

		// Testing TextbookAccess
		TextbookAccess textbookAccess = new TextbookAccess("student456");

		// Mocking the lists that would be retrieved from a database
		textbookAccess.setCoursesEnrolled(courses);
		textbookAccess.setTextbooks(textbooks);

		// Listing courses enrolled
		System.out.println("Courses enrolled by the student:");
		List<Course> enrolledCourses = textbookAccess.listMyCourses(textbookAccess.getStudentID());
		for (Course course : enrolledCourses) {
			System.out.println(course.getCourseName());
		}

		// Listing textbooks for a course
		System.out.println("\nTextbooks for course " + course1.getCourseName() + ":");
		List<Textbook> courseTextbooks = textbookAccess.listTextbooks(course1.getCourseID());
		for (Textbook tb : courseTextbooks) {
			System.out.println(tb.getTitle());
		}

		// Accessing a textbook
		textbookAccess.accessTextbook(textbook1.getTextbookID());

		// Removing access to a textbook
		textbookAccess.removeAccess(textbook2);
		System.out.println("\nUpdated textbooks after removal:");
		for (Textbook tb : textbookAccess.getTextbooks()) {
			System.out.println(tb.getTitle());
		}

		/*
		 * Newsletter Subscription (REQ 4)
		 * 
		 */

		// Creating a new newsletter
		Newsletter newsletter = new Newsletter("NL001", "Weekly Tech Roundup");

		// Attempting to read the newsletter before subscribing
		System.out.println("\nAttempting to read before subscribing:");
		newsletter.readOnline();

		// Subscribing to the newsletter
		System.out.println("\nSubscribing to the newsletter:");
		newsletter.subscribe();

		// Reading the newsletter after subscribing
		System.out.println("\nReading after subscribing:");
		newsletter.readOnline();

		// Unsubscribing from the newsletter
		System.out.println("\nUnsubscribing from the newsletter:");
		newsletter.unsubscribe();

		// Attempting to read the newsletter after unsubscribing
		System.out.println("\nAttempting to read after unsubscribing:");
		newsletter.readOnline();

		// Listing subscriptions (assumed to be populated somewhere within the class or
		// externally)
		System.out.println("\nListing all subscriptions:");
		for (Subscription sub : newsletter.listSubscriptions()) {
			System.out.println("Subscription ID: " + sub.getSubscriptionID());
		}

		// Cancelling a subscription by ID
		System.out.println("\nCancelling a subscription:");
		String subscriptionIdToCancel = "sub001"; // Assuming this is a valid subscription ID
		newsletter.cancelSubscription(subscriptionIdToCancel);

		// Confirming cancellation (simulated confirmation step)
		newsletter.confirmCancellation();

		/*
		 * RentalManagement (REQ 4)
		 * 
		 */

		// Create some sample items
		Item item1 = new Item("item1", "Item 1 Name");
		Item item2 = new Item("item2", "Item 2 Name");

		// Create some sample rentals
		Rental rental1 = new Rental(item1, new Date(), new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000)); // Due
																														// in
																														// one
																														// week
		Rental rental2 = new Rental(item2, new Date(), new Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000)); // Due
																															// in
																															// two
																															// weeks

		// Initialize RentalManagement and add rentals
		RentalManagement rentalManagement = new RentalManagement("user123");
		rentalManagement.listRentedItems().add(rental1);
		rentalManagement.listRentedItems().add(rental2);

		// Display due dates for all rented items
		rentalManagement.displayDueDates();

		// Display details for a specific rental
		Rental selectedRental = rentalManagement.selectRentedItem("item1");
		if (selectedRental != null) {
			rentalManagement.displayRentalDetails(selectedRental);
		} else {
			System.out.println("Item with ID item1 not found in rentals.");
		}

		/*
		 * BookRequestManagement (REQ 9)
		 * 
		 */

		// Initialize BookRequestManagement with a sample user ID
		BookRequestManagement bookRequestManager = new BookRequestManagement("user123");

		// Initiating a new book request
		String requestType = "Research";
		List<String> topics = Arrays.asList("Artificial Intelligence", "Machine Learning");
		String requestId = bookRequestManager.initiateBookRequest(requestType, topics);

		// Specifying more details for the book request
		List<String> updatedTopics = Arrays.asList("Deep Learning", "Neural Networks");
		bookRequestManager.specifyRequestDetails(requestId, requestType, updatedTopics);

		// Submitting the book request for processing
		boolean isSubmitted = bookRequestManager.submitRequest(requestId);
		if (isSubmitted) {
			System.out.println("Request " + requestId + " submitted successfully.");
		} else {
			System.out.println("Failed to submit request " + requestId + ".");
		}

		// Prioritizing the book request
		bookRequestManager.prioritizeRequest(requestId);
		System.out.println("Request " + requestId + " has been prioritized.");

		/*
		 * Discounted Notification (REQ 9)
		 * 
		 */

		// Initialize DiscountedNotification with a sample client ID
		DiscountedNotification discountedNotification = new DiscountedNotification("client001");

		// Create some sample discounted items
		Item item1a = new Item("item1a", "Gadget 1", 100.00, 80.00); // Original price $100, discounted price $80
		Item item2a = new Item("item2a", "Gadget 2", 200.00, 150.00); // Original price $200, discounted price $150

		// Set the discounted items for the notification
		discountedNotification.setDiscountedItems(new ArrayList<>(Arrays.asList(item1a, item2a)));

		// Notify the client about the discounted items
		System.out.println("Notifying about discounts:");
		discountedNotification.notifyDiscounts();

		// Listing all discounted items
		System.out.println("\nListing discounted items:");
		List<Item> discountedItems = discountedNotification.listDiscountedItems();
		for (Item item : discountedItems) {
			System.out.println(item.getName() + " is now $" + item.getDiscountPrice());
		}

		// Simulate selecting an item for purchase and processing the purchase
		String selectedItemId = "item1a"; // Assuming the client selects item1
		System.out.println("\nSelecting an item for purchase:");
		boolean isSelected = discountedNotification.selectItemForPurchase(selectedItemId);
		if (isSelected) {
			System.out.println("Processing the purchase for " + selectedItemId + ":");
			boolean isPurchased = discountedNotification.processPurchase(item1a); // Assuming the item object is
																					// available
			if (isPurchased) {
				System.out.println("Purchase completed for " + item1a.getName());
			} else {
				System.out.println("Failed to process purchase for " + item1a.getName());
			}
		} else {
			System.out.println("Item with ID " + selectedItemId + " not found or already purchased.");
		}

	}

}
