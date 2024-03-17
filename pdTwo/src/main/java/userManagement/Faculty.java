package userManagement;

<<<<<<< Updated upstream
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

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
	protected Faculty(int userID, String email, int rowNum, String department) {
		
		super(userID, email, rowNum);
		this.department = department;
	}
	
	/**
	 * 
	 * @return department that the faculty belongs to
	 */
	public String getDepartment() {
		return department;
	}
	
	// to set the department, at the Beginning it's empty
	public void setDepartment(String department) throws IOException {
		Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        Row accountRow = sheet.getRow(this.rowNum);
        Cell departmentCell = accountRow.createCell(DEPARTMENTCELL);
        departmentCell.setCellValue(department);
        
        FileOutputStream out = new FileOutputStream(file);
        
        workbook.write(out);
        workbook.close();
	}
	
=======
import java.util.ArrayList;
import java.util.List;

public class Faculty extends User {
    private String facultyID;
    private List<Course> coursesTaught;
    private List<Textbook> textbooksUsed;

    public Faculty(String userID, String email, String password, String facultyID) {
        super(userID, email, password, UserType.FACULTY);
        this.facultyID = facultyID;
        this.coursesTaught = new ArrayList<>();
        this.textbooksUsed = new ArrayList<>();
    }

    @Override
    public void register(String email, String password, UserType userType) {
        // Assuming that the email and password validations are already handled
        if (userType == UserType.FACULTY) {
            // Perform faculty-specific validation
            if (validateFacultyStatus(email)) {
                // Set the user's attributes if the faculty validation is successful
                this.setEmail(email);
                this.setPassword(password);
                this.setUserType(userType);
                // Further actions upon successful registration, if any
                System.out.println("Faculty member registered successfully.");
            } else {
                // Handle the case where faculty validation fails
                System.out.println("Faculty registration failed: Invalid faculty email address.");
            }
        } else {
            // Handle the case where the userType is not FACULTY
            System.out.println("Faculty registration failed: Incorrect user type.");
        }
    }

    private boolean validateFacultyStatus(String email) {
        // Placeholder logic for checking faculty status
        return email.endsWith("@yorku.ca"); // simple check
    }

    public void trackCourses() {
        // Logic to track courses taught by this faculty member
        // For demonstration, just print the courses
        coursesTaught.forEach(course -> System.out.println(course.getCourseName()));
    }

    public void notifyNewEditions(Textbook textbook) {
        // Logic to notify the faculty member about new editions of textbooks
        if (textbooksUsed.contains(textbook) && textbook.isNewEditionAvailable()) {
            System.out.println("New edition available for textbook: " + textbook.getTitle());
        }
    }

    public void notifyUnavailability(Textbook textbook) {
        // Logic to notify the faculty member if a textbook is unavailable
        if (!textbook.isAvailable()) {
            System.out.println("Textbook currently unavailable: " + textbook.getTitle());
        }
    }

    // Getters and setters
    public String getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(String facultyID) {
        this.facultyID = facultyID;
    }

    public List<Course> getCoursesTaught() {
        return new ArrayList<>(coursesTaught);
    }

    public void setCoursesTaught(List<Course> coursesTaught) {
        this.coursesTaught = new ArrayList<>(coursesTaught);
    }

    public List<Textbook> getTextbooksUsed() {
        return new ArrayList<>(textbooksUsed);
    }

    public void setTextbooksUsed(List<Textbook> textbooksUsed) {
        this.textbooksUsed = new ArrayList<>(textbooksUsed);
    }
}

class Course {
    private String courseID;
    private String courseName;

    // Constructors, getters, and setters
    public Course(String courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    // Additional methods if needed
}

class Textbook {
    private String title;
    private boolean available;
    private boolean newEditionAvailable;

    // Constructors, getters, and setters
    public Textbook(String title) {
        this.title = title;
        this.available = true; // Default to available
        this.newEditionAvailable = false; // Default to no new edition
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isNewEditionAvailable() {
        return newEditionAvailable;
    }

    public void setNewEditionAvailable(boolean newEditionAvailable) {
        this.newEditionAvailable = newEditionAvailable;
    }

    // Additional methods if needed
>>>>>>> Stashed changes
}
