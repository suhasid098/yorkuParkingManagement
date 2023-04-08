//package test;
//
//import objects.Manager;
//import objects.SuperManager;
//
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//
//import org.junit.*;
//
//import controllers.ManagerController;
//import model.MaintainManager;
//
//public class Req2 {
//	private static MaintainManager maintain;
//	private Manager manager;
//	private ArrayList<Manager> dbManagers;
//	
//	@SuppressWarnings("unchecked")
//	@Before
//    public void init() {
//		maintain = MaintainManager.getInstance();
//		maintain.loggedInManager = maintain.managers.get(0);
//		dbManagers = (ArrayList<Manager>) maintain.managers.clone();
//		manager = ManagerController.generateManager();
//    }
//	
//	@After 
//	public void fin() {
//		//Remove generated manager.
//		maintain.managers = dbManagers;
//		try {
//			maintain.update();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void testAccountGenerationPerms() {
//		//Test that super manager can generate managers.
//		Manager sManager = new SuperManager();
//		maintain.loggedInManager = sManager;
//		Manager genManager = ManagerController.generateManager();
//		assertNotNull("Super manager couldn't generate a manager", genManager);
//		
//		//Test that manager can't generate managers.
//		Manager rManager = new Manager();
//		maintain.loggedInManager = rManager;
//		genManager = ManagerController.generateManager();
//		assertNull("Manager could generate a manager", genManager);
//	}
//	
//	@Test
//	public void testGeneratedInfo() {
//		String password = manager.getPassword();
//		String name = manager.getName();
//		
//		//Check username is unique.
//		for(Manager m: dbManagers) {
//			if(name.equals(m.getName())) fail("Manager username already exists.");
//		}
//		
//		//Check password contains a number, uppercase, lowercase, and symbol.
//		boolean contains = false;
//		String numbers = "1234567890";
//		for(char c:numbers.toCharArray()) {
//			if(password.contains(String.valueOf(c))) {
//				contains = true;
//			}
//		}
//		assertTrue("Password does not contain a number", contains);
//		contains = false;
//		
//		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		for(char c:uppercase.toCharArray()) {
//			if(password.contains(String.valueOf(c))) {
//				contains = true;
//			}
//		}
//		assertTrue("Password does not contain an uppercase letter", contains);
//		contains = false;
//		
//		String lowercase = "abcdefghijklmnopqrstuvwxyz";
//		for(char c:lowercase.toCharArray()) {
//			if(password.contains(String.valueOf(c))) {
//				contains = true;
//			}
//		}
//		assertTrue("Password does not contain a lowercase letter", contains);
//		contains = false;
//		
//		String symbols = "!@#$%^&*()_+-={}[]|\\\\:;\\\"',.?/";
//		for(char c:symbols.toCharArray()) {
//			if(password.contains(String.valueOf(c))) {
//				contains = true;
//			}
//		}
//		assertTrue("Password does not contain a symbol", contains);		
//	}
//
//}
