package userManagementTests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import userManagement.Student;
import userManagement.User;

class AccessTest {	// xlsx really messy cause i only can read it
	
	public int signupUserId = -5;
	public String signupEmail = "helloworld5@gmail.com";
	public String signupPassword = "helloworld5";
	
	@BeforeEach
	public void deleteUser () throws IOException {
		User user = User.login(this.signupEmail, this.signupPassword);
		if (user != null) {
			user.deleteUser();
		}
	}
	

	@Test
	public void signupFailedTest () throws IOException {
		boolean signingup = User.signup(-4, "helloworld4@gmail.com", "helloworld4", Student.class);
		assertFalse(signingup);
	}
	
	@Test
	public void signupSuccessTest () throws IOException {
		boolean signingup = User.signup(this.signupUserId, this.signupEmail, this.signupPassword, Student.class);
		assertTrue(signingup);
	}
	
	@Test
	public void loginTest () throws IOException {
		User loggingin = User.login("helloworld4@gmail.com", "helloworld4");
		assertNotNull(loggingin);
	}

}
