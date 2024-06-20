import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

class Lab12Task5 extends JFrame {

 final JTextField topField;
 final JTextField bottomField;
 final JLabel equalsLabel;
 
	public Lab12Task5() {

		setTitle("Fraction to Real");
		setSize(280, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

		final JPanel calcPanel = new JPanel(new FlowLayout());
		getContentPane().add(calcPanel, BorderLayout.CENTER);

		final JButton calcButton = new JButton("Convert");
		getContentPane().add(calcButton, BorderLayout.PAGE_END);
 
		//Calc panel is FlowLayout
		topField = new JTextField("1", 2);
		calcPanel.add(topField);

		final JLabel plusLabel = new JLabel("+");
		plusLabel.setFont(plusLabel.getFont().deriveFont(20.0f));
		calcPanel.add(plusLabel);

		bottomField = new JTextField("3", 2);
		calcPanel.add(bottomField);

		equalsLabel = new JLabel("= ?");
		equalsLabel.setFont(equalsLabel.getFont().deriveFont(20,0f));
		calcPanel.add(equalsLabel);
	}

	public static void main(String[] args) {
		Lab12Task5 app = new Lab12Task5();
		app.setVisible(true);
	}
}