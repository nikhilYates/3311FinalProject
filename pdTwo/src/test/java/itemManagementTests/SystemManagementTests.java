package itemManagementTests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import itemManagement.BookRequestManagement;
import itemManagement.PhysicalItem;
import userManagement.SystemManager;

class SystemManagementTests {
	
	@BeforeEach
	public void deleteItem () throws IOException {
		SystemManager sysMan = SystemManager.getSystemManager(1162070547);
		PhysicalItem item = new PhysicalItem("-2", "Screem", "Somewhere", true);
		sysMan.deleteItem(item);
	}

	@Test
	public void enableTest() throws IOException {
		SystemManager sysMan = SystemManager.getSystemManager(1162070547);
		assertTrue(sysMan.enableItem(1));
	}
	
	@Test
	public void disableTest() throws IOException {
		SystemManager sysMan = SystemManager.getSystemManager(1162070547);
		assertTrue(sysMan.disableItem(2));
	}
	
	@Test
	public void addTest() throws IOException {	// change itemId for each test, decrement
		SystemManager sysMan = SystemManager.getSystemManager(1162070547);
		PhysicalItem item = new PhysicalItem("-2", "Screem", "Somewhere", true);
		assertTrue(sysMan.addItem(item));
	}
	
	@Test
	public void addTestFalse() throws IOException {	// doesn't work, adds duplicates 
		SystemManager sysMan = SystemManager.getSystemManager(1162070547);
		PhysicalItem item = new PhysicalItem("-1", "Screem", "Somewhere", true);
		assertFalse(sysMan.addItem(item));
	}
	
	@Test
	public void getRequests() throws IOException {	// doesn't work, adds duplicates 
		SystemManager sysMan = SystemManager.getSystemManager(1162070547);
		BookRequestManagement bookRequests = new BookRequestManagement("id know u");
		List<String> topics = new ArrayList<>();
		topics.add("Ham");
		topics.add("Cheese");
		String reqID1 = bookRequests.initiateBookRequest("111", topics);
		String reqID2 = bookRequests.initiateBookRequest("222", topics);
		bookRequests.initiateBookRequest("not submited", topics);
		bookRequests.submitRequest(reqID1);
		bookRequests.submitRequest(reqID2);
		assertTrue(sysMan.printRequests(bookRequests));
	}

}
