package views;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.UserController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SchulichLotView extends JFrame {
	private SchulichLotView thisView = this;
	protected Main frame;
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
		
		JLabel lblCalumetLot = new JLabel("Schulich Lot");
		lblCalumetLot.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalumetLot.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCalumetLot.setBounds(157, 20, 142, 25);
		getContentPane().add(lblCalumetLot);
		
		JButton psSchulich004 = new JButton("004");
		psSchulich004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich004.setBounds(10, 327, 174, 76);
		setColorButton(psSchulich004);
		getContentPane().add(psSchulich004);
		psSchulich004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("004", "Schulich");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		
		JButton psSchulich003 = new JButton("003");
		psSchulich003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich003.setBounds(10, 241, 174, 76);
		setColorButton(psSchulich003);
		getContentPane().add(psSchulich003);
		psSchulich003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("003", "Schulich");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		
		JButton psSchulich002 = new JButton("002");
		psSchulich002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich002.setBounds(10, 155, 174, 76);
		setColorButton(psSchulich002);
		getContentPane().add(psSchulich002);
		psSchulich002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("002", "Schulich");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		
		JButton psSchulich001 = new JButton("001");
		psSchulich001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich001.setBounds(10, 69, 174, 76);
		setColorButton(psSchulich001);
		getContentPane().add(psSchulich001);
		psSchulich001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("001", "Schulich");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		
		JButton psSchulich006 = new JButton("006");
		psSchulich006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich006.setBounds(350, 229, 76, 174);
		setColorButton(psSchulich006);
		getContentPane().add(psSchulich006);
		psSchulich006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("006", "Schulich");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		
		JButton psSchulich005 = new JButton("005");
		psSchulich005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich005.setBounds(350, 45, 76, 174);
		setColorButton(psSchulich005);
		getContentPane().add(psSchulich005);
		psSchulich005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("005", "Schulich");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

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
	private void setColorButton(JButton button) {
		if(UserController.isSpotTaken(button.getText(), "Schulich") == false) {
			button.setBackground(Color.green);
		} else {
			button.setBackground(Color.red);
		}
	}
}