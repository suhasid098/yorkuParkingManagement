package controllers;

import model.MaintainManager;
import objects.Manager;
import objects.SuperManager;

public class ManagerController {
	private static MaintainManager maintain = MaintainManager.getInstance();
	private static Manager loggedInManager;
	private static int managerCount = 0;
	
	public static boolean generateManager() {
		try {
			SuperManager manager = (SuperManager) loggedInManager;
		}catch(Exception e) {
			System.out.println("Logged in manager is not super manager!");
			return false;
		}
		
		//Create user and update users list and DB.
		if(!maintain.managers.isEmpty()) {
			//Create super manager with generated password.
			managerCount = maintain.managers.get(maintain.managers.size()-1).getId() + 1;
		}
		Manager manager = new Manager("Manager" + managerCount, managerCount, generatePassword());
		System.out.println("Username: " + manager.getName() + "\nPassword: " + manager.getPassword());
		maintain.managers.add(manager);
		loggedInManager = manager;
		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
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
}
