package userManagement;

public class Staff extends User {
    private String department;

    public Staff(String userID, String email, String password, String department) {
        super(userID, email, password, UserType.STAFF);
        this.department = department;
    }

    @Override
    public void register(String email, String password, UserType userType) {
        if (userType != UserType.STAFF) {
            throw new IllegalArgumentException("UserType must be STAFF for Staff registration.");
        }

        // Validation logic that was previously assumed to be in the User class
        if (!validateEmail(email)) {
            throw new IllegalArgumentException("Invalid email format for Staff.");
        }

        if (!validatePassword(password)) {
            throw new IllegalArgumentException("Password does not meet complexity requirements for Staff.");
        }

        // Assuming a method to save the staff information to the database or any other storage
        saveStaffToDatabase(email, password);
    }

    // Placeholder method to simulate saving a staff member to a database or other storage
    private void saveStaffToDatabase(String email, String password) {
        // Placeholder for actual database save logic
        System.out.println("Staff member registered with email: " + email);
    }

    // Getters and setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
