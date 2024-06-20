import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class Lab11Task7 extends JFrame implements ActionListener{
	private JLabel resultLabel;
    private JButton button;
	public Lab11Task7(){
		setTitle("64314455");
		setSize(400,400);
		setLocation(10,200);
		
		setLayout(new FlowLayout());
		final JLabel label = new JLabel("Hey Priscilla");
		getContentPane().add(label);
		
		final JButton button = new JButton("Yes Flash?");
		getContentPane().add(button);
		button.addActionListener(this);
		
        resultLabel = new JLabel("");
		getContentPane().add(resultLabel);

        final JButton punchButton = new JButton("Punch");
        punchButton.setActionCommand("punch");
        punchButton.addActionListener(this);
        getContentPane().add(punchButton);
	}
	public void actionPerformed(ActionEvent e){
		button = (JButton) e.getSource();
        if(button.getActionCommand().equals("punch")){
            resultLabel.setText("Pregnant!");
        }else{
            resultLabel.setText("What do you call a three humped camel?");
	}
}
	public static void main(String[] args) {
		Lab11Task7 app = new Lab11Task7();
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}