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

@SuppressWarnings("serial")
public class ManageLotsView extends JFrame {
	//Object instance for action listeners.
	private ManageLotsView thisView = this;
	
	//Previous frame instance.
	private Main frame;
	
	//List and list model for parking lots
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JList<String> lotList = new JList<String>(listModel);
	
	private static final int componentSeperation = 10;
	
	//List setup.
	private void listSetup() {
		/*We should have the parking lots stored somewhere and this string should
		* grab the names from each lot object, this really shouldn't be hardcoded.*/
		String[] lots = {"Vanier", "Bethune", "Calumet", "Schulich", "Lassonde"};
		for(int i = 0; i<lots.length; i++) {
			//This is also temp hardcoded.
			String status = "Enabled";
			listModel.addElement(lots[i] + ": " + status);
		}
			
		//Set up List dimensions.
		lotList.setPrototypeCellValue("Using this to set the list cell width");
		lotList.setPreferredSize(new Dimension(200, 300));
	}
	
	public ManageLotsView(Main frame) {
		//Save previous frame.
		this.frame = frame;
		
		//Frame setup.
		//Set frame title.
		this.setTitle("YorkUParking - Manage Parking Lots");
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
		//Make a panel for the list.
		JPanel listPane = new JPanel();
		//Set the pane's layout manager to the vertical box layout.
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
		//Make an invisible border for the pane.
		listPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//Make a panel for the logout button.
		JPanel backPane = new JPanel();
		//Set the pane's layout manager to the horizontal box layout.
		backPane.setLayout(new BoxLayout(backPane, BoxLayout.LINE_AXIS));
		//Make an invisible border for the pane.
		backPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		//Component setup.
		//Page title.
		JLabel lotsLabel = new JLabel("Parking Lots");
		//Make a new button for loging out.
		JButton backButton = new JButton("Back");
		
		//Align components.
		lotsLabel.setAlignmentX(CENTER_ALIGNMENT);
		backButton.setAlignmentX(CENTER_ALIGNMENT);
				
		//Set up fonts and font sizes.
		int fontSize = 10;
		backButton.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
		lotsLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		//Set up list
		listSetup();
		
		//Build frames.
		//Add option buttons to options panel.
		listPane.add(Box.createVerticalGlue()); //Makes components move with the top of the pane. Used in centering components with resizing.
		listPane.add(lotsLabel);
		listPane.add(Box.createRigidArea(new Dimension(0, componentSeperation)));
		listPane.add(this.lotList);
		listPane.add(Box.createVerticalGlue()); //Makes components move with the bottom of the pane. Used in centering components with resizing.
		
		//Add logout button to logout panel.
		
		backPane.add(Box.createHorizontalGlue());
		backPane.add(backButton); //Adds name label to pane.
		
		//Add options panel to content pane.
		contentPane.add(listPane);
		contentPane.add(backPane, BorderLayout.SOUTH);
		
		//Set up what to do when an item in the lot list is selected.
		lotList.addListSelectionListener(new ListSelectionListener() {
		    public void valueChanged(ListSelectionEvent e) {
		        if (!e.getValueIsAdjusting()){
		           
		        	//Check that selection isn't empty.
		        	if(lotList.isSelectionEmpty()) {
		        		return;
		        	}
		        	
		        	//Determine selected list item and disable or enable the lot that corresponds to that item.
		        	String selectedValue = (String) lotList.getSelectedValue();
		            for(int i = 0; i<listModel.getSize(); i++) {
		            	if(listModel.getElementAt(i).equals(selectedValue)) {
		            		//Disable or enable entire lot here.
		            	}
		            }
		        }
		    }
		});
		
		//Set up what to do when an item in the ingredient list is double-clicked.
		lotList.addMouseListener(new MouseAdapter() {
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
	}
}
