package userManagement;

public class Visitor extends User{

	
	/**
	 * Visitor constructor is simple (similar to NonFaculty)
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 */
	public Visitor(String userID, String email, String password, userType usertype) {
		
		super(userID, email, password, User.userType.Visitor);
	}

}
