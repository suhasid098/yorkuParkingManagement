package views;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controllers.UserController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class EditBookingView extends JFrame {
	private EditBookingView thisView = this;
	protected Main frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	public LocalDateTime endTime = null;
	public LocalDateTime startTime = null;
	public LocalDateTime currentTime = null;
	public boolean dateConfirmed = false;
	public long hoursBookedFor;
	public String price;

	public EditBookingView(Main frame) {
		// Save previous frame.
		this.frame = frame;

		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Edit");
		// Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the frame's size
		this.setSize(450, 450);
		// Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);

		// Pane setup.
		// Get the content pane.
		Container contentPane = this.getContentPane();
		getContentPane().setLayout(null);

		JLabel nameLabel = new JLabel("The total for " + UserController.getLoggedInUser().getName());
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		nameLabel.setBounds(10, 11, 159, 25);
		getContentPane().add(nameLabel);

		JLabel parkingLabel = new JLabel("For parking spot id " + UserController.getLoggedInUser().getParkingSpotName()
				+ ", in parking lot " + UserController.getLoggedInUser().getLotName() + ", ");
		parkingLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		parkingLabel.setBounds(10, 29, 426, 25);
		getContentPane().add(parkingLabel);

		String priceLot = UserController.getLoggedInUser().getPrice() + "";
		JLabel priceLabel = new JLabel("Total Parking Fee: " + priceLot);
		priceLabel.setForeground(Color.blue);
		priceLabel.setHorizontalAlignment(SwingConstants.LEFT);
		priceLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		priceLabel.setBounds(218, 96, 161, 25);
		getContentPane().add(priceLabel);
		;

		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		btnNewButton_1.setBounds(337, 379, 89, 23);
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_1_1 = new JLabel("Extend Booking By _ Hours");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(10, 70, 197, 14);
		getContentPane().add(lblNewLabel_1_1);

		JComboBox extendedTime = new JComboBox();
		extendedTime.setModel(new DefaultComboBoxModel(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		extendedTime.setBounds(10, 97, 38, 22);
		getContentPane().add(extendedTime);

		JButton confirmTime_1 = new JButton("Confirm");
		confirmTime_1.setBounds(58, 97, 88, 23);
		getContentPane().add(confirmTime_1);

		JLabel lblAddedCost = new JLabel("Added Cost: 0.0");
		lblAddedCost.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddedCost.setForeground(Color.BLUE);
		lblAddedCost.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblAddedCost.setBounds(217, 65, 114, 25);
		getContentPane().add(lblAddedCost);

		JLabel startDate = new JLabel("Start Time:");
		startDate.setBounds(218, 134, 228, 14);
		getContentPane().add(startDate);
		startDate.setText("Start Time: " + UserController.getLoggedInUser().getParkingStartTime().toString());

		JLabel newEndDate_1 = new JLabel("New End Date:");
		newEndDate_1.setBounds(10, 134, 198, 14);
		getContentPane().add(newEndDate_1);

		JLabel DBalance = new JLabel("Debit: " + UserController.getLoggedInUser().getDebitBalance());
		DBalance.setBounds(10, 169, 198, 14);
		getContentPane().add(DBalance);

		JLabel CBalance = new JLabel("Credit: " + UserController.getLoggedInUser().getCredittBalance());
		CBalance.setBounds(10, 189, 198, 14);
		getContentPane().add(CBalance);

		confirmTime_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// check if user is editing before booking start time
				LocalDateTime current = LocalDateTime.now();
				LocalDateTime startTime = UserController.getLoggedInUser().getParkingStartTime();
				long duration = -1;
				if (current == null || startTime == null) {

				} else {
					duration = current.until(startTime, ChronoUnit.MINUTES);
				}
				if (duration > 0) {
					int hours = (int) extendedTime.getSelectedItem();
					int price1 = (int) (UserController.getLoggedInUser().getRate() * hours);

					lblAddedCost.setText("Added Cost: " + price1);
					UserController.extendTime((int) hours, price1);
					newEndDate_1.setText("New End Date: " + UserController.getLoggedInUser().getParkingEndTime() + "");

					priceLabel.setText("Total Parking Fee: " + UserController.getLoggedInUser().getPrice());
					DBalance.setText("Debit: " + UserController.getLoggedInUser().getDebitBalance());
					CBalance.setText("Debit: " + UserController.getLoggedInUser().getCredittBalance());
				} else {
					JOptionPane.showMessageDialog(null, "Too late to edit");
				}

			}
		});

	}
}