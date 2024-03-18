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
	
	public int studentUserId = -5;
	public String studentEmail = "helloworld5@gmail.com";
	public String studentPassword = "helloworld5";
	
	@BeforeEach
	public void deleteUser () throws IOException {
		User user = User.login(this.signupEmail, this.signupPassword);
		if (user != null) {
			user.deleteUser();
		}
	}
	
	@BeforeEach
	public void verifyStudent () throws IOException {
		User.verifyUser(studentEmail);
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
	
	@Test
	public void studentLoginTest () throws IOException {		// validated student using temp method
		User student = User.login(this.studentEmail, this.studentPassword);
		assertNotNull(student);
	}
	
	@Test
	public void studentAttributeTest () throws IOException {		// validated student using temp method
		User student = User.login(this.studentEmail, this.studentPassword);
		assertNotNull(student.getMajor());
	}
	
	@Test
	public void studentNullAttributeTest () throws IOException {		// validated student using temp method
		User student = User.login(this.studentEmail, this.studentPassword);
		assertNull(student.getDepartment());
	}
	
	@Test
	public void studentMethodTest () throws IOException {		// validated student using temp method
		User student = User.login(this.studentEmail, this.studentPassword);
		String major = "Computer Science";
		student.setMajor(major);
		assertEquals(student.getMajor(), major);
	}
	
	@Test
	public void studentMethod2Test () throws IOException {		// validated student using temp method
		User student = User.login(this.studentEmail, this.studentPassword);
		String major = "Computer Science";
		student.setMajor(major);
		student = User.login(this.studentEmail, this.studentPassword); // basically logging in again to check i major is in cvs file, and is retrieved when making the object
		assertEquals(student.getMajor(), major);
	}

}
