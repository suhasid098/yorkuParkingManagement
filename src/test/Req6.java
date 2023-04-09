package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import controllers.LotController;
import controllers.ManagerController;
import objects.Manager;
import views.LotChoiceView;
import views.ManageLotsView;

public class Req6 {

	@Test
	public void test1() {
		ManagerController.logInManager("SuperManager", "Aa!1");
		Manager newManager = ManagerController.generateManager();
		// login with newly generated manager
		ManagerController.logInManager(newManager.getName(), newManager.getPassword());

		ManageLotsView ml = new ManageLotsView(null);
		LotChoiceView lv = new LotChoiceView(null);

		// All lots are enabled by default
		assertEquals(5, LotController.getLotList().split(",").length);
	}

	@Test
	public void test2() {

		// disable parking lot
		ManagerController.logInManager("SuperManager", "Aa!1");
		Manager newManager = ManagerController.generateManager();
		// login with newly generated manager
		ManagerController.logInManager(newManager.getName(), newManager.getPassword());

		LotController.removeLot("Lassonde");
		// size of array has decreased by 1 because lassonde has been removed as an
		// option
		assertEquals(4, LotController.getLotList().split(",").length);

		// enable parking lot
		LotController.enableLot("Lassonde");
		assertEquals(5, LotController.getLotList().split(",").length);
		ManagerController.logOutManager();

		ManagerController.resetManager();
		ManagerController.clear();
		LotController.resetLots();
		LotController.clear();
	}
	
	@Test
	public void test3() {

		// disable parking lot
		ManagerController.logInManager("SuperManager", "Aa!1");
		Manager newManager = ManagerController.generateManager();
		// login with newly generated manager
		ManagerController.logInManager(newManager.getName(), newManager.getPassword());

		LotController.removeLot("Bethune");
		LotController.removeLot("Calumet");


		assertEquals(3, LotController.getLotList().split(",").length);

		// enable parking lot
		LotController.enableLot("Bethune");
		LotController.enableLot("Calumet");
		

		assertEquals(5, LotController.getLotList().split(",").length);
		ManagerController.logOutManager();

		ManagerController.resetManager();
		ManagerController.clear();
		LotController.resetLots();
		LotController.clear();
	}
}
