package views;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controllers.UserController;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class VanierLotView extends JFrame {
	private VanierLotView thisView = this;
	protected Main frame;
	private AlertStateContext parkingSpot = new AlertStateContext(); // to alert if spot is available

	public VanierLotView(Main frame) {
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Vanier");
		// Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the frame's size.
		this.setSize(450, 450);
		// Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);

		this.getContentPane();
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Vanier Lot");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 10));
		title.setBounds(143, 10, 145, 29);
		getContentPane().add(title);

		JButton psVanier001 = new JButton("001");
		psVanier001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psVanier001);

		psVanier001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psVanier001, "001", "Vanier");
			}
		});

		psVanier001.setBounds(10, 49, 174, 76);
		getContentPane().add(psVanier001);

		JButton psVanier002 = new JButton("002");
		psVanier002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psVanier002);
		psVanier002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psVanier002, "002", "Vanier");
			}
		});

		psVanier002.setBounds(10, 135, 174, 76);
		getContentPane().add(psVanier002);

		JButton psVanier003 = new JButton("003");
		psVanier003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psVanier003.setBounds(10, 241, 174, 76);
		setColorButton(psVanier003);
		psVanier003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psVanier003, "003", "Vanier");
			}
		});
		getContentPane().add(psVanier003);

		JButton psVanier004 = new JButton("004");
		psVanier004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psVanier004.setBounds(10, 327, 174, 76);
		setColorButton(psVanier004);

		getContentPane().add(psVanier004);

		psVanier004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psVanier004, "004", "Vanier");
			}
		});

		JButton psVanier005 = new JButton("005");
		psVanier005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psVanier005);
		psVanier005.setBounds(252, 49, 174, 76);
		getContentPane().add(psVanier005);
		psVanier005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psVanier005, "005", "Vanier");
			}
		});

		JButton psVanier006 = new JButton("006");
		psVanier006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psVanier006.setBounds(252, 135, 174, 76);
		setColorButton(psVanier006);
		getContentPane().add(psVanier006);
		psVanier006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psVanier006, "006", "Vanier");
			}
		});

		JButton psVanier007 = new JButton("007");
		psVanier007.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psVanier007);
		psVanier007.setBounds(252, 241, 174, 76);
		getContentPane().add(psVanier007);
		psVanier007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psVanier007, "007", "Vanier");
			}
		});

		JButton psVanier008 = new JButton("008");
		psVanier008.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psVanier008.setBounds(252, 327, 174, 76);
		setColorButton(psVanier008);
		getContentPane().add(psVanier008);
		psVanier008.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psVanier008, "008", "Vanier");
			}
		});

		JButton backButton = new JButton("back");
		backButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new LotChoiceView(thisView.frame), "Lot");
			}
		});
		backButton.setBounds(341, 10, 85, 21);
		getContentPane().add(backButton);
	}

	public void setColorButton(JButton button) {
		if (UserController.isSpotTaken(button.getText(), "Varnier") == false) {
			parkingSpot.setState(new Available());// will notify user spot is available
			button.setToolTipText(parkingSpot.alert());
			button.setBackground(Color.green);
		} else {
			parkingSpot.setState(new Unavailable());// will notify user spot isnt available
			button.setToolTipText(parkingSpot.alert()); // using State to set tooltip
			button.setBackground(Color.red);
		}
	}

	public AlertStateContext getParkingSpotState() {
		return parkingSpot;
	}
	
	private void addParkingSpot(JButton spot, String Id, String lot) {
		if (spot.getBackground() == Color.green) {
			UserController.addParkingSpot(Id, lot);// try without id param
			thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");
		} else {
			JOptionPane.showMessageDialog(null, "Unavailable");
		
	}}
	
	

}