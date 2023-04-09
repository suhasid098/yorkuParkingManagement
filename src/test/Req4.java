package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Color;
import java.awt.Font;
import java.time.Duration;
import java.time.LocalDateTime;

import javax.swing.JButton;

import org.junit.Test;
import views.*;
import controllers.UserController;

public class Req4 {
	@Test // Case where refund is accepted
	public void test1() {
		CalumetLotView cv = new CalumetLotView(null);
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
		CheckoutView checkView = new CheckoutView(null);

		
		// loggedIn user is booking a parking spot and making a payment 
		UserController.addParkingSpot("001", "Calumet");
		LocalDateTime startTime = LocalDateTime.of(2023, 5, 20, 0, 0);
		LocalDateTime endTime = LocalDateTime.of(2023, 5, 21, 0, 0);
		int deposit = (int) UserController.getLoggedInUser().getRate();
		Duration diff = Duration.between(startTime, endTime);
		long hoursBookedFor = diff.toHours();
		int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor
				+ deposit);
		UserController.checkoutInfo("Nene C", "9647282346", "534", "Debit", price1 ,startTime, endTime);

		// Before Balance
		assertEquals(125, UserController.getLoggedInUser().getPrice()); // 24 hours x $5 + deposit = 125
		assertEquals("875", UserController.getLoggedInUser().getDebitBalance()); // 1000 - 125 = 875

		// Refund should go through
	    assertTrue(UserController.removeParkingLot()); // assertTrue means refund went through
	    
	    // Balance is back to 1000
		assertEquals("1000", UserController.getLoggedInUser().getDebitBalance()); // 1000 - 125 = 875

		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}
	
	@Test // Case where refund is denied
	public void test2() {
		CalumetLotView cv = new CalumetLotView(null);
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
		
		// loggedIn user is booking a parking spot and making a payment 
		UserController.addParkingSpot("001", "Calumet");
		LocalDateTime startTime = LocalDateTime.of(2023, 4, 8, 0, 0);
		LocalDateTime endTime = LocalDateTime.of(2023, 4, 9, 0, 0); // end date time has passed already
		int deposit = (int) UserController.getLoggedInUser().getRate();
		Duration diff = Duration.between(startTime, endTime);
		long hoursBookedFor = diff.toHours();
		int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor
				+ deposit);
		UserController.checkoutInfo("Nene C", "9647282346", "534", "Debit", price1 ,startTime, endTime);

		// Before Balance
		assertEquals(125, UserController.getLoggedInUser().getPrice()); // 24 hours x $5 + deposit = 125
		assertEquals("875", UserController.getLoggedInUser().getDebitBalance()); // 1000 - 125 = 875

		// Refund will not go through
	    assertFalse(UserController.removeParkingLot()); // AssertFalse means refund did not go through
	    
	    // Balance remains same after refund is requested
		assertEquals("875", UserController.getLoggedInUser().getDebitBalance()); // balance remains same
	    
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}
}
