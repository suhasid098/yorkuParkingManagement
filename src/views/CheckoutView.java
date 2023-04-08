package views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import controllers.UserController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class CheckoutView extends JFrame {
	private CheckoutView thisView = this;
	protected Main frame;
	private JTextField nameCardField;
	private JTextField cardNumberField;
	private JTextField cvvField;
	private JLabel nameCard;
	private JLabel cardNumberLabel;
	private JLabel cvvLabel;
	private JRadioButton creditRadioButton;
	private JRadioButton debitRadioButton;
	private JRadioButton mobilePaymentRadioButton;
	private JButton finalConfirmButton;
	public LocalDateTime endTime = null;
	public LocalDateTime startTime = null;
	public LocalDateTime currentTime = null;
	public boolean dateConfirmed = false;
	public long hoursBookedFor;
	public String price;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CheckoutView(Main frame) {
		// Save previous frame.
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Checkout");
		// Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the frame's size
		this.setSize(450, 450);
		// Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);
		this.getContentPane();
		getContentPane().setLayout(null);

		JLabel nameLabel = new JLabel("The total for " + UserController.getLoggedInUser().getName());
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		nameLabel.setBounds(10, 11, 159, 25);
		getContentPane().add(nameLabel);

		JLabel parkingLabel = new JLabel("For parking spot id " + UserController.getLoggedInUser().getParkingSpotName()
				+ ", in parking lot " + UserController.getLoggedInUser().getLotName() + ", ");
		parkingLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		parkingLabel.setBounds(10, 45, 426, 25);
		getContentPane().add(parkingLabel);

		String priceLot = UserController.getLoggedInUser().getRate() + "";
		JLabel priceLabel = new JLabel("Parking Fee: " + priceLot);
		priceLabel.setForeground(Color.blue);
		priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		priceLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		priceLabel.setBounds(120, 66, 161, 25);
		getContentPane().add(priceLabel);

		JLabel paymentLabel = new JLabel("Select payment method");
		paymentLabel.setBounds(10, 182, 151, 13);
		getContentPane().add(paymentLabel);

		nameCardField = new JTextField();
		nameCardField.setVisible(false);

		cardNumberField = new JTextField();
		cardNumberField.setVisible(false);

		nameCard = new JLabel("Name on Card");
		nameCard.setVisible(false);

		cardNumberLabel = new JLabel("12 digit card number");
		cardNumberLabel.setVisible(false);

		cvvLabel = new JLabel("CVV");
		cvvLabel.setVisible(false);

		cvvField = new JTextField();
		cvvField.setVisible(false);

		creditRadioButton = new JRadioButton("Credit");
		creditRadioButton.setBounds(10, 199, 70, 21);
		getContentPane().add(creditRadioButton);

		debitRadioButton = new JRadioButton("Debit");
		debitRadioButton.setBounds(87, 199, 70, 21);
		getContentPane().add(debitRadioButton);

		mobilePaymentRadioButton = new JRadioButton("Mobile Payment");
		mobilePaymentRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		mobilePaymentRadioButton.setBounds(170, 199, 197, 21);
		getContentPane().add(mobilePaymentRadioButton);

		JButton bmoButton = new JButton("BMO");
		bmoButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		bmoButton.setVisible(false);

		JButton cibcButton = new JButton("CIBC");
		cibcButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		cibcButton.setVisible(false);

		JButton rbcButton = new JButton("RBC");
		rbcButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rbcButton.setVisible(false);

		JButton scotiabankButton = new JButton("ScotiaBank");
		scotiabankButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		scotiabankButton.setVisible(false);

		JButton tdButton = new JButton("TD");
		tdButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		tdButton.setVisible(false);

		creditRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (creditRadioButton.isSelected()) {
					debitRadioButton.setSelected(false);
					mobilePaymentRadioButton.setSelected(false);

					cvvLabel.setBounds(10, 332, 45, 13);
					getContentPane().add(cvvLabel);
					cvvLabel.setVisible(true);

					cvvField.setBounds(10, 349, 96, 19);
					getContentPane().add(cvvField);
					cvvField.setColumns(10);
					cvvField.addKeyListener(new KeyAdapter() {
//			            @Override
						public void keyTyped(KeyEvent e) {
							if (cvvField.getText().length() >= 3) // limit to 3 characters
								e.consume();
						}
					});
					cvvField.setVisible(true);

					nameCard.setBounds(10, 227, 88, 13);
					getContentPane().add(nameCard);
					nameCard.setVisible(true);

					cardNumberLabel.setBounds(10, 280, 147, 12);
					getContentPane().add(cardNumberLabel);
					cardNumberLabel.setVisible(true);

					cardNumberField.setBounds(10, 302, 186, 19);
					getContentPane().add(cardNumberField);
					cardNumberField.setColumns(10);
					cardNumberField.addKeyListener(new KeyAdapter() {
//			            @Override
						public void keyTyped(KeyEvent e) {
							if (cardNumberField.getText().length() >= 12) // limit to 12 characters
								e.consume();
						}
					});
					cardNumberField.setVisible(true);

					nameCardField.setBounds(10, 251, 186, 19);
					getContentPane().add(nameCardField);
					nameCardField.setColumns(10);
					nameCardField.setVisible(true);

					bmoButton.setVisible(false);
					tdButton.setVisible(false);
					rbcButton.setVisible(false);
					scotiabankButton.setVisible(false);
					cibcButton.setVisible(false);

				}
			}
		});

		debitRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (debitRadioButton.isSelected()) {
					creditRadioButton.setSelected(false);
					mobilePaymentRadioButton.setSelected(false);

					cvvLabel.setBounds(10, 332, 45, 13);
					getContentPane().add(cvvLabel);
					cvvLabel.setVisible(true);

					cvvField.setBounds(10, 349, 96, 19);
					getContentPane().add(cvvField);
					cvvField.setColumns(10);
					cvvField.addKeyListener(new KeyAdapter() {
//			            @Override
						public void keyTyped(KeyEvent e) {
							if (cvvField.getText().length() >= 3) // limit to 3 characters
								e.consume();
						}
					});
					cvvField.setVisible(true);

					nameCard.setBounds(10, 227, 88, 13);
					getContentPane().add(nameCard);
					nameCard.setVisible(true);

					cardNumberLabel.setBounds(10, 280, 147, 12);
					getContentPane().add(cardNumberLabel);
					cardNumberLabel.setVisible(true);

					cardNumberField.setBounds(10, 302, 186, 19);
					getContentPane().add(cardNumberField);
					cardNumberField.setColumns(10);
					cardNumberField.addKeyListener(new KeyAdapter() {
//			            @Override
						public void keyTyped(KeyEvent e) {
							if (cardNumberField.getText().length() >= 12) // limit to 12 characters
								e.consume();
						}
					});
					cardNumberField.setVisible(true);

					nameCardField.setBounds(10, 251, 186, 19);
					getContentPane().add(nameCardField);
					nameCardField.setColumns(10);
					nameCardField.setVisible(true);

					bmoButton.setVisible(false);
					tdButton.setVisible(false);
					rbcButton.setVisible(false);
					scotiabankButton.setVisible(false);
					cibcButton.setVisible(false);
				}
			}
		});

		mobilePaymentRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mobilePaymentRadioButton.isSelected()) {
					debitRadioButton.setSelected(false);
					creditRadioButton.setSelected(false);

					bmoButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							openWebPage("https://www1.bmo.com/banking/digital/login?lang=en");
						}
					});

					bmoButton.setBounds(144, 226, 122, 74);
					getContentPane().add(bmoButton);
					bmoButton.setVisible(true);

					cibcButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							openWebPage(
									"https://www.cibconline.cibc.com/ebm-resources/online-banking/client/index.html#/auth/signon");
						}
					});

					cibcButton.setBounds(10, 303, 122, 74);
					getContentPane().add(cibcButton);
					cibcButton.setVisible(true);

					rbcButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							openWebPage(
									"https://secure.royalbank.com/statics/login-service-ui/index#/full/signin?_gl=1*b9ylms*_ga*MTU4MTQ4OTQ4Mi4xNjc5NjMyMDgw*_ga_89NPCTDXQR*MTY3OTYzMjA4MC4xLjAuMTY3OTYzMjA4MC42MC4wLjA.&_ga=2.125395722.1289283434.1679632081-1581489482.1679632080&LANGUAGE=ENGLISH");
						}
					});

					rbcButton.setBounds(10, 227, 122, 73);
					getContentPane().add(rbcButton);
					rbcButton.setVisible(true);

					scotiabankButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							openWebPage(
									"https://auth.scotiaonline.scotiabank.com/online?oauth_key=b9pgGqrNzQg&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJiOXBnR3FyTnpRZyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjc5NjMzNTMyLCJpYXQiOjE2Nzk2MzIzMzIsImp0aSI6IjU4NDYwMWY5LWQwOGQtNGU2Mi05ZWI0LTg5NWJmYjhiYmNlMCIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.lsD5LC_luKRjr8cjiqgch8hcFiGddOPr5KSXOlFScqCpdCHoKCZNxN-LwI763AWHgZW4z6-_2vRYKZyT5bDrtaQGFBr2S3JhIBRnjwR8khzw8wNlr7eDKO6uTb7dN2VSJbtufyzbPTRtE1D4eAwdtLtaX3rVxYKg0inrUvHFaPH9YAlLXfrLK27bXNzIAbfbZVPAoXX2AX9xUkuhKxJ1yzInafPZfVRrQB80K1YxQZ67DG8hPksFvKyoIEWrxwpc6JArGzJtbqfAY3hfvOjK0NOGCdxwsTy_x2ByNJ95IuNynS6V4_TI3R9-TwcAMWjHrtadQa-ac4TkjTcI2fZV0Q&preferred_environment=");
						}
					});

					scotiabankButton.setBounds(144, 303, 122, 74);
					getContentPane().add(scotiabankButton);
					scotiabankButton.setVisible(true);

					tdButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							openWebPage(
									"https://authentication.td.com/uap-ui/?consumer=easyweb&locale=en_CA#/uap/login");
						}
					});

					tdButton.setBounds(279, 226, 122, 74);
					getContentPane().add(tdButton);
					tdButton.setVisible(true);

					cvvLabel.setVisible(false);
					cvvField.setVisible(false);
					nameCard.setVisible(false);
					cardNumberLabel.setVisible(false);
					cardNumberField.setVisible(false);
					nameCardField.setVisible(false);

				}
			}
		});

		finalConfirmButton = new JButton("Confirm");
		finalConfirmButton.setBounds(341, 380, 85, 21);
		getContentPane().add(finalConfirmButton);

		@SuppressWarnings("rawtypes")
		JComboBox year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new Integer[] { 2023, 2024 }));
		year.setBounds(10, 96, 61, 22);
		getContentPane().add(year);

		JComboBox month = new JComboBox();
		month.setModel(new DefaultComboBoxModel(new Month[] { Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL,
				Month.MAY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER }));
		month.setBounds(81, 96, 88, 22);
		getContentPane().add(month);

		JComboBox day = new JComboBox();
		day.setModel(new DefaultComboBoxModel(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
				18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 }));
		day.setBounds(179, 96, 38, 22);
		getContentPane().add(day);

		JComboBox hour = new JComboBox();
		hour.setModel(new DefaultComboBoxModel(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24 }));
		hour.setBounds(228, 96, 38, 22);
		getContentPane().add(hour);

		JComboBox minute = new JComboBox();
		minute.setModel(new DefaultComboBoxModel(new Integer[] { 00, 10, 20, 30, 40, 50 }));
		minute.setBounds(279, 96, 38, 22);
		getContentPane().add(minute);

		JButton confirmTime = new JButton("Confirm");
		confirmTime.setBounds(341, 138, 88, 23);
		getContentPane().add(confirmTime);

		JLabel outputMessage = new JLabel("");
		outputMessage.setBounds(95, 387, 186, 14);
		outputMessage.setForeground(Color.RED);
		getContentPane().add(outputMessage);

		JLabel debitBalance = new JLabel("Debit: " + UserController.getLoggedInUser().getDebitBalance());
		debitBalance.setForeground(Color.BLUE);
		debitBalance.setBounds(245, 16, 88, 14);
		getContentPane().add(debitBalance);

		JLabel creditBalance = new JLabel("Credit: " + UserController.getLoggedInUser().getCredittBalance());
		creditBalance.setForeground(Color.BLUE);
		creditBalance.setBounds(344, 16, 82, 14);
		getContentPane().add(creditBalance);

		JLabel timeLabel1 = new JLabel("Start Date/Time");
		timeLabel1.setBounds(10, 77, 112, 14);
		getContentPane().add(timeLabel1);

		JLabel timeLabel2 = new JLabel("End Date/Time");
		timeLabel2.setBounds(10, 124, 88, 14);
		getContentPane().add(timeLabel2);

		JComboBox year_1 = new JComboBox();
		year_1.setModel(new DefaultComboBoxModel(new Integer[] { 2023, 2024 }));
		year_1.setBounds(10, 138, 61, 22);
		getContentPane().add(year_1);

		JComboBox month_1 = new JComboBox();
		month_1.setModel(new DefaultComboBoxModel(new Month[] { Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL,
				Month.MAY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER }));
		month_1.setBounds(81, 138, 88, 22);
		getContentPane().add(month_1);

		JComboBox day_1 = new JComboBox();
		day_1.setModel(new DefaultComboBoxModel(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24 }));
		day_1.setBounds(179, 138, 38, 22);
		getContentPane().add(day_1);

		JComboBox hour_1 = new JComboBox();
		hour_1.setModel(new DefaultComboBoxModel(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24 }));
		hour_1.setBounds(228, 138, 38, 22);
		getContentPane().add(hour_1);

		JComboBox minute_1 = new JComboBox();
		minute_1.setModel(new DefaultComboBoxModel(new Integer[] { 00, 10, 20, 30, 40, 50 }));
		minute_1.setBounds(279, 138, 38, 22);
		getContentPane().add(minute_1);

		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

			}
		});
		backButton.setBounds(337, 348, 89, 23);
		getContentPane().add(backButton);

		confirmTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int yearVal = (int) year.getSelectedItem();
				Month monthVal = (Month) month.getSelectedItem();
				int dayVal = (int) day.getSelectedItem();
				int hourVal = (int) hour.getSelectedItem();
				int minVal = (int) minute.getSelectedItem();
				startTime = LocalDateTime.of(yearVal, monthVal, dayVal, hourVal, minVal);

				yearVal = (int) year_1.getSelectedItem();
				monthVal = (Month) month_1.getSelectedItem();
				dayVal = (int) day_1.getSelectedItem();
				hourVal = (int) hour_1.getSelectedItem();
				minVal = (int) minute_1.getSelectedItem();
				endTime = LocalDateTime.of(yearVal, monthVal, dayVal, hourVal, minVal);

				currentTime = LocalDateTime.now();

				Duration diff = Duration.between(startTime, endTime);
				hoursBookedFor = diff.toHours();

				Duration diff2 = Duration.between(currentTime, startTime);
				long hours = diff2.toHours();

