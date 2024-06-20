public class Lab10Task3{
	public static void main(String[] args) {
		Student student2 = new Graduate("Adirek");
		student2.insertTestScore(50);
		student2.insertTestScore(50);
		student2.insertTestScore(50);
		student2.calGrade();
		System.out.println(student2.toString());
	}
}