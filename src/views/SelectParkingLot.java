//package views;
//
//import java.awt.BorderLayout;
//import java.awt.Component;
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.Box;
//import javax.swing.BoxLayout;
//import javax.swing.JComboBox;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//import controllers.UserController;
//
//@SuppressWarnings("serial")
//public class SelectParkingLot extends JFrame {
//
//	//Object instance for action listeners.
//	private SelectParkingLot thisView = this;
//	
//	//Previous frame instance.
//	private Main frame;
//	
//	//Shared constants.
//	private static final int sectionSpace = 20;
//	
//	public SelectParkingLot(Main frame) {
//		//Save previous frame.
//				this.frame = frame;
//				
//				//Frame setup.
//				//Set frame title.
//				this.setTitle("SelectParkingLot - Lot Options");
//				//Set the frame to exit when closed.
//				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		
//				//Set the frame's size.
//				this.setSize(450, 450);	
//				//Set the frame to open in the middle of the screen.
//				this.setLocationRelativeTo(null);
//				
//				
//				//Pane setup.
//				//Get the content pane.
//				Container contentPane = this.getContentPane();
//				
//				//Set up panels.
//				//Make a panel for the option buttons.
//				JPanel optionsPane = new JPanel();
//				//Set the info pane's layout manager to the vertical box layout.
//				optionsPane.setLayout(new BoxLayout(optionsPane, BoxLayout.PAGE_AXIS));
//				//Make an invisible border for the info pane.
//				optionsPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//				
//			
//				//Component setup.
//				//Make a new button for booking a parking space.\
//				String[] parkingLots = { "Calumet", "Stong", "Bethune"};
//
//				JComboBox option = new JComboBox(parkingLots);
//				
//				//Set component alignments.
//				option.setAlignmentX(Component.CENTER_ALIGNMENT);
//				
//				//Set up button fonts and font sizes.
//				int fontSize = 10;
//				option.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
//				option.setSize(20,20);
//				
//				JButton btnNewButton = new JButton("back");
//				btnNewButton.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						UserController.logOutUser();
//						//Rename frame.
//						thisView.frame.resetContentPane();
//					}
//				});
//				optionsPane.add(btnNewButton);
//				//Build frames.
//				//Add option buttons to options panel.
//				optionsPane.add(Box.createVerticalGlue()); //Makes components move with the top of the pane. Used in centering components with resizing.
//				optionsPane.add(option); //Adds name label to pane.
//			
//				//Add options panel to content pane.
//				contentPane.add(optionsPane);
//				
//				
//				//Set up component actions
//				//Set up what to do when the book button is pressed.
//				option.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						if(option.getSelectedItem() == "Calumet") {
//							thisView.frame.changeContentPane(new CalumetParkingLot(thisView.frame), "Select Parking");						
//						}
//					}
//				});
//			
//		
//			}
//}
//	
//
//
