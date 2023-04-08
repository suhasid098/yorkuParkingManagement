package controllers;

import model.MaintainLot;
import objects.User;

public class LotController {
	private static MaintainLot maintain = MaintainLot.getInstance();
	private static int userCount = 0;

	public static void removeLot(String lot) {

		String lotList = maintain.lotOptions;
		String[] originalList = lotList.split(",");
		String[] newLotList = new String[originalList.length - 1];

		int count = 0;
		for (int i = 0; i < originalList.length; i++) {
			if (originalList[i].equals(lot)) {
			} else if (i != (originalList.length - 1)) {
				newLotList[count] = originalList[i];
				count++;
			}
		}
		String s = "";
		for (int i = 0; i < newLotList.length; i++) {
			if (i == 0) {
				s = s + newLotList[i];
			} else {
				s = s + "," + newLotList[i];
			}
		}
		maintain.lotOptions = s;

		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getLotList() {
		return maintain.lotOptions;
	}

	public static void enableLot(String lot) {
		String lotList = maintain.lotOptions;
		String[] ar = lotList.split(",");
		String[] newarr = new String[ar.length + 1];

		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].equals(lot)) {
			} else if (i != (ar.length - 1)) {
				newarr[count] = ar[i];
				count++;
			}
		}
		newarr[count] = lot;
		String finalLotList = "";
		for (int i = 0; i < newarr.length; i++) {
			if (i == 0) {
				finalLotList = finalLotList + newarr[i];
			} else {
				finalLotList = finalLotList + "," + newarr[i];
			}
		}
		maintain.lotOptions = finalLotList;
		try {
			maintain.update();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void clear() {
		try {
			maintain.clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void resetLots() {
		maintain.resetLotOptions();
	}
}
