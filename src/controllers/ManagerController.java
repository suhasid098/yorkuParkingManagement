package controllers;

import java.security.SecureRandom;
import java.util.Random;

import model.MaintainManager;
import password.Generator;
import password.Password;

import password.StrongPasswordBuilder;
import objects.Manager;
import objects.SuperManager;
import objects.User;

public class ManagerController {
	private static MaintainManager maintain = MaintainManager.getInstance();
	private static int managerCount = 1;

	public static Manager generateManager() {
		if (maintain.loggedInManager.getId() != 0) {
			return null;
		}
		// Create user and update users list and DB.
		if (!maintain.managers.isEmpty()) {
			// Create super manager with generated password.
			managerCount = maintain.managers.get(maintain.managers.size() - 1).getId() + 1;
		}
		Generator gen = new Generator(); // director
		StrongPasswordBuilder strongPassword = new StrongPasswordBuilder(); // choosing a strong password rather than a
																			// 4 digit pin
		gen.setPasswordBuilder(strongPassword);
		gen.generatePassword();
		String password = gen.getPassword(); // returns strong password

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
}
