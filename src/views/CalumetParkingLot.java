package views;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.UserController;
import model.MaintainUser;

import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

@SuppressWarnings("serial")
public class CalumetParkingLot extends JFrame {

	//Object instance for action listeners.
	private CalumetParkingLot thisView = this;
	
	//Previous frame instance.
	private Main frame;
	
	//Shared constants.
	private static final int sectionSpace = 20;
	
	// id is id of user
	public CalumetParkingLot(Main frame) {
		//Save previous frame.
		this.frame = frame;
		
		//Frame setup.
		//Set frame title.
		this.setTitle("SelectParkingSpot - Calumet Parking Spots");
		//Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		
		//Set the frame's size.
		this.setSize(450, 450);	
		//Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("A1");
		btnNewButton.setBounds(162, 201, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(320, 362, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// loggedInUser var should be set by now
				UserController.addParkingSpot("A1");// try without id param
				
				thisView.frame.resetContentPane();
				
				//Rename frame.
//				thisView.frame.
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.logOutUser();
				thisView.frame.resetContentPane();
				
				//Rename frame.
//				thisView.frame.
			}
		});
		

	}
}
