package views;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class BethuneLotView extends JFrame {
	private BethuneLotView thisView = this;
	protected Main frame;
	
	public BethuneLotView(Main frame) {
		this.frame=frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Bethune");
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
		
		JButton psBethune006 = new JButton("006");
		psBethune006.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune006.setBounds(10, 229, 76, 174);
		getContentPane().add(psBethune006);
		
		JLabel lblBethuneLot = new JLabel("Bethune Lot");
		lblBethuneLot.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBethuneLot.setBounds(169, 20, 93, 15);
		getContentPane().add(lblBethuneLot);
		
		JButton psBethune007 = new JButton("007");
		psBethune007.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune007.setBounds(96, 229, 76, 174);
		getContentPane().add(psBethune007);
		
		JButton psBethune008 = new JButton("008");
		psBethune008.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune008.setBounds(186, 229, 76, 174);
		getContentPane().add(psBethune008);
		
		JButton psBethune009 = new JButton("009");
		psBethune009.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune009.setBounds(272, 229, 76, 174);
		getContentPane().add(psBethune009);
		
		JButton psBethune010 = new JButton("010");
		psBethune010.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune010.setBounds(358, 229, 76, 174);
		getContentPane().add(psBethune010);
		
		JButton psBethune005 = new JButton("005");
		psBethune005.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune005.setBounds(358, 45, 76, 174);
		getContentPane().add(psBethune005);
		
		JButton psBethune004 = new JButton("004");
		psBethune004.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune004.setBounds(272, 45, 76, 174);
		getContentPane().add(psBethune004);
		
		JButton psBethune003 = new JButton("003");
		psBethune003.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune003.setBounds(186, 45, 76, 174);
		getContentPane().add(psBethune003);
		
		JButton psBethune002 = new JButton("002");
		psBethune002.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune002.setBounds(96, 45, 76, 174);
		getContentPane().add(psBethune002);
		
		JButton psBethune001 = new JButton("001");
		psBethune001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		psBethune001.setBounds(10, 45, 76, 174);
		getContentPane().add(psBethune001);
		
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
