package views;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controllers.UserController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SchulichLotView extends JFrame {
	private SchulichLotView thisView = this;
	protected Main frame;
	private AlertStateContext parkingSpot = new AlertStateContext(); // to alert if spot is available

	public SchulichLotView(Main frame) {
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Schulich");
		// Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the frame's size.
		this.setSize(450, 450);
		// Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);

		// Pane setup.
		// Get the content pane.
		Container contentPane = this.getContentPane();
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Schulich Lot");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 10));
		title.setBounds(157, 20, 142, 25);
		getContentPane().add(title);

		JButton psSchulich004 = new JButton("004");
		psSchulich004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich004.setBounds(10, 327, 174, 76);
		setColorButton(psSchulich004);
		getContentPane().add(psSchulich004);

		psSchulich004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psSchulich004, "004", "Schulich");

			}
		});

		JButton psSchulich003 = new JButton("003");
		psSchulich003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich003.setBounds(10, 241, 174, 76);
		setColorButton(psSchulich003);
		getContentPane().add(psSchulich003);

		psSchulich003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psSchulich003, "003", "Schulich");

			}
		});

		JButton psSchulich002 = new JButton("002");
		psSchulich002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich002.setBounds(10, 155, 174, 76);
		setColorButton(psSchulich002);
		getContentPane().add(psSchulich002);
		psSchulich002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psSchulich002, "002", "Schulich");

			}
		});

		JButton psSchulich001 = new JButton("001");
		psSchulich001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich001.setBounds(10, 69, 174, 76);
		setColorButton(psSchulich001);
		getContentPane().add(psSchulich001);
		psSchulich001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psSchulich001, "001", "Schulich");

			}
		});

		JButton psSchulich006 = new JButton("006");
		psSchulich006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich006.setBounds(350, 229, 76, 174);
		setColorButton(psSchulich006);
		getContentPane().add(psSchulich006);
		psSchulich006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psSchulich006, "006", "Schulich");

			}
		});

		JButton psSchulich005 = new JButton("005");
		psSchulich005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich005.setBounds(350, 45, 76, 174);
		setColorButton(psSchulich005);
		getContentPane().add(psSchulich005);
		psSchulich005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addParkingSpot(psSchulich005, "005", "Schulich");

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
		if (UserController.isSpotTaken(button.getText(), "Schulich") == false) {
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