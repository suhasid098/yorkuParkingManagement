package views;

import javax.swing.*;
import javax.swing.border.*;

import controllers.UserController;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class RegisterView extends LoginView {
	private RegisterView thisView = this;
	
	//More fields to be edited.
	private JTextField nameField;
	private JPasswordField confirmField;
	
	public RegisterView(Main previousFrame) {
		super(previousFrame);
		
		//Change save button text.
		this.saveButton.setText("Register Account");
		
		//Add labels and text fields to field pane.
		//Make a new label for name.
		JLabel nameLabel = new JLabel("Name");
		//Make a new label for confirm password.
		JLabel confirmLabel = new JLabel("Confirm Password");
		//Make a new text field for name.
		this.nameField = new JTextField();
		//Make a new text field for confirm password.
		this.confirmField = new JPasswordField();
		
		//Set confirm label and field alignment.
		nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		confirmLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.confirmField.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Set up field size and prevent resizing.
		this.nameField.setSize(fieldX, fieldY);
		this.nameField.setMaximumSize(nameField.getSize());
		this.confirmField.setSize(fieldX, fieldY);
		this.confirmField.setMaximumSize(confirmField.getSize());
		
		//Add components to top of pane.
		int pos = 1;
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, diffSectionSpace)), pos); //Space between section.
		this.fieldPane.add(nameField, pos);
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, sameSectionSpace)), pos); //Space between label and field.
		this.fieldPane.add(nameLabel, pos);
		
		//Add components before error label.
		pos = 3;
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, diffSectionSpace)), fieldPane.getComponentCount()-pos); //Space between section.
		this.fieldPane.add(confirmLabel, fieldPane.getComponentCount()-pos); //Adds name label to pane.
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, sameSectionSpace)), fieldPane.getComponentCount()-pos); //Space between label and field.
		this.fieldPane.add(confirmField, fieldPane.getComponentCount()-pos); //Adds name field to pane.
		
		
		//Alter what to do when the save button is pressed.
		//Remove action listeners.
		for(ActionListener l : this.saveButton.getActionListeners()) {
			this.saveButton.removeActionListener(l);
		}
		
		//Replace action listener.
		this.saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = UserController.registerUser(thisView.nameField.getText(), thisView.emailField.getText(), thisView.passField.getText(), thisView.confirmField.getText());
				
				errorLabel.setText(result);
				
				if(result.equals("")) {
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");	
				}
			}
		});
	}
}
