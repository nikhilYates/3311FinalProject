package userManagement;

public class Visitor extends User {

	/**
	 * Visitor constructor is simple (similar to NonFaculty)
	 * 
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 */
	public Visitor(int userID, String email, int rowNum) {

		super(userID, email, rowNum);
	}

}
