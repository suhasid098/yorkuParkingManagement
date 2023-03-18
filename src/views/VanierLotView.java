package views;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnNewButton = new JButton("001");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 49, 174, 76);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("002");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 135, 174, 76);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("003");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(10, 241, 174, 76);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("004");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(10, 327, 174, 76);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("005");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(252, 49, 174, 76);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("006");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setBounds(252, 135, 174, 76);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("007");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_6.setBounds(252, 241, 174, 76);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("008");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_7.setBounds(252, 327, 174, 76);
		getContentPane().add(btnNewButton_7);
		
		
		
		
	}
}
