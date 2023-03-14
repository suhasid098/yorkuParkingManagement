package views;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class RegisterView extends LoginView {
	public RegisterView(JFrame previousFrame) {
		super(previousFrame);
		
		//Change save button text.
		this.saveButton.setText("Login");
		
		//Add confirm password label and text field to field pane.
		//Make a new label for confirm password.
		JLabel confirmLabel = new JLabel("Confirm Password");
		//Make a new text field for confirm password.
		JTextField confirmField = new JTextField();
		
		//Set confirm label and field alignment.
		confirmLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		confirmField.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Set up confirm field size and prevent resizing.
		confirmField.setSize(fieldX, fieldY);
		confirmField.setMaximumSize(confirmField.getSize());
		
		///Remove last vertical glue.
		this.fieldPane.remove(this.fieldPane.getComponentCount()-1);
		
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, diffSectionSpace))); //Space between buttons.
		this.fieldPane.add(confirmLabel); //Adds name label to pane.
		this.fieldPane.add(Box.createRigidArea(new Dimension(0, sameSectionSpace))); //Space between buttons.
		this.fieldPane.add(confirmField); //Adds name field to pane.
		this.fieldPane.add(Box.createVerticalGlue()); //Makes components keep with the left of the pane. Used in centering components with resizing.
	}
}
