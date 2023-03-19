package views;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.UserController;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Enumeration;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class CheckoutView extends JFrame{
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
    private JButton btnNewButton;
	protected String creditDebitText;


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
        
        JLabel lblNewLabel_4 = new JLabel("Select payment method");
        lblNewLabel_4.setBounds(143, 182, 118, 13);
        getContentPane().add(lblNewLabel_4);
        
        nameCardField = new JTextField();
        nameCardField.setBounds(108, 252, 186, 19);
        getContentPane().add(nameCardField);
        nameCardField.setColumns(10);
        
        cardNumberField = new JTextField();
        cardNumberField.setBounds(108, 303, 186, 19);
        getContentPane().add(cardNumberField);
        cardNumberField.setColumns(10);
        cardNumberField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (cardNumberField.getText().length() >= 12 ) // limit to 12 characters
                    e.consume();
            }
        });
        
        nameCard = new JLabel("Name on Card");
        nameCard.setBounds(107, 229, 88, 13);
        getContentPane().add(nameCard);
        
        cardNumberLabel = new JLabel("12 digit card number");
        cardNumberLabel.setBounds(108, 281, 118, 12);
        getContentPane().add(cardNumberLabel);
        
        cvvLabel = new JLabel("CVV");
        cvvLabel.setBounds(108, 332, 45, 13);
        getContentPane().add(cvvLabel);
        
        cvvField = new JTextField();
        cvvField.setBounds(108, 349, 96, 19);
        getContentPane().add(cvvField);
        cvvField.setColumns(10);
        cvvField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (cvvField.getText().length() >= 3 ) // limit to 3 characters
                    e.consume();
            }
        });    
        
        creditRadioButton = new JRadioButton("Credit");
        creditRadioButton.setBounds(108, 201, 70, 21);
        getContentPane().add(creditRadioButton);
        
        debitRadioButton = new JRadioButton("Debit");
        debitRadioButton.setBounds(235, 201, 70, 21);
        getContentPane().add(debitRadioButton);
        
        ButtonGroup groupCreditDebit = new ButtonGroup();
        groupCreditDebit.add(creditRadioButton);
        groupCreditDebit.add(debitRadioButton);
        
        btnNewButton = new JButton("Confirm");
        btnNewButton.setBounds(341, 382, 85, 21);
        getContentPane().add(btnNewButton);
        
        for (Enumeration<AbstractButton> buttons = groupCreditDebit.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                creditDebitText = button.getText();
            }
        }
        
       
    }
}