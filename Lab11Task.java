import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;
class Lab11Task extends JFrame{
	public Lab11Task(){
		setTitle("My Application");
		setSize(400,400);
		setLocation(10,200);
		
		setLayout(new FlowLayout());
		final JLabel label = new JLabel("Hello Mor Nor");
		gatContentPane().add(label);

		final JButton button1 = new JButton("Yes Flash?");
		gatContentPane().add(button1);

		final JButton button2 = new JButton("No Flash?");
		gatContentPane().add(button2);
	}
	public static void main(String[] args){
		Lab11Task4 app = new Lab11Task4();
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}  