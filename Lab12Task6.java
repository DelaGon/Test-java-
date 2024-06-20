import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Lab12Task6 extends JFrame implements ActionListener{
 final JTextField topField,topField2;
 final JTextField bottomField,bottomField2;
 final JLabel equalsLabel,equalsLabel2,equalsLabel3;
    public Lab12Task6(){
        setTitle("Fraction Calculator");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

		final JPanel calcPanel1 = new JPanel(new FlowLayout());
		getContentPane().add(calcPanel1, BorderLayout.CENTER);

		final JButton calcButton = new JButton("Convert");
		getContentPane().add(calcButton, BorderLayout.PAGE_END);
        calcButton.addActionListener(this);
 
        final JPanel calcPanel2 =new JPanel(new GridLayout(2,1));
        calcPanel1.add(calcPanel2);
	
		topField = new JTextField("1", 2);
		calcPanel2.add(topField);

        bottomField = new JTextField("3", 2);
		calcPanel2.add(bottomField);

		final JLabel plusLabel = new JLabel("+");
		plusLabel.setFont(plusLabel.getFont().deriveFont(20.0f));
		calcPanel1.add(plusLabel);

        final JPanel calcPanel3 =new JPanel(new GridLayout(2,1));
        calcPanel1.add(calcPanel3);

		topField2 = new JTextField("2", 2);
		calcPanel3.add(topField2);

        bottomField2 = new JTextField("5", 2);
		calcPanel3.add(bottomField2);

		equalsLabel = new JLabel("= ");
		equalsLabel.setFont(equalsLabel.getFont().deriveFont(20.0f));
		calcPanel1.add(equalsLabel);

		final JPanel calcPanel4 =new JPanel(new GridLayout(2,1));
        calcPanel1.add(calcPanel4);

        equalsLabel2 = new JLabel(" ");
		equalsLabel2.setFont(equalsLabel.getFont().deriveFont(20.0f));
		calcPanel4.add(equalsLabel2);

        equalsLabel3 = new JLabel(" ");
		equalsLabel3.setFont(equalsLabel.getFont().deriveFont(20.0f));
		calcPanel4.add(equalsLabel3);
    }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(topField.getText())*Integer.parseInt(bottomField2.getText());
        int b = Integer.parseInt(topField2.getText())*Integer.parseInt(bottomField.getText());
        int c = a+b;
        int button = Integer.parseInt(bottomField.getText())*Integer.parseInt(bottomField2.getText());

        String top = String.valueOf(c);
        String button1 = String.valueOf(button);
        equalsLabel2.setText(top);
        equalsLabel3.setText(button1);
    }
	public static void main(String[] args) {
		Lab12Task6 app = new Lab12Task6();
		app.setVisible(true);
	}  
}