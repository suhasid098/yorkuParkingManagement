package controllers;

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
