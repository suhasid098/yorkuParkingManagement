package views;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.UserController;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")

public class VanierLotView extends JFrame{
	private VanierLotView thisView = this;
	protected Main frame;

	
	public VanierLotView(Main frame) {
		this.frame = frame;
		//Frame setup.
		//Set frame title.
		this.setTitle("YorkUParking - Vanier");
		//Set the frame to exit when closed.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		
		//Set the frame's size.
		this.setSize(450, 450);	
		//Set the frame to open in the middle of the screen.
		this.setLocationRelativeTo(null);
		
		//Pane setup.
		//Get the content pane.
		Container contentPane = this.getContentPane();
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vanier Lot");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(165, 24, 83, 15);
		getContentPane().add(lblNewLabel);

		JButton psVanier001 = new JButton("001");
		psVanier001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psVanier001);

		psVanier001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("001", "Varnier");
			}
		});
		psVanier001.setBounds(10, 49, 174, 76);
		getContentPane().add(psVanier001);

		JButton psVanier002 = new JButton("002");
		psVanier002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psVanier002);
		psVanier002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("002", "Varnier");
			}
		});
		psVanier002.setBounds(10, 135, 174, 76);
		getContentPane().add(psVanier002);

		JButton psVanier003 = new JButton("003");
		psVanier003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psVanier003.setBounds(10, 241, 174, 76);
		setColorButton(psVanier003);
		psVanier003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("003", "Varnier");
			}
		});
		getContentPane().add(psVanier003);

		JButton psVanier004 = new JButton("004");
		psVanier004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psVanier004.setBounds(10, 327, 174, 76);
		setColorButton(psVanier004);

		getContentPane().add(psVanier004);
		
		psVanier004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("004", "Varnier");
			}
		});

		JButton psVanier005 = new JButton("005");
		psVanier005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psVanier005);
		psVanier005.setBounds(252, 49, 174, 76);
		getContentPane().add(psVanier005);
		psVanier005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("005", "Varnier");
			}
		});

		JButton psVanier006 = new JButton("006");
		psVanier006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psVanier006.setBounds(252, 135, 174, 76);
		setColorButton(psVanier006);
		getContentPane().add(psVanier006);
		psVanier006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("006", "Varnier");
			}
		});

		JButton psVanier007 = new JButton("007");
		psVanier007.setFont(new Font("Tahoma", Font.PLAIN, 12));
		setColorButton(psVanier007);
		psVanier007.setBounds(252, 241, 174, 76);
		getContentPane().add(psVanier007);
		psVanier007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("007", "Varnier");
			}
		});
		
		JButton psVanier008 = new JButton("008");
		psVanier008.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psVanier008.setBounds(252, 327, 174, 76);
		setColorButton(psVanier008);
		getContentPane().add(psVanier008);		
		psVanier008.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserController.addParkingSpot("008", "Varnier");
			}
		});
		
		JButton backButton = new JButton("back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new LotChoiceView(thisView.frame), "Lot");
			}
		});
		backButton.setBounds(341, 10, 85, 21);
		getContentPane().add(backButton);

	}
	private void setColorButton(JButton button) {
		System.out.println("hi " + button.getText());
		if(UserController.isSpotTaken(button.getText(), "Varnier") == false) {
			button.setBackground(Color.green);
		} else {
			button.setBackground(Color.red);
		}
	}
	
}