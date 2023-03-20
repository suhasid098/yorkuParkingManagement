package controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

import model.MaintainUser;
import objects.User;

public class UserController {
	private static MaintainUser maintain = MaintainUser.getInstance();
	private static int userCount = 0;
	private static User loggedInUser;

	//Attempts to register user. Returns nothing if successful and error message upon fail.
	public static String registerUser(String name, String email, String password, String confirmPass, String accountType) {
		
		
		//Check email.
		String result = checkEmail(email);
		if(!result.equals("")) {
			return result;
		}
		
		//Check password.
		result = checkPassword(password);
		if(!result.equals("")) {
			return result;
		}
		
		//Check password and confirm password are equal.
		if(!password.equals(confirmPass)) {
			return "Password does not match Confirm Password.";
		}
		
		//Create user and update users list and DB.
		if(!maintain.users.isEmpty()) userCount = maintain.users.get(maintain.users.size()-1).getId() + 1;
		User user = new User(name, userCount, email, password, accountType);
		maintain.users.add(user);
		loggedInUser = user;
		try {
			maintain.update(maintain.path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "";
	}
	

//	public static void setParkingLot(String lotName) {
//		maintain.users.get(loggedInUser.getId()).setParkingLot(lotName);
//		try {
//			System.out.println(maintain.users.get(loggedInUser.getId()).getLotName());
//			maintain.update(maintain.path);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
	public static String logInUser(String email, String password) {
		for(User user:maintain.users) {
			if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
				loggedInUser = user;
				return "";
			}
			if(email.equals(user.getEmail()) && !password.equals(user.getPassword())) {
				return "Password incorrect.";
			}
		}
		return "Email not registered.";
	}
	
	public static void logOutUser() {
		loggedInUser = null;
	}
	
	public static User getLoggedInUser() {
		return loggedInUser;
	}
	
	private static String checkPassword(String password) {
		boolean lowercase = false;
		boolean uppercase = false;
		boolean number = false;
		boolean symbol = false;
		
		for(char c:password.toCharArray()) {
			if(Character.isLowerCase(c)) {
				lowercase = true;
			}else if(Character.isUpperCase(c)) {
				uppercase = true;
			}else if(Character.isDigit(c)) {
				number = true;
			}else if(!Character.isLetterOrDigit(c) && !(new String(""+c)).equals(" ")) {
				symbol = true;
			}else if((new String(""+c)).equals(" ")) {
				return "Password cannot contain space.";
			}
		}
		
		return buildPassString(lowercase, uppercase, number, symbol);
	}
	
	//Builds check password error message.
	private static String buildPassString(boolean lowercase, boolean uppercase, boolean number, boolean symbol) {
		String result = "";
		
		//If all true, return "".
		if(lowercase && uppercase && number && symbol) {
			return result;
		}
		
		//Otherwise build error message and return it.
		result = "Password does not contain: ";
		
		if(!lowercase) result = result + "lowercase, ";
		if(!uppercase) result = result + "uppercase, ";
		if(!number) result = result + "number, ";
		if(!symbol) result = result + "symbol, ";
		
		result = result.substring(0, result.length()-2);
		
		return result + ".";
	}
	
	private static String checkEmail(String email) {
		//Check email format.
		if(!(email.contains("@") && (email.contains(".ca") || email.contains(".com")))) {
			return "Email invalid.";
		}
		
		//Check email use.
		for(User user:maintain.users) {
			if(email.equalsIgnoreCase(user.getEmail())) return "Email in use.";
		}
		
		return "";
	}
	
	public static boolean isSpotTaken(String spot, String lot) {
		System.out.println("expected:" + spot + " " + lot);
		try {
			maintain.update(maintain.path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<User> userList = maintain.users;
		// Itterator design pattern
		Iterator it = userList.iterator();
		int i = 0;
	      while (it.hasNext() && i < userList.size()) {
	  		System.out.println("actual:" + userList.get(i).getParkingSpotName() + " " + userList.get(i).getLotName());


	    	  if(userList.get(i).getParkingSpotName().equals(spot) && userList.get(i).getLotName().equals(lot)) {
	    		  System.out.println(userList.get(i).getParkingSpotName());
		    	  System.out.println(userList.get(i).getLotName());
		    	  System.out.println("------------");
	    		  return true;
	    	  } 
	    	  i++;
	      }
	      return false;
	}

//	public static void addParkingSpot(String spotID, String lotName) {
//		// TODO Auto-generated method stub
//		
//	}
	//try with just loggedInuser varaible
	public static void addParkingSpot(String spotID, String lotName) {
		maintain.users.get(loggedInUser.getId()).setParkingSpot(spotID);
		maintain.users.get(loggedInUser.getId()).setParkingLot(lotName);
		
		try {
			System.out.println(maintain.users.get(loggedInUser.getId()).getParkingSpotName());
			System.out.println(maintain.users.get(loggedInUser.getId()).getLotName());
			maintain.update(maintain.path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void checkoutInfo(String cardName, String cardNumber, String cvvNumber, String creditDebitText, int price, LocalDateTime startTime, LocalDateTime endTime) {
//		double rate = maintain.users.get(loggedInUser.getId()).getRate();
//		int price = rate*hou
		maintain.users.get(loggedInUser.getId()).setCardName(cardName);
		maintain.users.get(loggedInUser.getId()).setCardNumber(cardNumber);
		maintain.users.get(loggedInUser.getId()).setCvvNumber(cvvNumber);
		maintain.users.get(loggedInUser.getId()).chargeUser(creditDebitText, price);
		maintain.users.get(loggedInUser.getId()).setParkingStartTime(startTime);
		maintain.users.get(loggedInUser.getId()).setParkingEndTime(endTime);


		
		try {
			maintain.update(maintain.path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

		
	public static void addPlateNumber(String plateNumber) {
		maintain.users.get(loggedInUser.getId()).setplateNumber(plateNumber);
		try {
			maintain.update(maintain.path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
