package userManagementTests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import userManagement.Student;
import userManagement.User;
import userManagement.Visitor;

class AccessTest {	// xlsx really messy cause i only can read it
	
	public int signupUserId = -8;
	public String signupEmail = "helloworld8@gmail.com";
	public String signupPassword = "helloworld8";
	
	public int loginUserId = -7;
	public String loginEmail = "helloworld7@gmail.com";
	public String loginPassword = "helloworld7";
	
	public int loginFailUserId = -6;
	public String loginFailEmail = "helloworld6@gmail.com";
	public String loginFailPassword = "helloworld6";
	
	@BeforeEach
	public void deleteUser () throws IOException {
		User user = User.login(this.signupEmail, this.signupPassword);
		if (user != null) {
			user.deleteUser();
		}
	}
	

	@Test
	public void signupFailedTestVisitor () throws IOException {
		boolean signingup = User.signup(this.loginUserId, this.loginEmail, this.loginPassword, Visitor.class);
		assertFalse(signingup);
	}
	
	@Test
	public void signupFailedTestStudent () throws IOException {
		boolean signingup = User.signup(this.loginFailUserId, this.loginFailEmail, this.loginFailPassword, Student.class);
		assertFalse(signingup);
	}
	
	@Test
	public void signupSuccessTest () throws IOException {
		boolean signingup = User.signup(this.signupUserId, this.signupEmail, this.signupPassword, Visitor.class);
		assertTrue(signingup);
	}
	
	@Test
	public void loginTest () throws IOException {
		User loggingin = User.login(this.loginEmail, this.loginPassword);
		assertNotNull(loggingin);
	}
	
	@Test
	public void loginTestFailNoVerification () throws IOException {
		User loggingin = User.login(this.loginFailEmail, this.loginFailPassword);
		assertNull(loggingin);
	}

}
