package userManagement;

public abstract class User implements UserManager {
	
	private String userID;
	private String email;
	private String password;
	private Enum userType;
	
	/**
	 * Private paramaterized constructor
	 * @param userID
	 * @param email
	 * @param password
	 */
	private User(String userID, String email, String password) {
		this.userID = userID;
		this.email = email;
		this.password = password;
		
	}
	
	/**
	 * Public User constructor
	 */
	public User() {
		
		System.out.println("User Default Constructor");
	}
	
	
	/**
	 * Getter methods down here
	 * @return
	 */

	public String getUserID() {
		return userID;
	}


	public String getEmail() {
		return email;
	}

	

	public String getPassword() {
		return password;
	}

	

	public Enum getUserType() {
		return userType;
	}

	
}
