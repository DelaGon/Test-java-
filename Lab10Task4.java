public class Lab10Task4{
	public static void main(String[] args) {
		Student student1 = new Graduate("Adirek");
		student1.insertTestScore(50);
		student1.insertTestScore(50);
		student1.insertTestScore(50);
		
		Student student2 = new Graduate("Winai");
		student2.insertTestScore(80);
		student2.insertTestScore(75);
		student2.insertTestScore(90);
		
		Student student3 = new Undergrad("Wuttipong");
		student3.insertTestScore(45);
		student3.insertTestScore(50);
		student3.insertTestScore(65);

		Student student4 = new Undergrad("Sanya");
		student4.insertTestScore(45);
		student4.insertTestScore(50);
		student4.insertTestScore(35);
		
		University u = new University("Naresuan Univeristy");
		u.add(student1);
		u.add(student2);
		u.add(student3);
		u.add(student4);
		u.listStudents();
	}
}
