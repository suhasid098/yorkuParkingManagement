package views;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controllers.UserController;
import objects.User;
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
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Enumeration;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class CheckoutView extends JFrame{
    private CheckoutView thisView = this;
    protected Main frame;
    private JTextField textField;
    private JTextField textField_1;

    private JTextField nameCardField;
    private JTextField cardNumberField;
    private JTextField cvvField;
    private JLabel nameCard;
    private JLabel cardNumberLabel;
    private JLabel cvvLabel;
    private JRadioButton creditRadioButton;
    private JRadioButton debitRadioButton;
    private JButton btnNewButton;
//	protected String creditDebitText ="";

	public LocalDateTime endTime = null;
	public LocalDateTime startTime = null;


	public LocalDateTime currentTime = null;
	public boolean dateConfirmed = false;
	public long hoursBookedFor;
	public String price;
    
    public CheckoutView(Main frame) {
        //Save previous frame.
        this.frame = frame;

        //Frame setup.
        //Set frame title.
        this.setTitle("YorkUParking - Checkout");
        //Set the frame to exit when closed.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set the frame's size
        this.setSize(450, 450);
        //Set the frame to open in the middle of the screen.
        this.setLocationRelativeTo(null);

        //Pane setup.
        //Get the content pane.
        Container contentPane = this.getContentPane();
        getContentPane().setLayout(null);

        JLabel nameLabel = new JLabel("The total for " + UserController.getLoggedInUser().getName());
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
        nameLabel.setBounds(10, 11, 159, 25);
        getContentPane().add(nameLabel);

        JLabel parkingLabel = new JLabel("For parking spot id "+ UserController.getLoggedInUser().getParkingSpotName()+ ", in parking lot "+UserController.getLoggedInUser().getLotName()+", ");
        parkingLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
        parkingLabel.setBounds(10, 45, 426, 25);
        getContentPane().add(parkingLabel);
        
        
      
        
        String priceLot = UserController.getLoggedInUser().getRate()+"";
        JLabel priceLabel = new JLabel("Parking Fee: " + priceLot);
        priceLabel.setForeground(Color.blue);
        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        priceLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        priceLabel.setBounds(120, 66, 161, 25);
        getContentPane().add(priceLabel);
        
        JLabel lblNewLabel_4 = new JLabel("Select payment method");
        lblNewLabel_4.setBounds(10, 182, 151, 13);
        getContentPane().add(lblNewLabel_4);
        
        nameCardField = new JTextField();
        nameCardField.setBounds(10, 251, 186, 19);
        getContentPane().add(nameCardField);
        nameCardField.setColumns(10);
        
        cardNumberField = new JTextField();
        cardNumberField.setBounds(10, 302, 186, 19);
        getContentPane().add(cardNumberField);
        cardNumberField.setColumns(10);
        cardNumberField.addKeyListener(new KeyAdapter() {
//            @Override
            public void keyTyped(KeyEvent e) {
                if (cardNumberField.getText().length() >= 12 ) // limit to 12 characters
                    e.consume();
            }
        });;
        
        nameCard = new JLabel("Name on Card");
        nameCard.setBounds(10, 227, 88, 13);
        getContentPane().add(nameCard);
        
        cardNumberLabel = new JLabel("12 digit card number");
        cardNumberLabel.setBounds(10, 280, 147, 12);
        getContentPane().add(cardNumberLabel);

        cvvLabel = new JLabel("CVV");
        cvvLabel.setBounds(10, 332, 45, 13);
        getContentPane().add(cvvLabel);

        cvvField = new JTextField();
        cvvField.setBounds(10, 349, 96, 19);
        getContentPane().add(cvvField);
        cvvField.setColumns(10);
        cvvField.addKeyListener(new KeyAdapter() {
//            @Override
            public void keyTyped(KeyEvent e) {
                if (cvvField.getText().length() >= 3 ) // limit to 3 characters
                    e.consume();
            }
        });    

        creditRadioButton = new JRadioButton("Credit");
        creditRadioButton.setBounds(10, 199, 70, 21);
        getContentPane().add(creditRadioButton);

        debitRadioButton = new JRadioButton("Debit");
        debitRadioButton.setBounds(87, 199, 70, 21);
        getContentPane().add(debitRadioButton);

        ButtonGroup groupCreditDebit = new ButtonGroup();
        groupCreditDebit.add(creditRadioButton);
        groupCreditDebit.add(debitRadioButton);

        btnNewButton = new JButton("Confirm");
        btnNewButton.setBounds(344, 349, 85, 21);
        getContentPane().add(btnNewButton);
      
        JComboBox year = new JComboBox();
        year.setModel(new DefaultComboBoxModel(new Integer[] {2023, 2024}));
        year.setBounds(10, 96, 61, 22);
        getContentPane().add(year);
        
        JComboBox month = new JComboBox();
        month.setModel(new DefaultComboBoxModel(new Month[] {Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER}));
        month.setBounds(81, 96, 88, 22);
        getContentPane().add(month);
        
        JComboBox day = new JComboBox();
        day.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}));
        day.setBounds(179, 96, 38, 22);
        getContentPane().add(day);
        
        JComboBox hour = new JComboBox();
        hour.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}));
        hour.setBounds(228, 96, 38, 22);
        getContentPane().add(hour);
        
        JComboBox minute = new JComboBox();
        minute.setModel(new DefaultComboBoxModel(new Integer[] {00, 10, 20, 30, 40, 50}));
        minute.setBounds(279, 96, 38, 22);
        getContentPane().add(minute);
        
        JButton confirmTime = new JButton("Confirm");
        confirmTime.setBounds(341, 138, 88, 23);
        getContentPane().add(confirmTime);
        
        JLabel outputMessage = new JLabel("");
        outputMessage.setBounds(116, 388, 186, 14);
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
        
        JLabel lblNewLabel = new JLabel("Start Date/Time");
        lblNewLabel.setBounds(10, 77, 112, 14);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("End Date/Time");
        lblNewLabel_1.setBounds(10, 124, 88, 14);
        getContentPane().add(lblNewLabel_1);
        
        JComboBox year_1 = new JComboBox();
        year_1.setModel(new DefaultComboBoxModel(new Integer[] {2023, 2024}));
        year_1.setBounds(10, 138, 61, 22);
        getContentPane().add(year_1);
        
        JComboBox month_1 = new JComboBox();
        month_1.setModel(new DefaultComboBoxModel(new Month[] {Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER}));
        month_1.setBounds(81, 138, 88, 22);
        getContentPane().add(month_1);
        
        JComboBox day_1 = new JComboBox();
        day_1.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}));
        day_1.setBounds(179, 138, 38, 22);
        getContentPane().add(day_1);
        
        JComboBox hour_1 = new JComboBox();
        hour_1.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}));
        hour_1.setBounds(228, 138, 38, 22);
        getContentPane().add(hour_1);
        
        JComboBox minute_1 = new JComboBox();
        minute_1.setModel(new DefaultComboBoxModel(new Integer[] {00, 10, 20, 30, 40, 50}));
        minute_1.setBounds(279, 138, 38, 22);
        getContentPane().add(minute_1);
        
        JButton btnNewButton_1 = new JButton("Back");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new BookingActionsView(thisView.frame), "Booking Options");

        	}
        });
        btnNewButton_1.setBounds(245, 348, 89, 23);
        getContentPane().add(btnNewButton_1);
    
    
