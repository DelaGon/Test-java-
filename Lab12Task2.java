import javax.swing.*;
import java.awt.BorderLayout;

class Lab12Task2 extends JFrame {

	public Lab12Task2() {

		setTitle("64314455");
		setSize(400, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Flow layout for a row of components
		setLayout(new BorderLayout());

		final JButton button1 = new JButton("1");
		getContentPane().add(button1,BorderLayout.PAGE_START);

		final JButton button2 = new JButton("2");
		getContentPane().add(button2,BorderLayout.CENTER);

		final JButton button3 = new JButton("3");
		getContentPane().add(button3,BorderLayout.LINE_START);

		final JButton button4 = new JButton("4");
		getContentPane().add(button4,BorderLayout.LINE_END);

		final JButton button5 = new JButton("5");
		getContentPane().add(button5,BorderLayout.PAGE_END);
	}

	public static void main(String ... args) {
        Lab12Task2 app = new Lab12Task2();
		app.setVisible(true);
	}
}
