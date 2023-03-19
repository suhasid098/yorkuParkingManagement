package views;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

public class CheckoutView extends JFrame{
    private CheckoutView thisView = this;
    protected Main frame;
    private JTextField textField;
    private JTextField textField_1;


	public LocalDateTime endTime = null;

	public LocalDateTime currentTime = null;

    
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

        JLabel nameLabel = new JLabel("The total for " + UserController.getLoggedInUser().name);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
        nameLabel.setBounds(10, 10, 426, 25);
        getContentPane().add(nameLabel);

        JLabel parkingLabel = new JLabel("For parking spot id "+ UserController.getLoggedInUser().getParkingSpotName()+ ", in parking lot "+UserController.getLoggedInUser().getLotName()+", ");
        parkingLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
        parkingLabel.setBounds(10, 45, 426, 25);
        getContentPane().add(parkingLabel);
        
        
      
        
        String priceLot = UserController.getLoggedInUser().getRate()+"";
        System.out.println(UserController.getLoggedInUser().getRate());
        System.out.println(priceLot);
        JLabel priceLabel = new JLabel(priceLot);
        priceLabel.setForeground(Color.RED);
        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        priceLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
        priceLabel.setBounds(144, 78, 111, 32);
        getContentPane().add(priceLabel);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Credit Card", "Debit Card", "Mobile Payment"}));
        comboBox.setBounds(144, 182, 118, 21);
        getContentPane().add(comboBox);
        
        textField = new JTextField();
        textField.setBounds(108, 242, 186, 19);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(108, 293, 96, 19);
        getContentPane().add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Name on Card");
        lblNewLabel.setBounds(108, 219, 88, 13);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("12 digit card number");
        lblNewLabel_1.setBounds(108, 271, 118, 12);
        getContentPane().add(lblNewLabel_1);
        
        JComboBox year = new JComboBox();
        year.setModel(new DefaultComboBoxModel(new Integer[] {2023, 2024}));
        year.setBounds(10, 123, 61, 22);
        getContentPane().add(year);
        
        JComboBox month = new JComboBox();
        month.setModel(new DefaultComboBoxModel(new Month[] {Month.JANUARY, Month.FEBRUARY, Month.MARCH, Month.APRIL, Month.MAY, Month.AUGUST, Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER}));
        month.setBounds(81, 123, 58, 22);
        getContentPane().add(month);
        
        JComboBox day = new JComboBox();
        day.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}));
        day.setBounds(146, 123, 58, 22);
        getContentPane().add(day);
        
        JComboBox hour = new JComboBox();
        hour.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}));
        hour.setBounds(214, 123, 61, 22);
        getContentPane().add(hour);
        
        JComboBox minute = new JComboBox();
        minute.setModel(new DefaultComboBoxModel(new Integer[] {00, 10, 20, 30, 40, 50}));
        minute.setBounds(285, 123, 58, 22);
        getContentPane().add(minute);
        
        JButton confirmTime = new JButton("Confirm");
        confirmTime.setBounds(353, 123, 71, 23);
        getContentPane().add(confirmTime);
    
    
confirmTime.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int yearVal = (int) year.getSelectedItem();
			Month monthVal = (Month) month.getSelectedItem();
			int dayVal = (int) day.getSelectedItem();
			int hourVal = (int) hour.getSelectedItem();
			int minVal = (int) minute.getSelectedItem();
			LocalDateTime endTime = LocalDateTime.of(yearVal,monthVal,dayVal,hourVal,minVal);
			System.out.println(endTime.toString());
			currentTime = LocalDateTime.now();

			Duration diff = Duration.between(currentTime, endTime);
			int c = currentTime.compareTo(endTime);
			System.out.println(c);
			System.out.println(diff.toHours());

//			https://www.geeksforgeeks.org/date-class-java-examples/
			
			   String priceLot = UserController.getLoggedInUser().getRate()* diff.toHours() + "";
//		        System.out.println(UserController.getLoggedInUser().getRate());
//		        System.out.println(priceLot);
//		        JLabel priceLabel = new JLabel(priceLot);
//		        priceLabel.setForeground(Color.RED);
//		        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
			    priceLabel.setText(priceLot);
//		        priceLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
//		        priceLabel.setBounds(144, 78, 111, 32);
//		        getContentPane().add(priceLabel);
		}
	});
  }
}