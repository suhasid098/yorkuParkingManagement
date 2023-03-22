package views;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controllers.ManagerController;
import controllers.UserController;
import objects.Manager;
import objects.SuperManager;
import objects.User;

@SuppressWarnings("serial")
public class ManageAccountsView extends JFrame {
	//Object instance for action listeners.
	private ManageAccountsView thisView = this;
	
	//Previous frame instance.
	private Main frame;
	
	//Selected list value
	private int selectedIndex = -1;
	
	//List and list model for parking lots
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JList<String> accountList = new JList<String>(listModel);
	
	private static final int componentSeperation = 10;
	
	//List setup.
	private void listSetup() {
		/*We should have the parking lots stored somewhere and this string should
		* grab the names from each lot object, this really shouldn't be hardcoded.*/
		for(User user: UserController.getUnapprovedUsers()) {
			listModel.addElement("Type: " + user.getAccountType() + "    Email: " + user.getEmail() + "    Name: " + user.getName());
		}
			
		//Set up List dimensions.
		accountList.setPrototypeCellValue("Using this to set the list cell width because I don't know of a better way to do it.");
		accountList.setPreferredSize(new Dimension(300, 300));
	}
	
	//Adds account generation option if logged in manager is super manager.
	private void accountPaneSetup(JPanel panel, JButton button, JPanel labelPane) {
		if(ManagerController.getLoggedInManager().getId() == 0) {
			panel.add(Box.createVerticalGlue());
			panel.add(button);
			panel.add(Box.createRigidArea(new Dimension(0, componentSeperation)));
			panel.add(labelPane);
			panel.add(Box.createRigidArea(new Dimension(0, componentSeperation)));
			panel.add(Box.createVerticalGlue());
		}
	}
	
