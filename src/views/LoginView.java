package views;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class LoginView extends JFrame{
	//Object instance for action listeners.
	LoginView thisView = this;
	
	//Previous frame instance.
	protected JFrame frame;
	
	//Objects to be edited by child.
	protected JButton saveButton;
	protected JPanel fieldPane;
	
	//Shared constants.
	protected static final int sameSectionSpace = 5;
	protected static final int diffSectionSpace = 20;	
	protected static final int fieldX = 280;
	protected static final int fieldY = 30; //This value doesn't actually get used for some reason.
	
	public LoginView(JFrame frame) {
		//Save previous frame.
		this.frame = frame;
		
		//Frame setup.
		//Set frame title.
		this.setTitle("YorkUParking - Login");
		//Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		
		//Set the frame's size.
		this.setSize(450, 450);	
		//Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);
		
		
		//Pane setup.
		//Get the content pane.
		Container contentPane = this.getContentPane();
		
		//Set up panels.
		//Make a panel for the login fields and labels.
		this.fieldPane = new JPanel();
		//Set the info pane's layout manager to the vertical box layout.
		this.fieldPane.setLayout(new BoxLayout(this.fieldPane, BoxLayout.PAGE_AXIS));
		//Make an invisible border for the info pane.
		this.fieldPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Make a panel for the buttons.
		JPanel buttonPane = new JPanel();
		//Set the info pane's layout manager to the horizontal box layout.
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		//Make an invisible border for the info pane.
		buttonPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		//Component setup.
		//Make a new label for username.
		JLabel nameLabel = new JLabel("Username");
		//Make a new label for password.
		JLabel passLabel = new JLabel("Password");
		//Make a new text field for username.
		JTextField nameField = new JTextField();
		//Make a new text field for password.
		JTextField passField = new JTextField();
		//Make a new button for registering.
		this.saveButton = new JButton("Login");
		//Make a new button for canceling.
		JButton cancelButton = new JButton("Cancel");
		
		//Set component alignments.
		nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		passLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
		passField.setAlignmentX(Component.CENTER_ALIGNMENT);
				
		//Set up text field sizes and prevent resizing.
		nameField.setSize(fieldX, fieldY);
		nameField.setMaximumSize(nameField.getSize());
		passField.setSize(fieldX, fieldY);
		passField.setMaximumSize(passField.getSize());
		
		//Set up button fonts and font sizes.
		int fontSize = 10;
		this.saveButton.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
		
		//Build frame.
		//Add labels and fields to field panel.
		this.fieldPane.add(Box.createVerticalGlue()); //Makes components move with the top of the pane. Used in centering components with resizing.
		this.fieldPane.add(nameLabel); //Adds name label to pane.
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, sameSectionSpace))); //Space between buttons.
		this.fieldPane.add(nameField); //Adds name field to pane.
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, diffSectionSpace))); //Space between buttons.
		this.fieldPane.add(passLabel); //Adds name label to pane.
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, sameSectionSpace))); //Space between buttons.
		this.fieldPane.add(passField); //Adds name field to pane.
		this.fieldPane.add(Box.createVerticalGlue()); //Makes components move with the bottom of the pane. Used in centering components with resizing.
		
		//Add buttons to button panel.
		buttonPane.add(Box.createHorizontalGlue()); //Makes components keep with the right of the pane. Used in centering components with resizing.
		buttonPane.add(this.saveButton); //Adds name label to pane.
		buttonPane.add(Box.createRigidArea(new Dimension(sameSectionSpace, 0))); //Space between buttons.
		buttonPane.add(cancelButton); //Adds name field to pane.
		buttonPane.add(Box.createHorizontalGlue()); //Makes components keep with the left of the pane. Used in centering components with resizing.
		
		//Add options panel to content pane.
		contentPane.add(this.fieldPane);
		contentPane.add(buttonPane, BorderLayout.SOUTH);
		
		
		//Set up component actions
		//Set up what to do when the register button is pressed.
		this.saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
									
			}
		});
		
		//Set up what to do when the add button is pressed.
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Rename frame.
				thisView.frame.setTitle("YorkUParking - Main");
				
				//Change content pane back.
				thisView.frame.setContentPane(((InitialView)thisView.frame).getOriginalContentPane());		
				thisView.frame.validate();
			}
		});
	}
}
