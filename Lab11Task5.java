import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class Lab11Task5 extends JFrame implements ActionListener{
	private JLabel resultLabel;
	public Lab11Task5(){
		setTitle("64314455");
		setSize(400,400);
		setLocation(10,200);
		
		setLayout(new FlowLayout());
		final JLabel label = new JLabel("Hey Priscilla");
		getContentPane().add(label);
		
		final JButton button2 = new JButton("Yes Flash?");
		getContentPane().add(button2);
		button2.addActionListener(this);
		
		resultLabel = new JLabel("");
		getContentPane().add(resultLabel);
	}
	public void actionPerformed(ActionEvent e){
		resultLabel.setText("What do you call a three humped camel?");
	}
	public static void main(String[] args) {
		Lab11Task5 app = new Lab11Task5();
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}