package userManagementTests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import userManagement.Session;
import userManagement.Student;

class AccessTest {
	
	public String signupEmail = "helloworld@gmail.com";
	public String signupPassword = "helloworld";
	
	@BeforeEach
	public void deleteUser () throws IOException {
		Session user = Session.login(this.signupEmail, this.signupPassword);
		if (user != null) {
			user.deleteUser();
		}
	}
	

	@Test
	public void signupFailedTest () throws IOException {
		boolean signingup = Session.signup("t1@yorku.ca", "t1t1", new Student(null, null, null, null, null, 0));
		assertFalse(signingup);
	}
	
	@Test
	public void signupSuccessTest () throws IOException {
		boolean signingup = Session.signup(this.signupEmail, this.signupPassword, new Student(null, null, null, null, null, 0));
		assertTrue(signingup);
	}
	
	@Test
	public void loginTest () throws IOException {
		Session logingin = Session.login("t1@yorku.ca", "t1t1");
		assertNotNull(logingin);
	}

}
