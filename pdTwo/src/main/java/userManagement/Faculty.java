package userManagement;

public class Faculty extends User {

	
	private String department;
	
	/**
	 * Faculty Constructor
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 * @param department
	 */
	public Faculty(String userID, String email, String password, userType usertype, String department) {
		
		super(userID, email, password, User.userType.Faculty);
		this.department = department;
	}
	
	/**
	 * 
	 * @return department that the faculty belongs to
	 */
	public String getDepartment() {
		return department;
	}
	
}
