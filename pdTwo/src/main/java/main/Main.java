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

		RentalTransaction transaction1 = new RentalTransaction("user01", "001", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 15), 1.50, false);
		RentalTransaction transaction2 = new RentalTransaction("user01", "003", LocalDate.of(2024, 3, 5), LocalDate.of(2024, 3, 19), 2.00, false);
		RentalTransaction transaction3 = new RentalTransaction("user01", "005", LocalDate.of(2024, 3, 10), LocalDate.of(2024, 3, 24), 2.50, true);
		
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
	     * CourseManagement
	     * 
	     * */
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
	     * TextBookAccess
	     * 
	     * */
        
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
        
        
		
		
	}
	
	
	
	
}
