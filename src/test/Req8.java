package test;

import static org.junit.Assert.*;

import java.time.Duration;
import java.time.LocalDateTime;

import org.junit.Test;
import views.*;
import controllers.UserController;

public class Req8 {
	LotChoiceView lv = new LotChoiceView(null);

	@Test // invalid plateNumber
	public void test1() {
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Visitor");
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");

		// PlateNumber is too short
		assertEquals("Invalid plate number", UserController.addPlateNumber("B", "Bethune"));

		// PlateNumber is too long
		assertEquals("Invalid plate number", UserController.addPlateNumber("BJSGD3739238", "Bethune"));
		
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}

	@Test // valid plateNumber
	public void test2() {
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Visitor");
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
		// PlateNumber is valid
		assertEquals("Valid plate number", UserController.addPlateNumber("BJD338", "Bethune"));
		
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}

	@Test // trying to edit or cancel after start time has passed
	public void test3() {
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Visitor");
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
		UserController.addPlateNumber("BJD338", "Bethune");

		// loggedIn user is booking a parking spot and making a payment
		UserController.addParkingSpot("001", "Calumet");
		LocalDateTime startTime = LocalDateTime.of(2023, 4, 8, 0, 0);
		LocalDateTime endTime = LocalDateTime.of(2023, 4, 9, 0, 0); // end date time has passed already
		int deposit = (int) UserController.getLoggedInUser().getRate();
		Duration diff = Duration.between(startTime, endTime);
		long hoursBookedFor = diff.toHours();
		int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor + deposit);
		UserController.checkoutInfo("Nene C", "9647282346", "534", "Debit", price1, startTime, endTime);
		assertEquals("625", UserController.getLoggedInUser().getDebitBalance());

		// edit booking
		EditBookingView ebv = new EditBookingView(null);
		// tryimg to extend booking by 5 hours
		String result = UserController.extendTime(5, (int)UserController.getLoggedInUser().getRate() * 5);
		assertEquals("Can not change booking time", result);
	
		// trying to cancel booking
	    assertFalse(UserController.removeParkingLot()); // AssertFalse means booking was not canceled
		assertEquals("625", UserController.getLoggedInUser().getDebitBalance()); // balance remains the same as no refund is applied

		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}

	@Test // trying to edit or cancel before start time
	public void test4() {
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Visitor");
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
		UserController.addPlateNumber("BJD338", "Bethune");

		// loggedIn user is booking a parking spot and making a payment
		UserController.addParkingSpot("001", "Calumet");
		LocalDateTime startTime = LocalDateTime.of(2023, 5, 15, 0, 0);
		LocalDateTime endTime = LocalDateTime.of(2023, 5, 16, 0, 0); // end date time has passed already
		int deposit = (int) UserController.getLoggedInUser().getRate();
		Duration diff = Duration.between(startTime, endTime);
		long hoursBookedFor = diff.toHours();
		int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor + deposit);
		UserController.checkoutInfo("Nene C", "9647282346", "534", "Debit", price1, startTime, endTime);
		assertEquals("625", UserController.getLoggedInUser().getDebitBalance());

		// edit booking
		EditBookingView ebv = new EditBookingView(null);
		// tryimg to extend booking by 5 hours
		String result = UserController.extendTime(5, (int)UserController.getLoggedInUser().getRate() * 5);
		assertEquals("edit was successful", result);
		assertEquals("550", UserController.getLoggedInUser().getDebitBalance()); // users balance was decreased by $75
		
	
		// trying to cancel booking
	    assertTrue(UserController.removeParkingLot()); // AssertTrue means booking has been cancled
		assertEquals("1000", UserController.getLoggedInUser().getDebitBalance());
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}

}
