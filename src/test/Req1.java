package test;

import static org.junit.Assert.*;

import org.junit.Test;

import controllers.UserController;

public class Req1 {
	UserController uc = new UserController();

	@Test
	public void test() {
		uc.registerUser("Jimmy", "jim@gmail.com", "!Password123", "!Password123", "Faculty");
		
		fail("Not yet implemented");
	}

}
