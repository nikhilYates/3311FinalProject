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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Textbook textbook = (Textbook) obj;

        if (!textbookID.equals(textbook.textbookID)) return false;
        return title.equals(textbook.title);
    }

    @Override
    public int hashCode() {
        int result = textbookID.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }


	
}
