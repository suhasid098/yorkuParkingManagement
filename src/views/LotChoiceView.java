package views;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import controllers.UserController;
import java.awt.Color;

public class LotChoiceView extends JFrame {

	private LotChoiceView thisView = this;
	protected Main frame;
	private LotFactory factory = new LotFactory(); 	// Here I am using the Factory Design Pattern
	private JTextField textField;

	public LotChoiceView(Main frame) {
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Lot");
		// Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the frame's size.
		this.setSize(450, 450);
		// Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);

		// Pane setup.
		// Get the content pane.
		Container contentPane = this.getContentPane();
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Select a Parking Lot");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(125, 156, 159, 32);
		getContentPane().add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "Vanier", "Bethune", "Calumet", "Schulich", "Lassonde" }));

		comboBox.setBounds(151, 199, 106, 21);
		getContentPane().add(comboBox);
		comboBox.getSelectedIndex();
			
		JLabel lblNewLabel_1 = new JLabel("Enter License Plate Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(95, 55, 237, 32);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(161, 98, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(341, 382, 85, 21);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(136, 300, 152, 14);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(244, 381, 89, 23);
		getContentPane().add(btnNewButton_1);
		  btnNewButton_1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
					thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

	        	}
	        });

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String plateNumber = textField.getText();	
				String lotName = (String) comboBox.getSelectedItem();

				if(lotName.equals("")) {
					lblNewLabel_2.setText("Select a lot");
				}
				if(plateNumber.length() < 2) {
					lblNewLabel_2.setText("Invalid plate number");
				} 
				
				
				if(!lotName.equals("") && plateNumber.length() >= 2) {
					UserController.addPlateNumber(plateNumber);
					//update to database
					JFrame lotFrame = factory.getLot(thisView.frame, lotName);
					thisView.frame.changeContentPane(lotFrame, lotName);
				}
			}
		});
		
		textField.addKeyListener(new KeyAdapter() {
//	            @Override
	            public void keyTyped(KeyEvent e) {
	                if (textField.getText().length() >= 8 ) // limit to 8 characters
	                    e.consume();
	            }
	        });    

	}
}

