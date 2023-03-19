package views;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.UserController;
import objects.User;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class CheckoutView extends JFrame{
    private CheckoutView thisView = this;
    protected Main frame;
    private JTextField textField;
    private JTextField textField_1;



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
        priceLabel.setBounds(108, 92, 186, 80);
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

    }
}