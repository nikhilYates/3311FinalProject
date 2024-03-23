package itemManagement;

import java.util.ArrayList;
import java.util.List;

import userManagement.SystemManager;

// Assuming that BookRequest is a class that encapsulates details of a book request
// If not, a placeholder implementation is provided below

public class BookRequestManagement {
    private String userID;
    private List<BookRequest> requests;

    public BookRequestManagement(String userID) {
        this.userID = userID;
        this.requests = new ArrayList<>(); // Starting with an empty list of book requests
    }

    // Initiates a book request, it will create a new request and add it to the requests list
    public String initiateBookRequest(String requestType, List<String> topics) {	// returns requestID
        BookRequest newRequest = new BookRequest(userID, requestType, topics);
        requests.add(newRequest);
        System.out.println("A new book request has been initiated for topics: " + String.join(", ", topics));
        return newRequest.getRequestID();
    }

    // Specifies details of a book request after it has been initiated
    public void specifyRequestDetails(String requestID, String requestType, List<String> topics) {
        BookRequest request = findRequestByID(requestID);
        if (request != null) {
            request.setRequestType(requestType);
            request.setTopics(topics);
            System.out.println("Details specified for request ID: " + requestID);
        } else {
            System.out.println("No request found with ID: " + requestID);
        }
    }

    // Submits a book request for processing
    public boolean submitRequest(String requestID) {
        BookRequest request = findRequestByID(requestID);
        if (request != null && !request.isSubmitted()) {
            request.setSubmitted(true);
            System.out.println("Book request ID: " + requestID + " has been submitted.");
            return true;
        } else {
            System.out.println("Request could not be submitted or it's already submitted.");
            return false;
        }
    }

    // Prioritizes a book request
    public void prioritizeRequest(String requestID) {
        BookRequest request = findRequestByID(requestID);
        if (request != null) {
            request.setPriority(true);
            System.out.println("Request ID: " + requestID + " has been prioritized.");
        } else {
            System.out.println("No request found with ID: " + requestID);
        }
    }

    // Finds a request by its ID
    private BookRequest findRequestByID(String requestID) {
        for (BookRequest request : requests) {
            if (request.getRequestID().equals(requestID)) {
                return request;
            }
        }
        return null;
    }

    // Getters and Setters
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    public List<BookRequest> getRequestsSystemManagerOnly(SystemManager sysManager) {
    	if (sysManager != null) {
    		return this.requests;
    	}
    	return null;
    }    
}
