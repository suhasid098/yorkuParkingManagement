package test;

import static org.junit.Assert.*;

import java.awt.Color;

import views.*;
import org.junit.Test;

import controllers.UserController;
import objects.Sensor;
import objects.ParkingSpot;
import javax.swing.*;

public class Req5 {

	@Test
	public void test1() {
		UserController.registerUser("Julie", "jsmith@gmail.com", "juliePass1!", "juliePass1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("jsmith@gmail.com", "juliePass1!");
		// spot thats taken will return true
		UserController.addParkingSpot("002", "Schulich");
		assertTrue(UserController.isSpotTaken("002", "Schulich"));
		// spot thats vacant will return false
		assertFalse(UserController.isSpotTaken("001", "Schulich"));

		// logs out and clears the users
		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();

	}

	@Test
	public void test2() {
		Sensor s = new Sensor();
		String type = s.getRandArrayElement1();
		// checking if the random type of car is in the list of available types the
		// sensor can detect
		for (String ct : s.carType) {
			if (type.equals(ct)) {
				assertEquals(ct, type);
			}
		}
		// checks if the random model of the car is in the list of available models the
		// sensor can detect
		String model = s.getRandArrayElement2();
		for (String cm : s.carModel) {
			if (model.equals(cm)) {
				assertEquals(cm, model);
			}
		}
	}

	@Test
	public void test3() {
		ParkingSpot ps = new ParkingSpot("001");

		// parking spot class gets the id and the sensor
		assertEquals("001", ps.getCode());
		assertNull(ps.getSensor());
	}

	@Test
	public void test4() {
		// testing for calumet parking lot and registering/logging in a user
		CalumetLotView cv = new CalumetLotView(null);
		UserController.registerUser("Nene", "nenel@hotmail.com", "Atlanta1!", "Atlanta1!", "Student");
		UserController.approveUser(UserController.getUnapprovedUsers().get(0));
		UserController.logInUser("nenel@hotmail.com", "Atlanta1!");

		JButton parkingSpot1 = new JButton("001");
		JButton parkingSpot2 = new JButton("002");

		// parking spot 1 is available and is unnassigned to anyone so it should be
		// green
		cv.setColorButton(parkingSpot1);
		AlertStateContext sensor1 = cv.getParkingSpotState();
		assertEquals("Available", sensor1.alert());
		assertEquals(Color.GREEN, parkingSpot1.getBackground());

		// parking spot 2 is unavailable is assigned to someone so it should be red
		UserController.addParkingSpot("002", "Calumet");
		cv.setColorButton(parkingSpot2);
		AlertStateContext sensor2 = cv.getParkingSpotState();
		assertEquals("Unavailable", sensor2.alert());
		assertEquals(Color.RED, parkingSpot2.getBackground());

		UserController.clearUsers();
		UserController.clear();
		UserController.logOutUser();

	}

}
