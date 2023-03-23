package views;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.UserController;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LassondeLotView extends JFrame {
	private LassondeLotView thisView = this;
	protected Main frame;
	public LassondeLotView(Main frame) {
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Lassonde");
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
		
		JLabel lblLassondeLot = new JLabel("Lassonde Lot");
		lblLassondeLot.setHorizontalAlignment(SwingConstants.CENTER);
		lblLassondeLot.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLassondeLot.setBounds(147, 19, 159, 25);
		getContentPane().add(lblLassondeLot);
		
		JButton psLassonde001 = new JButton("001");
		psLassonde001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psLassonde001.setBounds(10, 54, 76, 174);
		setColorButton(psLassonde001);
		getContentPane().add(psLassonde001);
		
		JButton psLassonde002 = new JButton("002");
		psLassonde002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psLassonde002.setBounds(100, 54, 76, 174);
		setColorButton(psLassonde002);
		getContentPane().add(psLassonde002);
		
		JButton psLassonde004 = new JButton("004");
		psLassonde004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psLassonde004.setBounds(350, 54, 76, 174);
		setColorButton(psLassonde004);
		getContentPane().add(psLassonde004);
		
		JButton psLassonde003 = new JButton("003");
		psLassonde003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psLassonde003.setBounds(264, 54, 76, 174);
		setColorButton(psLassonde003);
		getContentPane().add(psLassonde003);
		
		JButton psLassonde005 = new JButton("005");
		psLassonde005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psLassonde005.setBounds(10, 238, 76, 174);
		setColorButton(psLassonde005);
		getContentPane().add(psLassonde005);
		
		JButton psLassonde006 = new JButton("006");
		psLassonde006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psLassonde006.setBounds(100, 238, 76, 174);
		setColorButton(psLassonde006);
		getContentPane().add(psLassonde006);
		
		JButton psLassonde007 = new JButton("007");
		psLassonde007.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psLassonde007.setBounds(264, 238, 76, 174);
		setColorButton(psLassonde007);
		getContentPane().add(psLassonde007);
		
		JButton psLassonde008 = new JButton("008");
		psLassonde008.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psLassonde008.setBounds(350, 238, 76, 174);
		setColorButton(psLassonde008);
		getContentPane().add(psLassonde008);
		
		psLassonde001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("001", "Lassonde");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		psLassonde002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("002", "Lassonde");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		psLassonde003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("003", "Lassonde");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		psLassonde004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("004", "Lassonde");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		psLassonde005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("005", "Lassonde");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		psLassonde006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("006", "Lassonde");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		psLassonde007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("007", "Lassonde");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		psLassonde008.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("008", "Lassonde");
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});

		JButton backButton = new JButton("back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new LotChoiceView(thisView.frame), "Lot");
				
			}
		});
		backButton.setBounds(341, 10, 85, 21);
		getContentPane().add(backButton);
	}
	private void setColorButton(JButton button) {
		if(UserController.isSpotTaken(button.getText(), "Lassonde") == false) {
			button.setBackground(Color.green);
		} else {
			button.setBackground(Color.red);
		}
	}
}