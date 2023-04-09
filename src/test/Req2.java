package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import org.junit.Test;

import controllers.LotController;
import controllers.ManagerController;
import controllers.UserController;
import objects.Manager;
import views.*;
import views.RegisterView;

// might have to add clearManager for the ArrayList in ManagerController
// and clear() for the csv
public class Req2 {

	@Test // Super Manager logs in and generates management account
	public void test1() {
		ManagerController.resetManager();

		// logging in as a Super Manager
		ManagerController.logInManager("SuperManager", "Aa!1");
		ManagerActionsView mv1 = new ManagerActionsView(null);
		ManageAccountsView mv2 = new ManageAccountsView(null);

		Manager newManager = ManagerController.generateManager();
		assertNotNull(newManager); // means manager has been generated
		ManagerController.logOutManager();

		ManagerController.resetManager();
		ManagerController.clear();

	}

	@Test // Generated manager has a unique name and password
	public void test2() {
		ManagerController.logInManager("SuperManager", "Aa!1");
		Manager newManager = ManagerController.generateManager();
		Manager newManager2 = ManagerController.generateManager();
		Manager newManager3 = ManagerController.generateManager();

		ArrayList<Manager> m = ManagerController.getManagers();

		for (int i = 0; i < m.size() - 1; i++) { // dont include last manager in the list for comparison
			// Manager3 does not share the same password or name as the previous passwords
			assertFalse(m.get(i).getName() == newManager3.getName());
			assertFalse(m.get(i).getPassword() == newManager3.getPassword());
		}

		ManagerController.resetManager();
		ManagerController.clear();
	}

	@Test // Manager can have either a strong generated password or a strong pin (Builder
			// pattern)
	public void test3() {
		ManagerController.logInManager("SuperManager", "Aa!1");
		Manager newManager = ManagerController.generateManager();
		ManagerController.logOutManager();

		assertEquals(8, newManager.getPassword().length());

		ManagerController.logInManager("SuperManager", "Aa!1");
		Manager newManager2 = ManagerController.generateManagerWithPinPassword();
		ManagerController.logOutManager();

		assertEquals(4, newManager2.getPassword().length());

		ManagerController.resetManager();
		ManagerController.clear();
	}

	@Test // Account generation is NOT enabled for non-Super Managers
	public void test4() {
		ManagerController.logInManager("SuperManager", "Aa!1");
		Manager manager = ManagerController.generateManagerWithPinPassword();

		// login with newly generated manager
		ManagerController.logInManager(manager.getName(), manager.getPassword());

		Manager generatedManager = ManagerController.generateManager();
		assertNull(generatedManager); // null beacuse only superManager can generate a manager
		ManagerController.logOutManager();

		ManagerController.resetManager();
		ManagerController.clear();
	}

	@Test // maintaining parking services
	public void test5() {
		ManagerController.logInManager("SuperManager", "Aa!1");
		Manager newManager = ManagerController.generateManager();
		// login with newly generated manager
		ManagerController.logInManager(newManager.getName(), newManager.getPassword());

		ManageLotsView ml = new ManageLotsView(null);
		LotChoiceView lv = new LotChoiceView(null);

		// All lots are enabled by default
		assertEquals(5, LotController.getLotList().split(",").length);

		// disable parking
		LotController.removeLot("Lassonde");
		// size of array has decreased by 1 because lassonde has been removed as an
		// option
		assertEquals(4, LotController.getLotList().split(",").length);

		// enable parking
		LotController.enableLot("Lassonde");
		assertEquals(5, LotController.getLotList().split(",").length);
		ManagerController.logOutManager();

		ManagerController.resetManager();
		ManagerController.clear();
		LotController.resetLots();
		LotController.clear();

	}

}
