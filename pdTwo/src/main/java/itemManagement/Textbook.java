package itemManagement;

public class Textbook implements DigitalItem {

    private String textbookID;
    private String title;

    public Textbook(String textbookID, String title) {
        this.textbookID = textbookID;
        this.title = title;
    }

	public String getTextbookID() {
        return this.textbookID;
    }

    public String getTitle() {
        return this.title;
    }

	
}
