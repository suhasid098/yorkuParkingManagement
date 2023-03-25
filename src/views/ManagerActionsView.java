package views;

import javax.swing.*;
import javax.swing.border.*;

import controllers.ManagerController;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ManagerActionsView extends JFrame {
	// Object instance for action listeners.
	private ManagerActionsView thisView = this;

	// Previous frame instance.
	private Main frame;

	// Shared constants.
	private static final int sectionSpace = 20;

	public ManagerActionsView(Main frame) {
		// Save previous frame.
		this.frame = frame;

		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Manager Options");
		// Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the frame's size.
		this.setSize(450, 450);
		// Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);

		// Pane setup.
		// Get the content pane.
		Container contentPane = this.getContentPane();

		// Set up panels.
		// Make a panel for the option buttons.
		JPanel optionsPane = new JPanel();
		// Set the info pane's layout manager to the vertical box layout.
		optionsPane.setLayout(new BoxLayout(optionsPane, BoxLayout.PAGE_AXIS));
		// Make an invisible border for the info pane.
		optionsPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// Make a panel for the logout button.
		JPanel logoutPane = new JPanel();
		// Set the info pane's layout manager to the horizontal box layout.
		logoutPane.setLayout(new BoxLayout(logoutPane, BoxLayout.LINE_AXIS));
		// Make an invisible border for the info pane.
		logoutPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// Component setup.
		// Make a new button for booking a parking space.
		JButton accountsButton = new JButton("Manage Accounts");
		// Make a new button for editing a booking.
		JButton lotsButton = new JButton("Manage Parking Lots");
		// Make a new button for loging out.
		JButton logoutButton = new JButton("Log Out");
		// Welcome text.
		JLabel welcomeLabel = new JLabel("Hello " + ManagerController.getLoggedInManager().getName());

		// Set component alignments.
		accountsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		lotsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		// Set up button fonts and font sizes.
		int fontSize = 10;
		logoutButton.setFont(new Font("Tahoma", Font.PLAIN, fontSize));

		// Build frames.
		// Add option buttons to options panel.
		optionsPane.add(Box.createVerticalGlue()); // Makes components move with the top of the pane. Used in centering
													// components with resizing.
		optionsPane.add(welcomeLabel);
		optionsPane.add(Box.createRigidArea(new Dimension(0, sectionSpace))); // Space between buttons.
		optionsPane.add(accountsButton); // Adds name label to pane.
		optionsPane.add(Box.createRigidArea(new Dimension(0, sectionSpace))); // Space between buttons.
		optionsPane.add(lotsButton); // Adds name field to pane.
		optionsPane.add(Box.createVerticalGlue()); // Makes components move with the bottom of the pane. Used in
													// centering components with resizing.

		// Add logout button to logout panel.
		logoutPane.add(Box.createHorizontalGlue()); // Makes components keep with the right of the pane. Used in
													// centering components with resizing.
		logoutPane.add(logoutButton); // Adds name label to pane.

		// Add options panel to content pane.
		contentPane.add(logoutPane, BorderLayout.NORTH);
		contentPane.add(optionsPane);

		// Set up component actions
		// Set up what to do when the book button is pressed.
		accountsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new ManageAccountsView(thisView.frame), "Manage Accounts");
			}
		});

		// Set up what to do when the edit button is pressed.
		lotsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new ManageLotsView(thisView.frame), "Manage Parking Lots");
			}
		});

		// Set up what to do when the logout button is pressed.
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerController.logOutManager();

				// Rename frame.
				thisView.frame.resetContentPane();
			}
		});
	}
}
