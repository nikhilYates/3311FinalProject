package userManagement;

<<<<<<< Updated upstream
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

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
	protected Student(int userID, String email, int rowNum, String major, int year) {
		
		super(userID, email, rowNum);
		this.major = major;
		this.year = year;
	}
=======
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String studentID;
    private List<Course> coursesEnrolled;
    private List<Textbook> textbooks;
>>>>>>> Stashed changes

    public Student(String userID, String email, String password, String studentID) {
        super(userID, email, password, UserType.STUDENT);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
        this.textbooks = new ArrayList<>();
    }

<<<<<<< Updated upstream
	/**
	 * 
	 * @return the year that the student is in
	 */
	public int getYear() {
		return year;
	}
	
	// to set the major, at the Beginning it's empty
	public void setMajor(String major) throws IOException {
		Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        Row accountRow = sheet.getRow(this.rowNum);
        Cell majorCell = accountRow.createCell(MAJORCELL);
        majorCell.setCellValue(major);
        
        FileOutputStream out = new FileOutputStream(file);
        
        workbook.write(out);
        workbook.close();
	}
	
	// to set the year, at the Beginning it's empty
	public void setYear(int year) throws IOException {
		Workbook workbook = getWorkbook();
        
        Sheet sheet = workbook.getSheetAt(0);
        
        Row accountRow = sheet.getRow(this.rowNum);
        Cell yearCell = accountRow.createCell(YEARCELL);
        yearCell.setCellValue(year);
        
        FileOutputStream out = new FileOutputStream(file);
        
        workbook.write(out);
        workbook.close();
	}
=======
    @Override
    public void register(String email, String password, UserType userType) {
        // Implement registration logic specific to Student
        if (!validateEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        if (!validatePassword(password)) {
            throw new IllegalArgumentException("Password does not meet complexity requirements.");
        }
        if (userType != UserType.STUDENT) {
            throw new IllegalArgumentException("UserType must be STUDENT.");
        }
>>>>>>> Stashed changes

        // Assuming a method to save the student information to the database
        saveStudentToDatabase(email, password);
    }

    // Additional student-specific methods
    public void enrollInCourse(Course course) {
        // Logic for enrolling in a course
        if (course != null && !coursesEnrolled.contains(course)) {
            coursesEnrolled.add(course);
        }
    }

    public void accessTextbookForCourse(Textbook textbook) {
        // Logic for accessing a textbook for an enrolled course
        if (textbook != null && !textbooks.contains(textbook)) {
            textbooks.add(textbook);
        }
    }

    // Logic to save student to a database (for example purposes)
    private void saveStudentToDatabase(String email, String password) {
        // Placeholder for actual database save logic
        System.out.println("Student registered with email: " + email);
    }

    // Getters and setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public List<Course> getCoursesEnrolled() {
        return new ArrayList<>(coursesEnrolled);
    }

    public void setCoursesEnrolled(List<Course> coursesEnrolled) {
        this.coursesEnrolled = new ArrayList<>(coursesEnrolled);
    }

    public List<Textbook> getTextbooks() {
        return new ArrayList<>(textbooks);
    }

    public void setTextbooks(List<Textbook> textbooks) {
        this.textbooks = new ArrayList<>(textbooks);
    }
}
