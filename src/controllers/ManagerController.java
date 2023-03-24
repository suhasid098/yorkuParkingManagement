package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.MaintainManager;
import objects.Manager;
import objects.SuperManager;
import objects.User;

public class ManagerController {
	private static MaintainManager maintain = MaintainManager.getInstance();
	private static int managerCount = 1;
	
	public static Manager generateManager() {
		if(maintain.loggedInManager.getId() != 0) {
			return null;
		}
		
		//Create user and update users list and DB.
		if(!maintain.managers.isEmpty()) {
			//Create super manager with generated password.
			managerCount = maintain.managers.get(maintain.managers.size()-1).getId() + 1;
		}
		Manager manager = new Manager("Manager" + managerCount, managerCount, generatePassword());
		//passwordGenerator.generate(8)
		maintain.managers.add(manager);
		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return manager;
	}
	
	private static String generatePassword() {
		String password = "";
		//Add uppercase.
		password = password+((char) (Math.random() * 26 + 'A'));
		//Add lowercase.
		password = password+((char) (Math.random() * 26 + 'a'));
		//Add symbol.
		String specialChars = "`-=~!@#$%^&*()_+[]\\{}|;':\",./<>?";
		int num = (int)(Math.random()*specialChars.length());
		password = password+specialChars.charAt(num);
		//Add number.
		password = password+((int)(Math.random()*10));
		
		return password;
	}
	
	//builder pattern to create a random password 
	public final class PasswordGenerator {

	public static final String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lowerChars = "abcdefghijklmnopqrstuvwxyz";
    public static final String numbers = "1234567890";
    public static final String specialChars = "!@#$%^&*()_+{}";

    public static String generatePassword(
            int passwordSize,
            boolean useUpper,
            boolean useLower,
            boolean useNumbers,
            boolean useSpecial
    ) {
        char[] password = new char[passwordSize];
        String charSet = null;
        Random random = new Random();

        if (useUpper) charSet += upperChars;
        if (useLower) charSet += lowerChars;
        if (useNumbers) charSet += numbers;
        if (useSpecial) charSet += specialChars;

        for (int i = 0; i < passwordSize; i++) {
            password[i] = charSet.toCharArray()[random.nextInt(charSet.length() - 1)];
        }
        return String.valueOf(password);
    }
	
	}
	
	
	
	public static String logInManager(String name, String password) {
		for(Manager m:maintain.managers) {
			if(name.equals(m.getName()) && password.equals(m.getPassword())) {
				maintain.loggedInManager = m;
				return "";
			}
			if(name.equals(m.getName()) && !password.equals(m.getPassword())) {
				return "Password incorrect.";
			}
		}
		return "Account does not exist.";
	}
	
	public static void logOutManager() {
		maintain.loggedInManager = null;
	}
	
	public static Manager getLoggedInManager() {
		return maintain.loggedInManager;
	}
}
