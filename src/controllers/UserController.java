package controllers;

import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.MaintainUser;
import objects.User;

public class UserController {
	private static MaintainUser maintain = MaintainUser.getInstance();
	private static int userCount = 0;

	// Attempts to register user. Returns nothing if successful and error message
	// upon fail.
	public static String registerUser(String name, String email, String password, String confirmPass,
			String accountType) {

		// Check email.
		String result = checkEmail(email);
		if (!result.equals("")) {
			return result;
		}

		// Check password.
		result = checkPassword(password);
		if (!result.equals("")) {
			return result;
		}

		// Check password and confirm password are equal.
		if (!password.equals(confirmPass)) {
			return "Password does not match Confirm Password.";
		}

		// Check that button text isn't null.
		if (accountType == null) {
			return "Account type not selected!";
		}

		// Create user and update users list and DB.
		if (!maintain.users.isEmpty()) {
			userCount = maintain.users.get(maintain.users.size() - 1).getId() + 1;
		} else {
			userCount = 0;

		}
		User user = new User(name, userCount, email, password, accountType);
		maintain.users.add(user);
		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!user.getApproved()) {
			return "Registration request submitted. Please await approval.";
		}
		maintain.loggedInUser = user;
		return "";
	}

	public static String logInUser(String email, String password) {
		for (User user : maintain.users) {
			// Check approval status of account with entered email.
			if (email.equals(user.getEmail()) && !user.getApproved()) {
				return "Account with this email is not approved.";
			}
			// Log in user if username and password are correct
			if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
				maintain.loggedInUser = user;
				return "";
			}
			// Inform user if email exists but password is incorrect and do nothing.
			if (email.equals(user.getEmail()) && !password.equals(user.getPassword())) {
				return "Password incorrect.";
			}
		}
		// Otherwise, since email is not in database, inform the user of such.
		return "Email not registered.";
	}

	// Logs out the user.
	public static void logOutUser() {
		maintain.loggedInUser = null;
	}

	// Returns the logged in user.
	public static User getLoggedInUser() {
		return maintain.loggedInUser;
	}

	public static ArrayList<User> getUsers() {
		return maintain.users;
	}

	// Checks that the entered password is valid.
	private static String checkPassword(String password) {
		boolean lowercase = false;
		boolean uppercase = false;
		boolean number = false;
		boolean symbol = false;

		for (char c : password.toCharArray()) {
			if (Character.isLowerCase(c)) {
				lowercase = true;
			} else if (Character.isUpperCase(c)) {
				uppercase = true;
			} else if (Character.isDigit(c)) {
				number = true;
			} else if (!Character.isLetterOrDigit(c) && !(new String("" + c)).equals(" ")) {
				symbol = true;
			} else if ((new String("" + c)).equals(" ")) {
				return "Password cannot contain space.";
			}
		}

		return buildPassString(lowercase, uppercase, number, symbol);
	}

	// Builds check password error message.
	private static String buildPassString(boolean lowercase, boolean uppercase, boolean number, boolean symbol) {
		String result = "";

		// If all true, return "".
		if (lowercase && uppercase && number && symbol) {
			return result;
		}

		// Otherwise build error message and return it.
		result = "Password does not contain: ";

		if (!lowercase)
			result = result + "lowercase, ";
		if (!uppercase)
			result = result + "uppercase, ";
		if (!number)
			result = result + "number, ";
		if (!symbol)
			result = result + "symbol, ";

		result = result.substring(0, result.length() - 2);

		return result + ".";
	}

	// Checks that the entered email is valid.
	public static String checkEmail(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);

		// Check email format.
		if (!(pattern.matcher(email).matches())
				|| !(email.contains("@") && (email.contains(".ca") || email.contains(".com")))) {
			return "Email invalid.";
		}

		// Check email use.
		for (User user : maintain.users) {
			if (email.equalsIgnoreCase(user.getEmail()))
				return "Email in use.";
		}

		return "";
	}

	// Gets a list of the users that have yet to be fully registered.
	public static ArrayList<User> getUnapprovedUsers() {
		ArrayList<User> users = new ArrayList<User>();
		for (User user : maintain.users) {
			if (!user.getApproved()) {
				users.add(user);
			}
		}
		return users;
	}

	public static void clearUsers() {
		maintain.users.clear();
	}

	// Gets a list of the users that have been fully registered.
	public static ArrayList<User> getApprovedUsers() {
		ArrayList<User> users = new ArrayList<User>();
		for (User user : maintain.users) {
			if (user.getApproved()) {
				users.add(user);
			}
		}

		return users;
	}

	// Sets a user's registration/account status to approved.
	public static boolean approveUser(User user) {
		boolean updated = false;

		if (maintain.loggedInUser != null) {
			return false;
		}
		for (User u : maintain.users) {
			if (user.getId() == u.getId()) {
				u.setApproved(true);
				updated = true;
			}
		}

		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return updated;
	}

	// Removes the given unapproved account from the database.
	public static boolean denyUser(User user) {
		if (maintain.loggedInUser != null) {
			return false;
		}
		if (user.getApproved()) {
			return false;
		}

		maintain.users.remove(user);
		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public static boolean isSpotTaken(String spot, String lot) {
		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<User> userList = maintain.users;
		// Itterator design pattern
		Iterator it = userList.iterator();
		int i = 0;
		while (it.hasNext() && i < userList.size()) {
			if (userList.get(i).getParkingSpotName().equals(spot) && userList.get(i).getLotName().equals(lot)) {
				return true;
			}
			i++;
		}
		return false;
	}

	public static void addParkingSpot(String spotID, String lotName) {
	
		
		boolean exists = false;
		for (int i = 0; i < maintain.users.size(); i++) {
			if (maintain.users.get(i).getParkingLot() == lotName
					&& maintain.users.get(i).getParkingSpotName() == spotID) {
				exists = true;
			}
		}
		if(exists == false) {
			maintain.users.get(maintain.loggedInUser.getId()).setParkingSpot(spotID);
			maintain.users.get(maintain.loggedInUser.getId()).setParkingLot(lotName);
		}

		try {

			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void checkoutInfo(String cardName, String cardNumber, String cvvNumber, String creditDebitText,
			int price, LocalDateTime startTime, LocalDateTime endTime) {

		maintain.users.get(maintain.loggedInUser.getId()).setCardName(cardName);
		maintain.users.get(maintain.loggedInUser.getId()).setCardNumber(cardNumber);
		maintain.users.get(maintain.loggedInUser.getId()).setCvvNumber(cvvNumber);
		maintain.users.get(maintain.loggedInUser.getId()).chargeUser(creditDebitText, price);
		maintain.users.get(maintain.loggedInUser.getId()).setParkingStartTime(startTime);
		maintain.users.get(maintain.loggedInUser.getId()).setParkingEndTime(endTime);
		maintain.users.get(maintain.loggedInUser.getId()).setPrice(price);

		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void setPaymentType(String type) {
		maintain.users.get(maintain.loggedInUser.getId()).setPayementType(type);

	}

	public static String addPlateNumber(String plateNumber, String lotName) {
		if (plateNumber.length() < 2 || plateNumber.length() > 7) {
			return "Invalid plate number";
		}

		if (!lotName.equals("") && plateNumber.length() >= 2) {
			// update to database
			maintain.users.get(maintain.loggedInUser.getId()).setplateNumber(plateNumber);
			try {
				maintain.update();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "Valid plate number";

	}

	public static boolean removeParkingLot() {
		
		
		LocalDateTime current = LocalDateTime.now();
		LocalDateTime startTime = UserController.getLoggedInUser().getParkingStartTime();
		long duration = -1;
	
			if (current == null || startTime == null) {

			} else {
				duration = current.until(startTime, ChronoUnit.MINUTES);
			}
			if (duration > 0) {
				maintain.users.get(maintain.loggedInUser.getId()).setParkingEndTime(null);
				maintain.users.get(maintain.loggedInUser.getId()).setParkingStartTime(null);
				maintain.users.get(maintain.loggedInUser.getId()).setParkingLot("");
				maintain.users.get(maintain.loggedInUser.getId()).setParkingSpot("");
				startTime = maintain.users.get(maintain.loggedInUser.getId()).getParkingStartTime();
				LocalDateTime en = maintain.users.get(maintain.loggedInUser.getId()).getParkingEndTime();

				LocalDateTime currTime = LocalDateTime.now();

				User u = maintain.users.get(maintain.loggedInUser.getId());
				int price = u.getPrice();
				u.refund(price);
				try {
					maintain.update();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			} else {
				return false;
			}
			return true;
	}

	public static String getRefundAmount() {
		return maintain.users.get(maintain.loggedInUser.getId()).getPrice() + "";
	}

	public static String getType() {
		return maintain.users.get(maintain.loggedInUser.getId()).getPaymentType() + "";
	}

	public static String extendTime(int hours, int price1) {
		
		// check if user is editing before booking start time
		LocalDateTime current = LocalDateTime.now();
		LocalDateTime startTime = UserController.getLoggedInUser().getParkingStartTime();
		long duration = -1;
		if (current == null || startTime == null) {

		} else {
			duration = current.until(startTime, ChronoUnit.MINUTES);
		}
		if (duration > 0) {
			maintain.users.get(maintain.loggedInUser.getId()).setParkingEndTime(
					maintain.users.get(maintain.loggedInUser.getId()).getParkingEndTime().plusHours(hours));
			maintain.users.get(maintain.loggedInUser.getId())
					.chargeUser(maintain.users.get(maintain.loggedInUser.getId()).getPaymentType(), price1);
			maintain.users.get(maintain.loggedInUser.getId()).addPrice(price1);
			try {
				maintain.update();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return "Can not change booking time";
		}
		
		return "edit was successful";
		
		
		
	}

	public static void clear() {
		try {
			maintain.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void load() {
		try {
			maintain.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
