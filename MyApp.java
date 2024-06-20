import javax.swing.*;
class Lab11Task2 extends JFrame{
	public Lab11Task2(){
		JFrame frame = new JFrame();
		frame.setTitle("My Application");
		frame.setSize(400,400);
		frame.setLocation(10,200);
	}
	public static void main(String[] args){
		Lab11Task2 app = new Lab11Task2();
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}  