//			https://www.geeksforgeeks.org/date-class-java-examples/
				if (hoursBookedFor < 1 || hours < 1) {
					price = 0 + "";
					outputMessage.setText("Invalid Date");

				} else {
					price = UserController.getLoggedInUser().getRate() * diff.toHours()
							+ UserController.getLoggedInUser().getRate() + "";
					outputMessage.setText("");
					dateConfirmed = true;
				}

				priceLabel.setText("Parking Fee: " + price);
			}
		});

		finalConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cardNumber = "";
				String cvvNumber = "";
				String nameOnCard = "";
				String creditDebitText = "";
				outputMessage.setText("");
				outputMessage.setForeground(Color.red);
				if (creditRadioButton.isSelected() || debitRadioButton.isSelected()) {
					if (creditRadioButton.isSelected()) {
						creditDebitText = creditRadioButton.getText().toLowerCase();
					} else if (debitRadioButton.isSelected()) {
						creditDebitText = debitRadioButton.getText().toLowerCase();
					}

					if (nameCardField.getText().length() < 3) {
						outputMessage.setText("Enter Valid Name");
					} else {
						nameOnCard = nameCardField.getText() + "";
					}

					if (creditDebitText.equals("")) {
						outputMessage.setText("Select Payment Option");
					} else {
						outputMessage.setText("");

					}

					// check if card is 12 digits, should also be only numbers (Add later)
					if (cardNumberField.getText().length() != 12) {
						outputMessage.setText("Invalid card number");
					} else {
						cardNumber = cardNumberField.getText() + "";
					}

//		 check if cvv is 3 digits, should also be only numbers (Add later)
					if (cvvField.getText().length() != 3) {
						outputMessage.setText("Invalid CVV number");
					} else {
						cvvNumber = cvvField.getText() + "";
					}

					if (dateConfirmed == false) {
						outputMessage.setText("Confirm Date/Time First");

					}
					if (!nameOnCard.equals("") && !cardNumber.equals("") && !cardNumber.equals("")
							&& !cardNumber.equals("")) {

						outputMessage.setForeground(Color.BLUE);

						creditBalance.setText("Credit: " + UserController.getLoggedInUser().getCredittBalance());
						debitBalance.setText("Debit: " + UserController.getLoggedInUser().getDebitBalance());
						outputMessage.setText("Parking Spot Booked!");
						int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor
								+ UserController.getLoggedInUser().getRate());

						UserController.checkoutInfo(nameOnCard, cardNumber, cvvNumber, creditDebitText, price1,
								startTime, endTime);

						creditBalance.setText("Credit: " + UserController.getLoggedInUser().getCredittBalance());
						debitBalance.setText("Debit: " + UserController.getLoggedInUser().getDebitBalance());
					} else {
						outputMessage.setText("Invalid entry");
					}

				} else if (mobilePaymentRadioButton.isSelected()) {
					int price1 = (int) (UserController.getLoggedInUser().getRate() * hoursBookedFor
							+ UserController.getLoggedInUser().getRate());
					
					creditDebitText = mobilePaymentRadioButton.getText().toLowerCase();
//					UserController.setPaymentType(creditDebitText);
					UserController.checkoutInfo("", "", "", creditDebitText, price1,
							startTime, endTime);
					outputMessage.setText("Parking Spot Booked!");
				}
			}
		});
	}

	public void openWebPage(String url) {
		try {
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (java.io.IOException e) {
		}
	}
}
