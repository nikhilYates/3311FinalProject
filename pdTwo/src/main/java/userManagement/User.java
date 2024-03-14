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

	/**
	 * 
	 * @return get the user email
	 */
	public String getEmail() {
		return email;
	}

	
	/**
	 * 
	 * @return get the user password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * 
	 * @return get the usertype
	 */
	public userType getUsertype() {
		return usertype;
	}

	
}
