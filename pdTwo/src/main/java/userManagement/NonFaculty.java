package userManagement;

public class NonFaculty extends User {

	/**
	 * NonFaculty constructor is very straightforward
	 * 
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 */
	protected NonFaculty(int userID, String email, int rowNum) {

		super(userID, email, rowNum);
	}

}
