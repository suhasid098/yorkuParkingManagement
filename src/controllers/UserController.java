package controllers;

import model.MaintainUser;
import objects.User;

public class UserController {
	private static MaintainUser maintain = MaintainUser.getInstance();
	private static int userCount = 0;
	
	//Attempts to register user. Returns nothing if successful and error message upon fail.
	public static String registerUser(String name, String email, String password, String confirmPass) {
		
		
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
		maintain.users.add(new User(name, userCount, email, password));
		try {
			maintain.update(maintain.path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "";
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
}
