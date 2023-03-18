package views;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SchulichLotView extends JFrame {
	private SchulichLotView thisView = this;
	protected Main frame;
	public SchulichLotView(Main frame) {
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Schulich");
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
		
		JLabel lblCalumetLot = new JLabel("Schulich Lot");
		lblCalumetLot.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCalumetLot.setBounds(167, 10, 99, 25);
		getContentPane().add(lblCalumetLot);
		
		JButton psSchulich004 = new JButton("004");
		psSchulich004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich004.setBounds(10, 327, 174, 76);
		getContentPane().add(psSchulich004);
		
		JButton psSchulich003 = new JButton("003");
		psSchulich003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich003.setBounds(10, 241, 174, 76);
		getContentPane().add(psSchulich003);
		
		JButton psSchulich002 = new JButton("002");
		psSchulich002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich002.setBounds(10, 155, 174, 76);
		getContentPane().add(psSchulich002);
		
		JButton psSchulich001 = new JButton("001");
		psSchulich001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich001.setBounds(10, 69, 174, 76);
		getContentPane().add(psSchulich001);
		
		JButton psSchulich006 = new JButton("006");
		psSchulich006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich006.setBounds(350, 229, 76, 174);
		getContentPane().add(psSchulich006);
		
		JButton psSchulich005 = new JButton("005");
		psSchulich005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psSchulich005.setBounds(350, 45, 76, 174);
		getContentPane().add(psSchulich005);
		
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