package userManagement;

public abstract class User implements UserManager {
		
	enum userType {
		Student,
		Faculty,
		NonFaculty,
		Visitor
	}
	
	private String userID;
	private String email;
	private String password;
	private userType usertype;
	
	/**
	 * Private paramaterized constructor
	 * @param userID
	 * @param email
	 * @param password
	 */
	protected User(String userID, String email, String password, userType usertype) {
		this.userID = userID;
		this.email = email;
		this.password = password;
		this.usertype = usertype;
		
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


	public userType getUsertype() {
		return usertype;
	}

	
}
