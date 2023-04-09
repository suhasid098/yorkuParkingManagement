package views;

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

import controllers.LotController;
import controllers.UserController;
import java.awt.Color;

@SuppressWarnings("serial")
public class LotChoiceView extends JFrame {

	private LotChoiceView thisView = this;
	protected Main frame;
	private LotFactory factory = new LotFactory(); // Here I am using the Factory Design Pattern
	private JTextField plateNumberField;
	private JLabel lblmsg = new JLabel("");

	@SuppressWarnings({ "unchecked", "rawtypes" })
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

		this.getContentPane();
		getContentPane().setLayout(null);

		JLabel selectParkingLabel = new JLabel("Select a Parking Lot");
		selectParkingLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		selectParkingLabel.setBounds(125, 156, 159, 32);
		getContentPane().add(selectParkingLabel);
		@SuppressWarnings("rawtypes")
		JComboBox lots = new JComboBox();
		lots.setModel(new DefaultComboBoxModel(LotController.getLotList().split(",")));

		lots.setBounds(151, 199, 106, 21);
		getContentPane().add(lots);
		lots.getSelectedIndex();

		JLabel lblLicensePlateNumber = new JLabel("Enter License Plate Number");
		lblLicensePlateNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLicensePlateNumber.setBounds(95, 55, 237, 32);
		getContentPane().add(lblLicensePlateNumber);

		plateNumberField = new JTextField();
		plateNumberField.setBounds(161, 98, 96, 20);
		getContentPane().add(plateNumberField);
		plateNumberField.setColumns(10);

		JButton nextBtn = new JButton("Next");
		nextBtn.setFont(new Font("Tahoma", Font.BOLD, 10));
		nextBtn.setBounds(341, 382, 85, 21);
		getContentPane().add(nextBtn);

		lblmsg.setForeground(Color.RED);
		lblmsg.setBounds(136, 300, 152, 14);
		getContentPane().add(lblmsg);

		JButton backBtn = new JButton("Back");
		backBtn.setFont(new Font("Tahoma", Font.BOLD, 10));
		backBtn.setBounds(244, 381, 89, 23);
		getContentPane().add(backBtn);
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});

		nextBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String plateNumber = plateNumberField.getText();
				String lotName = (String) lots.getSelectedItem();

				if (lotName.equals("")) {
					lblmsg.setText("Select a lot");
				}
				
				String result = UserController.addPlateNumber(plateNumber, lotName);

				if (result == "Invalid plate number") {
					lblmsg.setText(result);
				}
				else {
					// update to database
					JFrame lotFrame = factory.getLot(thisView.frame, lotName);
					thisView.frame.changeContentPane(lotFrame, lotName);
				}
			}
		});

		plateNumberField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				if (plateNumberField.getText().length() >= 8) // limit to 8 characters
					e.consume();
			}
		});

	}
	
	public String getLblMessage() {
		return lblmsg.getText();
		
	}
}
