package test;

import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.time.LocalDateTime;
import java.awt.*;
import javax.swing.*;

import javax.swing.JButton;

import org.junit.Test;

import controllers.UserController;
import views.*;
public class Req10 {

	@Test
	public void test1() {
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
		CheckoutView cv = new CheckoutView(null);
		cv.setMobileLableFalse();		
		UserController.addParkingSpot("001", "Calumet");
		LocalDateTime startTime = LocalDateTime.of(2023, 4, 8, 0, 0);
		LocalDateTime endTime = LocalDateTime.of(2023, 4, 9, 0, 0); // end date time has passed already
		int deposit = (int) UserController.getLoggedInUser().getRate();
		Duration diff = Duration.between(startTime, endTime);
		long hoursBookedFor = diff.toHours();
		int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor + deposit);
		
//		cv.creditRadioButton.action(evt, diff)
		cv.creditRadioButton.setAction(null);
		
		UserController.checkoutInfo("Nene C", "9647282346", "534", "Debit", price1, startTime, endTime);
		assertEquals("Debit", UserController.getLoggedInUser().getPaymentType());
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}

	@Test
	public void test2() {
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
		CheckoutView cv = new CheckoutView(null);
		cv.setMobileLableFalse();	
		// loggedIn user is booking a parking spot and making a payment
		UserController.addParkingSpot("001", "Calumet");
		LocalDateTime startTime = LocalDateTime.of(2023, 4, 8, 0, 0);
		LocalDateTime endTime = LocalDateTime.of(2023, 4, 9, 0, 0); // end date time has passed already
		int deposit = (int) UserController.getLoggedInUser().getRate();
		Duration diff = Duration.between(startTime, endTime);
		long hoursBookedFor = diff.toHours();
		int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor + deposit);
		UserController.checkoutInfo("Nene C", "9647282346", "534", "Credit", price1, startTime, endTime);
		assertEquals("Credit", UserController.getLoggedInUser().getPaymentType());

		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}

	@Test
	public void test3() {
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
		CheckoutView cv = new CheckoutView(null);
		cv.setCreditLableFalse();
		// loggedIn user is booking a parking spot and making a payment
		UserController.addParkingSpot("001", "Calumet");
		LocalDateTime startTime = LocalDateTime.of(2023, 4, 8, 0, 0);
		LocalDateTime endTime = LocalDateTime.of(2023, 4, 9, 0, 0); // end date time has passed already
		int deposit = (int) UserController.getLoggedInUser().getRate();
		Duration diff = Duration.between(startTime, endTime);
		long hoursBookedFor = diff.toHours();
		int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor + deposit);
		UserController.checkoutInfo("Nene C", "", "", "Mobile Payment", price1, startTime, endTime);
		assertEquals("Mobile Payment", UserController.getLoggedInUser().getPaymentType());

		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}
	
	
}
