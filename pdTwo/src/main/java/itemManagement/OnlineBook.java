package itemManagement;

public class OnlineBook extends PhysicalItem implements DigitalItem {
    private String bookID;
    private String title;
    private String author;
    private String[] topics; // Array of topics covered by the book
    private boolean isAvailableForReading; // Indicates if the book is currently available for online reading

    public OnlineBook(String bookID, String title, String author, String[] topics, int availableCopies) {
        super(); // Call to the default constructor of PhysicalItem if no arguments are expected
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.topics = topics;
        this.availableCopies = availableCopies;
        this.isAvailableForReading = true; // Assuming all online books are available for reading upon creation
    }

    // Method to open the book for reading
    public void openBook() {
        if (isAvailableForReading) {
            System.out.println("Opening online book: " + title + " by " + author);
            // Logic to open the book for online reading could be implemented here
        } else {
            System.out.println("This book is currently not available for online reading.");
        }
    }

    // Method to close the book after reading
    public void closeBook() {
        System.out.println("Closing the book: " + title);
        // Logic to close the book and possibly update the reading progress
    }

    // Getters and Setters
    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public boolean isAvailableForReading() {
        return isAvailableForReading;
    }

    public void setAvailableForReading(boolean isAvailableForReading) {
        this.isAvailableForReading = isAvailableForReading;
    }
}
