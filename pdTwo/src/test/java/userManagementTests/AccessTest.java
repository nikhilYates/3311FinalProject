package userManagementTests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import userManagement.Session;
import userManagement.Student;

class AccessTest {

	@Test
	public void signupFailedTest () throws IOException {
		boolean signingup = Session.signup("t1@yorku.ca", "t1t1", new Student());
		assertFalse(signingup);
	}
	
	@Test
	public void signupSuccessTest () throws IOException {	// only for first time, still need to set up a method to delete it before testing
		boolean signingup = Session.signup("hello@gmail.com", "hello", new Student());
		assertTrue(signingup);
	}
	
	@Test
	public void loginTest () throws IOException {
		Session logingin = Session.login("t1@yorku.ca", "t1t1");
		assertNotNull(logingin);
	}

}
