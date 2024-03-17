package userManagement;

public class Visitor extends User {

<<<<<<< Updated upstream
	
	/**
	 * Visitor constructor is simple (similar to NonFaculty)
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 */
	protected Visitor(int userID, String email, int rowNum) {
		
		super(userID, email, rowNum);
	}
=======
    public Visitor(String userID, String email, String password) {
        super(userID, email, password, UserType.VISITOR);
    }
>>>>>>> Stashed changes

    @Override
    public void register(String email, String password, UserType userType) {
        // Assuming basic validation is done in the User class, and additional visitor-specific validation can be added here if necessary
        if (userType != UserType.VISITOR) {
            throw new IllegalArgumentException("UserType must be VISITOR for Visitor registration.");
        }

        // Assuming a method to save the visitor information to the database or any other storage
        saveVisitorToDatabase(email, password);
    }

    // Visitors might have specific methods that allow them to browse or search the catalog without the ability to rent or reserve items. 
    // Example method to browse catalog:
    public void browseCatalog() {
        // Logic to allow visitor to browse the catalog
        System.out.println("Browsing catalog...");
    }

    // Placeholder method to simulate saving a visitor to a database or other storage
    private void saveVisitorToDatabase(String email, String password) {
        // Placeholder for actual database save logic
        System.out.println("Visitor registered with email: " + email);
    }
}
