package views;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;


public class InitialView extends JFrame{
	//Default contentPane to be passed.
	private Container contentPane;
	
	//Instance of object for action listener.
	InitialView thisFrame = this;
	
	public static void main(String[] args) {
		new InitialView();
	}
	
	public InitialView() {
		//Frame setup.
		//Set frame title.
		this.setTitle("YorkUParking - Main");
		//Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		
		//Set the frame's size.
		this.setSize(450, 450);	
		//Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);
		
		
		//Pane setup.
		//Get the content pane.
		this.contentPane = this.getContentPane();
		
		//Make a panel for the login options.
		JPanel optionsPane = new JPanel();
		//Set the info pane's layout manager to the vertical box layout.
		optionsPane.setLayout(new BoxLayout(optionsPane, BoxLayout.PAGE_AXIS));
		//Make an invisible border for the info pane.
		optionsPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		//Component setup.
		//Make a new label for title.
		JLabel title = new JLabel("YorkU Parking Booking");
		//Make a new button for logging in.
		JButton loginButton = new JButton("Login");
		//Make a new button for registering.
		JButton registerButton = new JButton("Register");
		
		//Set component alignments.
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Set up font and font size of title.
		title.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		//Build frame.
		//Add buttons to options panel.
		int space = 20;
		optionsPane.add(Box.createVerticalGlue()); //Makes components keep with the top of the pane. Used in centering components with resizing.
		optionsPane.add(title); //Adds title to pane.
		optionsPane.add(Box.createRigidArea(new Dimension(0, space))); //Space between buttons.
		optionsPane.add(registerButton); //Adds registerButton to pane.
		optionsPane.add(Box.createRigidArea(new Dimension(0, space))); //Space between buttons.
		optionsPane.add(loginButton); //Adds loginButton to pane.
		optionsPane.add(Box.createVerticalGlue()); //Makes components keep with the bottom of the pane. Used in centering components with resizing.
		
		//Add options panel to content pane.
		this.contentPane.add(optionsPane);
		
		//Make frame visible.
		this.setVisible(true);
	
		
		//Set up component actions
		//Set up what to do when the register button is pressed.
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Change content pane.
				changeContentPane(new RegisterView(thisFrame));				
			}
		});
		
		//Set up what to do when the add button is pressed.
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Change content pane.
				changeContentPane(new LoginView(thisFrame));
			}
		});
	}
	
	//Changes content pane with that of another frame.
	private void changeContentPane(JFrame frame) {
		//Rename frame.
		this.setTitle("YorkUParking - Register");
		
		//Replace content pane with LoginView content pane.
		this.setContentPane(frame.getContentPane());
		this.validate();			
		
		//Get rid of loginFrame instance to save resources.
		frame.dispose();
	}
	
	//Returns original content pane.
	public Container getOriginalContentPane() {
		return this.contentPane;
	}
}
