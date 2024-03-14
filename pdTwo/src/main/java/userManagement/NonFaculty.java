package userManagement;

public class NonFaculty extends User {

	
	/**
	 * NonFaculty constructor is very straightforward
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 */
	public NonFaculty(String userID, String email, String password, userType usertype) {
		
		super(userID, email, password, User.userType.NonFaculty);
	}
	
	
}