confirmTime.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int yearVal = (int) year.getSelectedItem();
			Month monthVal = (Month) month.getSelectedItem();
			int dayVal = (int) day.getSelectedItem();
			int hourVal = (int) hour.getSelectedItem();
			int minVal = (int) minute.getSelectedItem();
			startTime = LocalDateTime.of(yearVal,monthVal,dayVal,hourVal,minVal);
			
			yearVal = (int) year_1.getSelectedItem();
			monthVal = (Month) month_1.getSelectedItem();
			dayVal = (int) day_1.getSelectedItem();
			hourVal = (int) hour_1.getSelectedItem();
			minVal = (int) minute_1.getSelectedItem();
			endTime = LocalDateTime.of(yearVal,monthVal,dayVal,hourVal,minVal);
			
			currentTime = LocalDateTime.now();

			
			Duration diff = Duration.between(startTime, endTime);
			hoursBookedFor = diff.toHours();
			
			Duration diff2 = Duration.between(currentTime, startTime);
			long hours = diff2.toHours();
			
//			https://www.geeksforgeeks.org/date-class-java-examples/
			   if(hoursBookedFor < 1 || hours < 1) {
				   price = 0 + "";
				   outputMessage.setText("Invalid Date");
				   
			   } else {
					price = UserController.getLoggedInUser().getRate()* diff.toHours() + UserController.getLoggedInUser().getRate() + "";
					 outputMessage.setText("");
						dateConfirmed = true;
			   }
			   
			    priceLabel.setText("Parking Fee: " + price);
		}
	});

btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String cardNumber ="";
		String cvvNumber ="";
		String nameOnCard= "";
		String creditDebitText = "";
		outputMessage.setText("");
		outputMessage.setForeground(Color.red);
		boolean validPlateNumber = false;

	    for (Enumeration<AbstractButton> buttons = groupCreditDebit.getElements(); buttons.hasMoreElements();) {
	        AbstractButton button = buttons.nextElement();
	      if (button.isSelected()) {
	          creditDebitText = button.getText();
	         }
	    }

	    if(nameCardField.getText().length() < 3) {
			outputMessage.setText("Enter Valid Name");
	    } else {
			nameOnCard = nameCardField.getText() + "";
	    }
	    
	    if(creditDebitText.equals("")) {
			outputMessage.setText("Select Payment Option");
	    }else {
			outputMessage.setText("");

	    }
	
	// check if card is 12 digits, should also be only numbers (Add later)
		if(cardNumberField.getText().length() != 12) {
			outputMessage.setText("Invalid card number");
		} else {
			cardNumber = cardNumberField.getText() + "";
		}
		
//		 check if cvv is 3 digits, should also be only numbers (Add later)
		if(cvvField.getText().length() != 3) {
			outputMessage.setText("Invalid CVV number");
		} else {
			cvvNumber = cvvField.getText() + "";
		}
		
		if(dateConfirmed == false) {
			outputMessage.setText("Confirm Date/Time First");

		}
		if(!nameOnCard.equals("") && !cardNumber.equals("") && !cardNumber.equals("") && !cardNumber.equals("")) {
//			UserController.checkoutInfo(nameOnCard, cardNumber, cvvNumber, creditDebitText, updatedBalance);
			outputMessage.setForeground(Color.BLUE);
			// could have created a method to update the info below in the UserController
//			UserController.getLoggedInUser().setCardName(nameOnCard);
//			UserController.getLoggedInUser().setCardNumber(cardNumber);
//			UserController.getLoggedInUser().setCvvNumber(cvvNumber);
//			UserController.getLoggedInUser().chargeUser(creditDebitText, (int) (hoursBookedFor*UserController.getLoggedInUser().getRate()));
     		creditBalance.setText("Credit: " +UserController.getLoggedInUser().getCredittBalance());
			debitBalance.setText("Debit: " + UserController.getLoggedInUser().getDebitBalance());
			outputMessage.setText("Parking Spot Booked!");
			int price1 =  (int) (UserController.getLoggedInUser().getRate()* hoursBookedFor + UserController.getLoggedInUser().getRate());
		
			UserController.checkoutInfo(nameOnCard, cardNumber, cvvNumber, creditDebitText, price1, startTime, endTime);

			 creditBalance.setText("Credit: " + UserController.getLoggedInUser().getCredittBalance());
			 debitBalance.setText("Debit: " + UserController.getLoggedInUser().getDebitBalance());
		} else {
			outputMessage.setText("Invalid entry");
		}
//	updatedBalance = 	getBalance - parkingCost;
//	UserController.checkoutInfo(nameOnCard, cardNumber, cvvNumber, creditDebitText, updatedBalance);
	}
});


}
}