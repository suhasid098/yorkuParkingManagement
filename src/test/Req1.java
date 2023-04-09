package test;

import static org.junit.Assert.*;
import views.Main;

import org.junit.Test;

import controllers.UserController;
import views.RegisterView;

public class Req1 {
	RegisterView rv = new RegisterView(null);
	Main m = new Main();

	@Test // registering a user
	public void test1() {
		UserController.registerUser("Jimmy", "jim@gmail.com", "!Password123", "!Password123", "Faculty");
		assertEquals(1, UserController.getUnapprovedUsers().size());
		assertEquals(0, UserController.getApprovedUsers().size());

		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		assertEquals(0, UserController.getUnapprovedUsers().size());
		assertEquals(1, UserController.getApprovedUsers().size());
		assertTrue(UserController.getUsers().get(0).getApproved());
		UserController.clearUsers();
		UserController.clear();
	}

	@Test // checking if email is unique and valid
	public void test2() {
		// valid email registration
		UserController.registerUser("Jane", "jane01@gmail.com", "#Goodbye23", "#Goodbye23", "Student");
		assertEquals(1, UserController.getUnapprovedUsers().size());

		// invalid email case 1
		UserController.registerUser("Anne", "anne#gmail.com", "@Anne2014", "@Anne2014", "Student");
		assertEquals("Email invalid.",
				UserController.registerUser("Anne", "anne#gmail.com", "@Anne2014", "@Anne2014", "Student"));
		assertEquals(1, UserController.getUnapprovedUsers().size()); // size remains 1 because email is invalid therefor
																		// user is not registered

		// invalid email case 2
		UserController.registerUser("Paul", "@yahoo.com", "%2023PaulYahoo", "%2023PaulYahoo", "Student");
		assertEquals(1, UserController.getUnapprovedUsers().size());
		assertEquals("Email invalid.",
				UserController.registerUser("Paul", "@yahoo.com", "%2023PaulYahoo", "%2023PaulYahoo", "Student"));

		// registering a user with a taken email
		UserController.registerUser("Monica", "jane01@gmail.com", "#Goodbye23", "#Goodbye23", "Student");
		assertEquals("Email in use.",
				UserController.registerUser("Monica", "jane01@gmail.com", "#Goodbye23", "#Goodbye23", "Student"));

		UserController.approveUser(UserController.getUnapprovedUsers().get(0)); // approving the 1 user in the list
		UserController.clearUsers();
		UserController.clear();
	}

	@Test
	public void test3() {
		// valid password registration
		UserController.registerUser("Doris", "dorisk@hotmail.com", "*eclipseIDE2019", "*eclipseIDE2019", "Student");
		assertEquals(1, UserController.getUnapprovedUsers().size());

		// invalid password case 1 missing lower case
		assertEquals("Password does not contain: lowercase.",
				UserController.registerUser("Cassie", "cassie@yahoo.ca", "!CASSIE2323", "!CASSIE2323", "Non-Faculty"));
		// size remains 1 because user was unable to be registered due to its invalid
		// password entry
		assertEquals(1, UserController.getUnapprovedUsers().size());

		// invalid password case 2 missing upper case
		assertEquals("Password does not contain: uppercase.",
				UserController.registerUser("Cassie", "cassie@yahoo.ca", "!cassie2323", "!cassie2323", "Non-Faculty"));
		assertEquals(1, UserController.getUnapprovedUsers().size());

		// invalid password case 3 missing symbol
		assertEquals("Password does not contain: symbol.",
				UserController.registerUser("Cassie", "cassie@yahoo.ca", "Cassie2323", "Cassie2323", "Non-Faculty"));
		assertEquals(1, UserController.getUnapprovedUsers().size());

		// invalid password case 4 missing number
		assertEquals("Password does not contain: number.",
				UserController.registerUser("Cassie", "cassie@yahoo.ca", "!Cassie", "!Cassie", "Non-Faculty"));
		assertEquals(1, UserController.getUnapprovedUsers().size());

		UserController.approveUser(UserController.getUnapprovedUsers().get(0)); // approving the 1 user in the list
		assertEquals(0, UserController.getUnapprovedUsers().size());
		UserController.clearUsers();
		assertEquals(0, UserController.getApprovedUsers().size());

		UserController.clearUsers();
		UserController.clear();
	}

	@Test
	public void test4() {
		// registering a student
		UserController.registerUser("Gary", "garysmith@gmail.com", "$Tiramisu1", "$Tiramisu1", "Student");
		assertEquals(1, UserController.getUnapprovedUsers().size());
		// registering faculty
		UserController.registerUser("Haider", "haider@gmail.com", "@Haider2027", "@Haider2027", "Faculty");
		assertEquals(2, UserController.getUnapprovedUsers().size());
		// registering non faculty
		UserController.registerUser("Rebecca", "becky@yahoo.ca", "&Graduation2020", "&Graduation2020", "Non-Faculty");
		assertEquals(3, UserController.getUnapprovedUsers().size());

		// approvedUser list is still size 0 because none of the above users are a
		// the 3 users have to be manually approved by a manager
		assertEquals(0, UserController.getApprovedUsers().size());

		// approving the 3 user in the list
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		assertEquals(2, UserController.getUnapprovedUsers().size());
		assertEquals(1, UserController.getApprovedUsers().size());

		// approving Faculty member Haider
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		assertEquals(1, UserController.getUnapprovedUsers().size());
		assertEquals(2, UserController.getApprovedUsers().size());

		// approving non-faculty member Rebecca
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		assertEquals(0, UserController.getUnapprovedUsers().size());
		assertEquals(3, UserController.getApprovedUsers().size()); // size should still be 0 because visitors don't

		// registering visitor
		UserController.registerUser("Marcus", "marcus@hotmail.com", "YorkUniversity!2013", "YorkUniversity!2013",
				"Visitor");
		assertEquals(0, UserController.getUnapprovedUsers().size()); // size should still be 3 because visitors don't
																		// require registration
		assertEquals(4, UserController.getApprovedUsers().size()); // size is increased because visitor user is
																	// automatically approved
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser(); // we have to log out of visitor manually because of automatic approval
	}

}
