package views;

import javax.swing.JFrame;

public class LotFactory {
	// Here I am using the Factory Design Pattern
	public JFrame getLot(Main frame, String type) {
		JFrame lot = null;
		
		if(type.equals("Bethune")) {
			lot = new BethuneLotView(frame);
		}
		else if (type.equals("Calumet")) {
			lot = new CalumetLotView(frame);
		}
		else if (type.equals("Lassonde")) {
			lot = new LassondeLotView(frame);
		}
		else if (type.equals("Schulich")) {
			lot = new SchulichLotView(frame);
		}
		else if (type.equals("Vanier")) {
			lot = new VanierLotView(frame);
		}
	
		return lot;
	}

}
