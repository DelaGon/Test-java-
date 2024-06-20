public class Lab10Task1{
	public static void main(String[] args) {
		Student student1 = new Student("Wuttipong");
		Student student2 = new Student("Winai");
		student1.insertTestScore(70);
		student1.insertTestScore(71);
		student1.insertTestScore(72);
		student1.calGrade();
		System.out.println(student1.toString());

		student2.insertTestScore(40);
		student2.insertTestScore(50);
		student2.insertTestScore(30);
		student2.calGrade();
		System.out.println(student2);
	}
}