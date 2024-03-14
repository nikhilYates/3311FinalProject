package userManagement;

public class Student extends User {
	
	private String major;
	private int year;
	
	
	/**
	 * Student constructor
	 * @param userID
	 * @param email
	 * @param password
	 * @param usertype
	 * @param major
	 * @param year
	 */
	public Student(String userID, String email, String password, userType usertype, String major, int year) {
		
		super(userID, email, password, User.userType.Student);
		this.major = major;
		this.year = year;
	}

	/**
	 * 
	 * @return the student's major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * 
	 * @return the year that the student is in
	 */
	public int getYear() {
		return year;
	}

}