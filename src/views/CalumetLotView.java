package views;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controllers.UserController;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalumetLotView extends JFrame {
	private CalumetLotView thisView = this;
	protected Main frame;
	private AlertStateContext alert = new AlertStateContext(); // to alert if spot is available

	public CalumetLotView(Main frame) {

		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Calumet");
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
		
		JLabel lblCalumetLot = new JLabel("Calumet Lot");
		lblCalumetLot.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalumetLot.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCalumetLot.setBounds(135, 21, 161, 25);
		getContentPane().add(lblCalumetLot);
		
		JButton psCalumet001 = new JButton("001");
		psCalumet001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet001.setBounds(252, 327, 174, 76);
		getContentPane().add(psCalumet001);
		setColorButton(psCalumet001); // checks to see if parking spot is available


		JButton psCalumet002 = new JButton("002");
		psCalumet002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet002.setBounds(252, 241, 174, 76);
		getContentPane().add(psCalumet002);
		setColorButton(psCalumet002);
		
		JButton psCalumet003 = new JButton("003");
		psCalumet003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet003.setBounds(252, 155, 174, 76);
		getContentPane().add(psCalumet003);
		setColorButton(psCalumet003);
		
		JButton psCalumet004 = new JButton("004");
		psCalumet004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet004.setBounds(252, 68, 174, 76);
		getContentPane().add(psCalumet004);
		setColorButton(psCalumet004);
		
		JButton psCalumet005 = new JButton("005");
		psCalumet005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet005.setBounds(10, 229, 76, 174);
		getContentPane().add(psCalumet005);
		setColorButton(psCalumet005);
		
		JButton psCalumet006 = new JButton("006");
		psCalumet006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet006.setBounds(10, 45, 76, 174);
		getContentPane().add(psCalumet006);
		setColorButton(psCalumet006);
		
		JButton backButton = new JButton("back");
		
		// can we index through these instead?
		psCalumet001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(psCalumet001.getBackground()==Color.green) {
					UserController.addParkingSpot("001", "Calumet");// try without id param
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");
				}else {
				JOptionPane.showMessageDialog(null,"Unavailable");
				}
			}
		});
		psCalumet002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(psCalumet002.getBackground()==Color.green) {
					UserController.addParkingSpot("002", "Calumet");// try without id param
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");
				}else {
				JOptionPane.showMessageDialog(null,"Unavailable");
				}
			}
		});
		psCalumet003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(psCalumet003.getBackground()==Color.green) {
					UserController.addParkingSpot("003", "Calumet");// try without id param
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");
				}else {
				JOptionPane.showMessageDialog(null,"Unavailable");
				}
			}
		});
		psCalumet004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(psCalumet004.getBackground()==Color.green) {
					UserController.addParkingSpot("004", "Calumet");// try without id param
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");
				}else {
				JOptionPane.showMessageDialog(null,"Unavailable");
				}
			}
		});
		psCalumet005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(psCalumet005.getBackground()==Color.green) {
					UserController.addParkingSpot("005", "Calumet");// try without id param
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");
				}else {
				JOptionPane.showMessageDialog(null,"Unavailable");
				}
			}
		});
		psCalumet006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(psCalumet006.getBackground()==Color.green) {
					UserController.addParkingSpot("006", "Calumet");// try without id param
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");
				}else {
				JOptionPane.showMessageDialog(null,"Unavailable");
				}
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

	private void setColorButton(JButton button) {
		if(UserController.isSpotTaken(button.getText(), "Calumet") == false) {
			alert.setState(new Available());// will notify user spot is available
			button.setToolTipText(alert.alert());
			button.setBackground(Color.green);
		} else {
			alert.setState(new Unavailable());// will notify user spot isnt available
			button.setToolTipText(alert.alert()); // using State to set tooltip
			button.setBackground(Color.red);
		}
	}
	
	

	
}