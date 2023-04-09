package test;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import views.*;

import org.junit.Test;

import controllers.UserController;

public class Req7 {
	@Test
	public void test1() {
		// register and login user julie
		UserController.registerUser("Julie", "jsmith@gmail.com", "juliePass1!", "juliePass1!", "Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("jsmith@gmail.com", "juliePass1!");
		// book a spot with a vacant id
		UserController.addParkingSpot("002", "Lassonde");
		// get the parking id
		String julieSpotId = UserController.getLoggedInUser().getParkingSpotName();
		// log julie out
		UserController.logOutUser();
		// register and login user tracy
		UserController.registerUser("Tracy", "tracy@gmail.com", "tracyPass1!", "tracyPass1!", "Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("tracy@gmail.com", "tracyPass1!");
		// book a spot with a vacant id in the same lot with a different id
		UserController.addParkingSpot("001", "Lassonde");
		// get parking id
		String tracySpotId = UserController.getLoggedInUser().getParkingSpotName();
		// log tracy out
		UserController.logOutUser();
		// compare the spot id to prove they are unique
		assertNotEquals(tracySpotId, julieSpotId);

		// logs out and clears the users
		UserController.clearUsers();
		UserController.clear();
	}

	@Test
	public void test2() {
		// register and login user julie
		UserController.registerUser("Julie", "jsmith@gmail.com", "juliePass1!", "juliePass1!", "Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("jsmith@gmail.com", "juliePass1!");
		// book a spot with a vacant id
		UserController.addParkingSpot("002", "Lassonde");
		// checks for the existence of lassonde lot being booked
		assertEquals("Lassonde", UserController.getLoggedInUser().getParkingLot());
		// log julie out
		UserController.logOutUser();

		// register and login user tracy
		UserController.registerUser("Tracy", "tracy@gmail.com", "tracyPass1!", "tracyPass1!", "Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("tracy@gmail.com", "tracyPass1!");
		// book a spot with a vacant id in the same lot with a different id
		UserController.addParkingSpot("001", "Vanier");
		// checks for the existence of vanier lot being booked
		assertEquals("Vanier", UserController.getLoggedInUser().getLotName());
		// log tracy out
		UserController.logOutUser();

		// register and login user stacy
		UserController.registerUser("Stacy", "stacy@gmail.com", "stacyPass1!", "stacyPass1!", "Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("stacy@gmail.com", "stacyPass1!");
		// book a spot with a vacant id
		UserController.addParkingSpot("002", "Calumet");
		// checks for the existence of calumet lot being booked
		assertEquals("Calumet", UserController.getLoggedInUser().getParkingLot());
		// log calumet out
		UserController.logOutUser();

		// register and login user lisa
		UserController.registerUser("Lisa", "lisa@gmail.com", "lisaPass1!", "lisaPass1!", "Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("lisa@gmail.com", "lisaPass1!");
		// book a spot with a vacant id
		UserController.addParkingSpot("002", "Bethune");
		// checks for the existence of bethune lot being booked
		assertEquals("Bethune", UserController.getLoggedInUser().getParkingLot());
		// log lisa out
		UserController.logOutUser();

		// register and login user jenny
		UserController.registerUser("jenny", "jenny@gmail.com", "jennyPass1!", "jennyPass1!", "Faculty");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("jenny@gmail.com", "jennyPass1!");
		// book a spot with a vacant id
		UserController.addParkingSpot("002", "Schulich");
		// checks for the existence of schulich lot being booked
		assertEquals("Schulich", UserController.getLoggedInUser().getParkingLot());
		// log lisa out
		UserController.logOutUser();

		// logs out and clears the users
		UserController.clearUsers();
		UserController.clear();

	}

}
