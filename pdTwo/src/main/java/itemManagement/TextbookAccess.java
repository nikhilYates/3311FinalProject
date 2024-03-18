package itemManagement;

import java.util.List;

public class TextbookAccess {
    private String studentID;
    private List<Course> coursesEnrolled;
    private List<Textbook> textbooks;

    public TextbookAccess(String studentID) {
        this.studentID = studentID;
        // Lists should be populated based on the student's enrollment records
    }

    public List<Course> listMyCourses(String studentID) {
        // Logic to return a list of courses the student is enrolled in
        return coursesEnrolled; // Placeholder for actual logic
    }

    public List<Textbook> listTextbooks(String courseID) {
        // Logic to list textbooks for a given course
        // This is a placeholder, as the actual implementation would require course details
        return textbooks; // Placeholder for actual logic
    }

    public void accessTextbook(String textbookID) {
        // Logic for a student to access a textbook
        System.out.println("Accessing textbook: " + textbookID);
    }

    public void removeAccess(Textbook textbook) {
        // Logic to remove access to a textbook, such as at the end of a course
        textbooks.remove(textbook);
        System.out.println("Access removed for textbook: " + textbook.getTitle());
    }

    // Getters and Setters
    public String getStudentID() {
        return studentID;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public List<Textbook> getTextbooks() {
        return textbooks;
    }
}
