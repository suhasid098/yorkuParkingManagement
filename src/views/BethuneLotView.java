package views;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controllers.UserController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class BethuneLotView extends JFrame {
	private BethuneLotView thisView = this;
	protected Main frame;
	private AlertStateContext parkingSpot = new AlertStateContext(); // to alert if spot is available

	public BethuneLotView(Main frame) {
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Bethune");
		// Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the frame's size.
		this.setSize(450, 450);
		// Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);

		this.getContentPane();
		getContentPane().setLayout(null);

		JButton psBethune006 = new JButton("006");
		psBethune006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune006.setBounds(10, 229, 76, 174);
		setColorButton(psBethune006);
		getContentPane().add(psBethune006);

		JLabel lblBethuneLot = new JLabel("Bethune Lot");
		lblBethuneLot.setHorizontalAlignment(SwingConstants.CENTER);
		lblBethuneLot.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBethuneLot.setBounds(169, 20, 141, 15);
		getContentPane().add(lblBethuneLot);

		JButton psBethune007 = new JButton("007");
		psBethune007.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune007.setBounds(96, 229, 76, 174);
		setColorButton(psBethune007);
		getContentPane().add(psBethune007);

		JButton psBethune008 = new JButton("008");
		psBethune008.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune008.setBounds(186, 229, 76, 174);
		setColorButton(psBethune008);
		getContentPane().add(psBethune008);

		JButton psBethune009 = new JButton("009");
		psBethune009.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune009.setBounds(272, 229, 76, 174);
		setColorButton(psBethune009);
		getContentPane().add(psBethune009);

		JButton psBethune010 = new JButton("010");
		psBethune010.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune010.setBounds(358, 229, 76, 174);
		setColorButton(psBethune010);
		getContentPane().add(psBethune010);

		JButton psBethune005 = new JButton("005");
		psBethune005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune005.setBounds(358, 45, 76, 174);
		setColorButton(psBethune005);
		getContentPane().add(psBethune005);

		JButton psBethune004 = new JButton("004");
		psBethune004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune004.setBounds(272, 45, 76, 174);
		setColorButton(psBethune004);
		getContentPane().add(psBethune004);

		JButton psBethune003 = new JButton("003");
		psBethune003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune003.setBounds(186, 45, 76, 174);
		setColorButton(psBethune003);
		getContentPane().add(psBethune003);

		JButton psBethune002 = new JButton("002");
		psBethune002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psBethune002);
		psBethune002.setBounds(96, 45, 76, 174);
		getContentPane().add(psBethune002);

		JButton psBethune001 = new JButton("001");
		psBethune001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune001.setBounds(10, 45, 76, 174);
		setColorButton(psBethune001);
		getContentPane().add(psBethune001);

		JButton backButton = new JButton("back");

		psBethune001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now
				addParkingSpot(psBethune001, "001", "Bethune");
			}

		});

		psBethune002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now
				addParkingSpot(psBethune002, "002", "Bethune");

			}
		});
		psBethune003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now
				addParkingSpot(psBethune003, "003", "Bethune");
			}
		});
		psBethune004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now
				addParkingSpot(psBethune004, "004", "Bethune");

			}
		});
		psBethune005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now
				addParkingSpot(psBethune005, "005", "Bethune");

			}
		});
		psBethune006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now
				addParkingSpot(psBethune006, "006", "Bethune");
			}
		});
		psBethune007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now
				addParkingSpot(psBethune007, "007", "Bethune");
			}
		});
		psBethune008.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now
				addParkingSpot(psBethune008, "008", "Bethune");
			}
		});
		psBethune009.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// loggedInUser var should be set by now

				addParkingSpot(psBethune009, "009", "Bethune");

			}
		});
		psBethune010.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psBethune010, "010", "Bethune");
			}
		});

		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new LotChoiceView(thisView.frame), "Lot");
			}
		});
		backButton.setBounds(341, 10, 85, 21);
		getContentPane().add(backButton);

	}

	public void setColorButton(JButton button) {
		if (UserController.isSpotTaken(button.getText(), "Bethune") == false) {
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
		}
	}
}