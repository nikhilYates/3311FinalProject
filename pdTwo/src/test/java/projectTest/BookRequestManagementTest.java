package projectTest;

import static org.junit.Assert.*;

import itemManagement.BookRequest;
import itemManagement.BookRequestManagement;
import userManagement.SystemManager;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class BookRequestManagementTest {
    private BookRequestManagement manager;

    @Before
    public void setUp() {
        manager = new BookRequestManagement("user1");
    }

    @Test
    public void testInitiateBookRequest() {
        String requestID = manager.initiateBookRequest("Research", Arrays.asList("AI", "ML"));
        assertNotNull(requestID);
    }

    @Test
    public void testSpecifyRequestDetailsFound() {
        String requestID = manager.initiateBookRequest("Research", Arrays.asList("AI"));
        manager.specifyRequestDetails(requestID, "Research-Updated", Arrays.asList("ML"));
        // Get the request directly now
        BookRequest request = manager.getRequests().stream()
                                      .filter(r -> r.getRequestID().equals(requestID))
                                      .findFirst()
                                      .orElse(null);
        assertNotNull(request);
        assertEquals("Research-Updated", request.getRequestType());
        assertTrue(request.getTopics().contains("ML"));
    }

    @Test
    public void testSpecifyRequestDetailsNotFound() {
        manager.specifyRequestDetails("nonExistingID", "Research", Arrays.asList("ML"));
        // Assuming the method logs or prints a message when the ID is not found
        // The test could check the log or output if necessary
    }

    @Test
    public void testSubmitRequestSuccess() {
        String requestID = manager.initiateBookRequest("Research", Arrays.asList("AI"));
        assertTrue(manager.submitRequest(requestID));
    }

    @Test
    public void testSubmitRequestAlreadySubmitted() {
        String requestID = manager.initiateBookRequest("Research", Arrays.asList("AI"));
        manager.submitRequest(requestID);
        assertFalse(manager.submitRequest(requestID));
    }

    @Test
    public void testSubmitRequestNotFound() {
        assertFalse(manager.submitRequest("nonExistingID"));
    }

    @Test
    public void testPrioritizeRequestFound() {
        String requestID = manager.initiateBookRequest("Research", Arrays.asList("AI"));
        manager.prioritizeRequest(requestID);
        // Assert that the request was prioritized, assuming there's a getter for requests (for test purposes)
        BookRequest request = manager.getRequests().stream().filter(r -> r.getRequestID().equals(requestID)).findFirst().orElse(null);
        assertNotNull(request);
        assertTrue(request.isPriority());
    }

    @Test
    public void testPrioritizeRequestNotFound() {
        manager.prioritizeRequest("nonExistingID");
        // Assuming the method logs or prints a message when the ID is not found
        // The test could check the log or output if necessary
    }

    @Test
    public void testGetUserID() {
        assertEquals("user1", manager.getUserID());
    }

    @Test
    public void testSetUserID() {
        manager.setUserID("user2");
        assertEquals("user2", manager.getUserID());
    }

    @Test
    public void testGetRequestsSystemManagerOnlyAuthorized() {
        // Access the singleton instance of SystemManager using the static getInstance method
        SystemManager sysManager = SystemManager.getInstance();
        assertNotNull(manager.getRequestsSystemManagerOnly(sysManager));
    }

    @Test
    public void testGetRequestsSystemManagerOnlyUnauthorized() {
        assertNull(manager.getRequestsSystemManagerOnly(null));
    }
}
