package controllers;

import java.util.ArrayList;

import model.MaintainManager;
import password.Generator;
import password.StrongPasswordBuilder;
import objects.Manager;
import objects.User;
import password.NumberPasswordBuilder;
import password.*;

public class ManagerController {
	private static MaintainManager maintain = MaintainManager.getInstance();
	private static int managerCount = 1;
	private static Generator gen = new Generator(); // director
	// choosing a strong password rather than a 4 digit pin builder
	private static StrongPasswordBuilder strongPassword = new StrongPasswordBuilder();
	private static NumberPasswordBuilder numberPassword = new NumberPasswordBuilder();

	public static Manager generateManager() {
		if (maintain.loggedInManager.getId() != 0) {
			return null;
		}
		// Create user and update users list and DB.
		if (!maintain.managers.isEmpty()) {
			// Create super manager with generated password.
			managerCount = maintain.managers.get(maintain.managers.size() - 1).getId() + 1;
		}
		gen.setPasswordBuilder(strongPassword);
		gen.generatePassword();
		String password = strongPassword.getPassword().getPassword1(); // returns strong password

		Manager manager = new Manager("Manager" + managerCount, managerCount, password);
		maintain.managers.add(manager);

		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return manager;
	}

	public static Manager generateManagerWithPinPassword() {
		if (maintain.loggedInManager.getId() != 0) {
			return null;
		}
		// Create user and update users list and DB.
		if (!maintain.managers.isEmpty()) {
			// Create super manager with generated password.
			managerCount = maintain.managers.get(maintain.managers.size() - 1).getId() + 1;
		}
		gen.setPasswordBuilder(numberPassword);
		gen.generatePassword();
		String password = numberPassword.getPassword().getPassword1(); // returns strong password

		Manager manager = new Manager("Manager" + managerCount, managerCount, password);
		maintain.managers.add(manager);

		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return manager;
	}

	public static String logInManager(String name, String password) {
		for (Manager m : maintain.managers) {
			if (name.equals(m.getName()) && password.equals(m.getPassword())) {
				maintain.loggedInManager = m;
				return "";
			}
			if (name.equals(m.getName()) && !password.equals(m.getPassword())) {
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

	public static ArrayList<Manager> getManagers() {
		return maintain.managers;
	}

	// clears file but keeps the default super manager
	public static void clear() {
		try {
			maintain.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void resetManager() {
		maintain.managers.clear();
		Manager manager = new Manager();

		manager.setName("SuperManager");
		manager.setId(0);
		manager.setPassword("Aa!1");
		maintain.managers.add(manager);
	}

}