	public ManageAccountsView(Main frame) {
		//Save previous frame.
		this.frame = frame;
		
		//Frame setup.
		//Set frame title.
		this.setTitle("YorkUParking - Manage Accounts");
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
		//Panel for center panels.
		JPanel centerPane = new JPanel();
		//Set the pane's layout manager to the vertical box layout.
		centerPane.setLayout(new BoxLayout(centerPane, BoxLayout.PAGE_AXIS));
		
		//Make a panel for the list.
		JPanel listPane = new JPanel();
		//Set the pane's layout manager to the vertical box layout.
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
		//Make an invisible border for the pane.
		listPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Make a panel for approve and deny buttons.
		JPanel buttonPane = new JPanel();
		//Set the pane's layout manager to the vertical box layout.
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
		//Make an invisible border for the pane.
		buttonPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Make a panel for account generation.
		JPanel accountPane = new JPanel();
		//Set the pane's layout manager to the horizontal box layout.
		accountPane.setLayout(new BoxLayout(accountPane, BoxLayout.PAGE_AXIS));
		//Make an invisible border for the pane.
		accountPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Make a panel for account generation.
		JPanel backPane = new JPanel();
		//Set the pane's layout manager to the horizontal box layout.
		backPane.setLayout(new BoxLayout(backPane, BoxLayout.LINE_AXIS));
		//Make an invisible border for the pane.
		backPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Make a panel for account label.
		JPanel labelPane = new JPanel();
		
		
		//Component setup.
		//Page title.
		JLabel listLabel = new JLabel("Unapproved Accounts");
		//Result Message.
		JLabel accountLabel = new JLabel(" ");
		labelPane.add(accountLabel);
		//Make approve and deny buttons and disable them by default.
		JButton approveButton = new JButton("Approve");
		JButton denyButton = new JButton("Deny");
		approveButton.setEnabled(false);
		denyButton.setEnabled(false);
		//Make button for generating accounts for super manager.
		JButton accountButton = new JButton("Generate Manager");
		//Make a new button for loging out.
		JButton backButton = new JButton("Back");
		
		//Align components.
		listLabel.setAlignmentX(CENTER_ALIGNMENT);
		buttonPane.setAlignmentX(CENTER_ALIGNMENT);
		labelPane.setAlignmentX(CENTER_ALIGNMENT);
		accountButton.setAlignmentX(CENTER_ALIGNMENT);
				
		//Set up fonts and font sizes.
		int fontSize = 10;
		backButton.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
		approveButton.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
		denyButton.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
		listLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		//Set up label pane size.
		labelPane.setMaximumSize(new Dimension(Integer.MAX_VALUE, (int)labelPane.getMinimumSize().getHeight()));
		
		//Set up list
		listSetup();
		
		//Build frames.
		//Add option buttons to options panel.
		listPane.add(Box.createVerticalGlue()); //Makes components move with the top of the pane. Used in centering components with resizing.
		listPane.add(listLabel);
		listPane.add(Box.createRigidArea(new Dimension(0, componentSeperation)));
		listPane.add(this.accountList);
		listPane.add(Box.createRigidArea(new Dimension(0, componentSeperation)));
		listPane.add(Box.createVerticalGlue()); //Makes components move with the bottom of the pane. Used in centering components with resizing.
		
		buttonPane.add(Box.createHorizontalGlue());
		buttonPane.add(denyButton);
		buttonPane.add(Box.createRigidArea(new Dimension(componentSeperation, 0)));
		buttonPane.add(approveButton);
		buttonPane.add(Box.createHorizontalGlue());
		
		accountPaneSetup(accountPane, accountButton, labelPane);
		
		backPane.add(Box.createHorizontalGlue());
		backPane.add(backButton);
		
		centerPane.add(listPane);
		centerPane.add(buttonPane);
		centerPane.add(Box.createRigidArea(new Dimension(0, componentSeperation)));
		centerPane.add(accountPane);
		
		//Add panels to content pane.
		contentPane.add(centerPane);
		contentPane.add(backPane, BorderLayout.SOUTH);
		
		//Set up what to do when an item in the lot list is selected.
		accountList.addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()){
		           
		        	//Check that selection isn't empty.
		        	if(accountList.isSelectionEmpty()) {
		        		return;
		        	}
		        	
					approveButton.setEnabled(true);
					denyButton.setEnabled(true);
		        	
		        	//Determine selected list item and disable or enable the lot that corresponds to that item.
		        	String selectedValue = (String) accountList.getSelectedValue();
		            for(int i = 0; i<listModel.getSize(); i++) {
		            	if(listModel.getElementAt(i).equals(selectedValue)) {
		            		thisView.selectedIndex = i;
		            	}
		            }
		        }
		    }
		});
		
		//Set up what to do when the back button is pressed.
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new ManagerActionsView(thisView.frame), "Manager Actions");
			}
		});
		
		//Set up what to do when the approve button is pressed.
		approveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(thisView.selectedIndex == -1) {
					return;
				}
				UserController.approveUser(UserController.getUnapprovedUsers().get(thisView.selectedIndex));
				thisView.accountList.clearSelection();
				thisView.listModel.removeElementAt(selectedIndex);
				thisView.selectedIndex = -1;
				
				approveButton.setEnabled(false);
				denyButton.setEnabled(false);
			}
		});
		
		//Set up what to do when the deny button is pressed.
		denyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(thisView.selectedIndex == -1) {
					return;
				}
				UserController.denyUser(UserController.getUnapprovedUsers().get(thisView.selectedIndex));
				thisView.accountList.clearSelection();
				thisView.listModel.removeElementAt(selectedIndex);
				thisView.selectedIndex = -1;
				
				approveButton.setEnabled(false);
				denyButton.setEnabled(false);
			}
		});
		
		//Set up what to do when the generateAccount button is pressed.
		accountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager manager = ManagerController.generateManager();
				if(manager != null) {
					accountLabel.setText("<html><center>Username: " + manager.getName() + "<br>Password: " + manager.getPassword() + "</center></html>");
				}				
			}
		});
	}
}
