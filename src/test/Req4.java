package test;

import static org.junit.Assert.assertEquals;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

import org.junit.Test;
import views.*;
import controllers.UserController;

public class Req4 {

	@Test
	public void test1() {
		CalumetLotView cv = new CalumetLotView(null);
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");
//		UserController.addParkingSpot("001", "Vanier");
//		UserController.checkoutInfo(null, null, null, null, 0, null, null);

		// parking spots in Calumet

		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();
	}
}
