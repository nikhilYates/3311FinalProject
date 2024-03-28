package projectTest;

import org.junit.Before;
import org.junit.Test;

import itemManagement.BookRequest;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BookRequestTest {
    private BookRequest bookRequest;
    private String userID = "user123";
    private String requestType = "Research";
    private List<String> topics = Arrays.asList("AI", "ML");

    @Before
    public void setUp() {
        bookRequest = new BookRequest(userID, requestType, topics);
    }

    @Test
    public void testConstructorAndGetter() {
        assertNotNull(bookRequest.getRequestID());
        assertEquals(userID, bookRequest.getUserID());
        assertEquals(requestType, bookRequest.getRequestType());
        assertEquals(topics, bookRequest.getTopics());
        assertFalse(bookRequest.isSubmitted());
        assertFalse(bookRequest.isPriority());
    }

    @Test
    public void testSetRequestType() {
        String newType = "Review";
        bookRequest.setRequestType(newType);
        assertEquals(newType, bookRequest.getRequestType());
    }

    @Test
    public void testSetTopics() {
        List<String> newTopics = Arrays.asList("Blockchain", "Quantum Computing");
        bookRequest.setTopics(newTopics);
        assertEquals(newTopics, bookRequest.getTopics());
    }

    @Test
    public void testSetSubmitted() {
        bookRequest.setSubmitted(true);
        assertTrue(bookRequest.isSubmitted());
    }

    @Test
    public void testSetPriority() {
        bookRequest.setPriority(true);
        assertTrue(bookRequest.isPriority());
    }

    @Test
    public void testRequestIdUniqueness() {
        BookRequest anotherRequest = new BookRequest(userID, requestType, topics);
        assertNotEquals(bookRequest.getRequestID(), anotherRequest.getRequestID());
    }

    @Test
    public void testSetSubmittedFalse() {
        bookRequest.setSubmitted(false);
        assertFalse(bookRequest.isSubmitted());
    }

    @Test
    public void testSetPriorityFalse() {
        bookRequest.setPriority(false);
        assertFalse(bookRequest.isPriority());
    }

    @Test
    public void testAddTopic() {
        String newTopic = "Cybersecurity";
        bookRequest.getTopics().add(newTopic);
        assertTrue(bookRequest.getTopics().contains(newTopic));
    }

    @Test
    public void testRemoveTopic() {
        String topicToRemove = "AI";
        bookRequest.getTopics().remove(topicToRemove);
        assertFalse(bookRequest.getTopics().contains(topicToRemove));
    }

    @Test
    public void testChangeUserID() {
        String newUserID = "user456";
        bookRequest.setUserID(newUserID);
        assertEquals(newUserID, bookRequest.getUserID());
    }

    @Test
    public void testEmptyTopicsList() {
        bookRequest.setTopics(Arrays.asList());
        assertTrue(bookRequest.getTopics().isEmpty());
    }
}
