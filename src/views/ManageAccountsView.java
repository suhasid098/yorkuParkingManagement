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
	
	//List and list model for parking lots
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JList<String> accountList = new JList<String>(listModel);
	
	private static final int componentSeperation = 10;
	
	//List setup.
	private void listSetup() {
		/*We should have the parking lots stored somewhere and this string should
		* grab the names from each lot object, this really shouldn't be hardcoded.*/
		for(User user: UserController.getUnapprovedUsers()) {
			listModel.addElement("Name: " + user.getName() + "    Email: " + user.getEmail());
		}
			
		//Set up List dimensions.
		accountList.setPrototypeCellValue("Using this to set the list cell width");
		accountList.setPreferredSize(new Dimension(200, 300));
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
		//Make button for generating accounts for super manager.
		JButton accountButton = new JButton("Generate Account");
		//Make a new button for loging out.
		JButton backButton = new JButton("Back");
		
		//Align components.
		listLabel.setAlignmentX(CENTER_ALIGNMENT);
		labelPane.setAlignmentX(CENTER_ALIGNMENT);
		accountButton.setAlignmentX(CENTER_ALIGNMENT);
				
		//Set up fonts and font sizes.
		int fontSize = 10;
		backButton.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
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
		
		accountPaneSetup(accountPane, accountButton, labelPane);
		
		backPane.add(Box.createHorizontalGlue());
		backPane.add(backButton);
		
		centerPane.add(listPane);
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
		        	
		        	//Determine selected list item and disable or enable the lot that corresponds to that item.
		        	String selectedValue = (String) accountList.getSelectedValue();
		            for(int i = 0; i<listModel.getSize(); i++) {
		            	if(listModel.getElementAt(i).equals(selectedValue)) {
		            		//Disable or enable entire lot here.
		            	}
		            }
		        }
		    }
		});
		
		//Set up what to do when an item in the ingredient list is double-clicked.
		accountList.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {
		        if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
		        	//Switch to lot view to allow for parking space toggling.
		        }
		    }
		});
		
		//Set up what to do when the logout button is pressed.
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new ManagerActionsView(thisView.frame), "Manager Actions");
			}
		});
		
		//Set up what to do when the generateAccount button is pressed.
		accountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager manager = ManagerController.generateManager();
				if(manager != null) {
					accountLabel.setText("<html><center>Account Successfully Generated<br> <br>Username: " + manager.getName() + "<br>Password: " + manager.getPassword() + "</center></html>");
				}				
			}
		});
	}
}
