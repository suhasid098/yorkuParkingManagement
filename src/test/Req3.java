package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import controllers.UserController;
import views.*;

public class Req3 {
	// guis involved in the process of testing
	LoginView lv = new LoginView(null);

	@Test
	public void test1() {
		// register and login a user
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");

		// gui views involved and available to the user
		BookingActionsView bav = new BookingActionsView(null);
		LotChoiceView lcv = new LotChoiceView(null);
		BethuneLotView bv = new BethuneLotView(null);
		VanierLotView vv = new VanierLotView(null);
		CalumetLotView cv = new CalumetLotView(null);
		SchulichLotView sv = new SchulichLotView(null);
		LassondeLotView lasv = new LassondeLotView(null);

		// spot originally not taken and is vacant
		assertFalse(UserController.isSpotTaken("001", "Vanier"));

		// parking lot and spot chosen by user
		UserController.addParkingSpot("001", "Vanier");
		assertTrue(UserController.isSpotTaken("001", "Vanier"));

		// logs out and clears the users
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}

	@Test
	public void test2() {
		// register and login a user
		UserController.registerUser("Kim", "kim@hotmail.com", "Kimberly2021!", "Kimberly2021!", "Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("kim@hotmail.com", "Kimberly2021!");

		// spot originally not taken and is vacant
		assertFalse(UserController.isSpotTaken("001", "Bethune"));

		// parking lot and spot chosen by user
		UserController.addParkingSpot("001", "Bethune");
		assertTrue(UserController.isSpotTaken("001", "Bethune"));

		// log the user out after the spot is booked
		UserController.logOutUser();

		// register and login a user
		UserController.registerUser("Sherae", "sherae@yahoo.com", "!Password123", "!Password123", "Non-Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("sherae@yahoo.com", "!Password123");

		// spot is taken by user, Kim
		assertTrue(UserController.isSpotTaken("001", "Bethune"));
		assertEquals("Bethune", UserController.getApprovedUsers().get(0).getParkingLot());
		assertEquals("001", UserController.getApprovedUsers().get(0).getParkingSpotName());

		// this user, Sherae will attempt to add this spot
		UserController.addParkingSpot("001", "Bethune");
		// spot still belongs to Kim
		assertEquals("Bethune", UserController.getApprovedUsers().get(0).getParkingLot());
		assertEquals("001", UserController.getApprovedUsers().get(0).getParkingSpotName());

		// spot was not assigned the same spot as Kim, so its empty for Sherae
		assertEquals("", UserController.getApprovedUsers().get(1).getParkingLot());
		assertEquals("", UserController.getApprovedUsers().get(1).getParkingSpotName());

		// logs out and clears the users
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();

	}

	@Test
	public void test3() {
		// registering a student
		UserController.registerUser("Gary", "garysmith@gmail.com", "$Tiramisu1", "$Tiramisu1", "Student");

		// registering faculty
		UserController.registerUser("Haider", "haider@gmail.com", "@Haider2027", "@Haider2027", "Faculty");
		
		// registering non faculty
		UserController.registerUser("Rebecca", "becky@yahoo.ca", "&Graduation2020", "&Graduation2020", "Non-Faculty");

		// registering visitor
		UserController.registerUser("Marcus", "marcus@hotmail.com", "YorkUniversity!2013", "YorkUniversity!2013",
				"Visitor");
		UserController.logOutUser();

		// approve users
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		
		assertEquals(5, (int) UserController.getApprovedUsers().get(0).rate);
		assertEquals(8, (int) UserController.getApprovedUsers().get(1).rate);
		assertEquals(10, (int) UserController.getApprovedUsers().get(2).rate);
		assertEquals(15, (int) UserController.getApprovedUsers().get(3).rate);
		
		// logs out and clears the users
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();


	}

}
