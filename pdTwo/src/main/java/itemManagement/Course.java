package itemManagement;

//Assuming Course and Textbook classes are defined like this:
public class Course implements DigitalItem {
	private String courseID;
	private String courseName;

	public Course(String courseID, String courseName) {
		// TODO Auto-generated constructor stub
		this.courseID = courseID;
		this.courseName = courseName;
	}

	public String getCourseID() {
		return this.courseID;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String newName) {
		this.courseName = newName;
	}

	public void setCourseID(String id) {
		this.courseID = id;
	}
}