package itemManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookRequest {
    private String requestID;
    private String userID;
    private String requestType;
    private List<String> topics;
    private boolean isSubmitted;
    private boolean isPriority;

    public BookRequest(String userID, String requestType, List<String> topics) {
        this.userID = userID;
        // Generating a unique ID for the request
        this.requestID = "REQ-" + UUID.randomUUID().toString();
        this.requestType = requestType;
        this.topics = new ArrayList<>(topics);
        this.isSubmitted = false;
        this.isPriority = false;
    }

    // Getters and Setters
    public String getRequestID() {
        return requestID;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String newUserID) {
		this.userID = newUserID;
	}
}