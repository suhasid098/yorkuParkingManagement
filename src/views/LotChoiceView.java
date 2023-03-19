package views;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LotChoiceView extends JFrame {

	private LotChoiceView thisView = this;
	protected Main frame;
	private LotFactory factory = new LotFactory(); 	// Here I am using the Factory Design Pattern

	public LotChoiceView(Main frame) {
		this.frame = frame;
		// Frame setup.
		// Set frame title.
		this.setTitle("YorkUParking - Lot");
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

		JLabel lblNewLabel = new JLabel("Select a Parking Lot");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(118, 114, 159, 32);
		getContentPane().add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "Vanier", "Bethune", "Calumet", "Schulich", "Lassonde" }));

		comboBox.setBounds(143, 153, 106, 21);
		getContentPane().add(comboBox);
		
		
		comboBox.getSelectedIndex();
		
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lotName = (String) comboBox.getSelectedItem();
				System.out.println("factory: " + lotName);
				JFrame lotFrame = factory.getLot(thisView.frame, lotName);
				System.out.println("frame: " + lotFrame);

				thisView.frame.changeContentPane(lotFrame, lotName);

	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(341, 382, 85, 21);
		getContentPane().add(btnNewButton);

	}
}

