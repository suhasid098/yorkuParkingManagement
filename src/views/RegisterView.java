package views;

import javax.swing.*;
import javax.swing.border.*;

import controllers.UserController;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

@SuppressWarnings("serial")
public class RegisterView extends LoginView {
	private RegisterView thisView = this;
	
	//More fields to be edited.
	private JTextField nameField;
	private JPasswordField confirmField;
	private JLabel selectType;
	private JRadioButton faculty;
	private JRadioButton nonFaculty;
	private JRadioButton student;
	private JRadioButton visitor;
	protected String buttonText;
	
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
		this.selectType = new JLabel("Select type");
		this.faculty = new JRadioButton("Faculty");
		this.nonFaculty = new JRadioButton("Non-Faculty");
		this.student = new JRadioButton("Student");
		this.visitor = new JRadioButton("Visitor");

		
		//Set confirm label and field alignment.
		nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		confirmLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.nameField.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.confirmField.setAlignmentX(Component.CENTER_ALIGNMENT);
		selectType.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.faculty.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.nonFaculty.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.student.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.visitor.setAlignmentX(Component.CENTER_ALIGNMENT);

		
		//Set up field size and prevent resizing.
		this.nameField.setSize(fieldX, fieldY);
		this.nameField.setMaximumSize(nameField.getSize());
		this.confirmField.setSize(fieldX, fieldY);
		this.confirmField.setMaximumSize(confirmField.getSize());
		
		this.faculty.setSize(fieldX, fieldY);
		this.faculty.setMaximumSize(faculty.getSize());
		
		this.nonFaculty.setSize(fieldX, fieldY);
		this.nonFaculty.setMaximumSize(faculty.getSize());
		
		this.student.setSize(fieldX, fieldY);
		this.student.setMaximumSize(faculty.getSize());
		
		this.visitor.setSize(fieldX, fieldY);
		this.visitor.setMaximumSize(faculty.getSize());
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
		
		this.fieldPane.add(selectType, fieldPane.getComponentCount()-pos); //Adds name field to pane.
		this.fieldPane.add(faculty, fieldPane.getComponentCount()-pos);
		this.fieldPane.add(nonFaculty, fieldPane.getComponentCount()-pos);
		this.fieldPane.add(student, fieldPane.getComponentCount()-pos);
		this.fieldPane.add(visitor, fieldPane.getComponentCount()-pos);

	    ButtonGroup group = new ButtonGroup();
	    group.add(faculty);
	    group.add(nonFaculty);
	    group.add(student);
	    group.add(visitor);
	    
		//Alter what to do when the save button is pressed.
		//Remove action listeners.
		for(ActionListener l : this.saveButton.getActionListeners()) {
			this.saveButton.removeActionListener(l);
		}
		
		//Replace action listener.
		this.saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
		            AbstractButton button = buttons.nextElement();

		            if (button.isSelected()) {
		                buttonText = button.getText();
		            }
		        }
				String result = UserController.registerUser(thisView.nameField.getText(), thisView.emailField.getText(), new String(thisView.passField.getPassword()), new String(thisView.confirmField.getPassword()), new String(buttonText));

				errorLabel.setText(result);
				
				if(result.equals("")) {
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");	
				}
			}
		});
	}
}
