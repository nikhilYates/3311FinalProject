package itemManagement;

import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    private String facultyID;
    private List<Course> coursesTaught;
    private List<Textbook> textbooksUsed;

    public CourseManagement(String facultyID) {
        this.facultyID = facultyID;
        this.coursesTaught = new ArrayList<>();
        this.textbooksUsed = new ArrayList<>();
    }

    public void trackCourses(String facultyID) {
        // Logic to track the courses taught by the faculty member
        // Assuming there is a method to retrieve courses from a data source
    }

    public void notifyNewEditions(String textbookID) {
        // Logic to notify faculty about new editions of textbooks
        System.out.println("Notifying faculty " + facultyID + " about new edition of textbook: " + textbookID);
    }

    public void notifyUnavailability(String textbookID) {
        // Logic to notify when a textbook is unavailable
        System.out.println("Notifying faculty " + facultyID + " about unavailability of textbook: " + textbookID);
    }

    // Getters and Setters
    public String getFacultyID() {
        return facultyID;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public List<Textbook> getTextbooksUsed() {
        return textbooksUsed;
    }
}

// Assuming Course and Textbook classes are defined like this:
class Course {
    private String courseID;
    private String courseName;

    // Constructor and other methods not shown for brevity
}
