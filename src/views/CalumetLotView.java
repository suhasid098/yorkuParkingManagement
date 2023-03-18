package views;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalumetLotView extends JFrame {
	private CalumetLotView thisView = this;
	protected Main frame;
	public CalumetLotView(Main frame) {
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Calumet");
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
		
		JLabel lblCalumetLot = new JLabel("Calumet Lot");
		lblCalumetLot.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCalumetLot.setBounds(146, 20, 93, 25);
		getContentPane().add(lblCalumetLot);
		
		JButton psCalumet001 = new JButton("001");
		psCalumet001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet001.setBounds(252, 327, 174, 76);
		getContentPane().add(psCalumet001);
		
		JButton psCalumet002 = new JButton("002");
		psCalumet002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet002.setBounds(252, 241, 174, 76);
		getContentPane().add(psCalumet002);
		
		JButton psCalumet003 = new JButton("003");
		psCalumet003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet003.setBounds(252, 155, 174, 76);
		getContentPane().add(psCalumet003);
		
		JButton psCalumet004 = new JButton("004");
		psCalumet004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet004.setBounds(252, 68, 174, 76);
		getContentPane().add(psCalumet004);
		
		JButton psCalumet005 = new JButton("005");
		psCalumet005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet005.setBounds(10, 229, 76, 174);
		getContentPane().add(psCalumet005);
		
		JButton psCalumet006 = new JButton("006");
		psCalumet006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psCalumet006.setBounds(10, 45, 76, 174);
		getContentPane().add(psCalumet006);
		
		JButton backButton = new JButton("back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thisView.frame.changeContentPane(new LotChoiceView(thisView.frame), "Lot");
			}
		});
		backButton.setBounds(341, 10, 85, 21);
		getContentPane().add(backButton);
		
	}

}
