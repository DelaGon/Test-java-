public class Lab10Task2{
	public static void main(String[] args) {
		Student student1 = new Undergrad("Wuttipong");
		student1.insertTestScore(70);
		student1.insertTestScore(71);
		student1.insertTestScore(72);
		student1.calGrade();
		System.out.println(student1.toString());
	}
}
//Undergrad เป็นคลาสลูก ของ Student โดยที่ คลาสลูกจะใช้ของเป็นของแม่ได้ 
//โดย บรรทัดที่8 จะprint ออกมา "Undergraduated Student: "(ซึ่งมาจากคลาสของ Undergrad) + super.toString()(อันนี้มาจากคลาสของแม่);
//โดยที่ super.toString() คือ "Name: "+name("Wuttipong")+ ", Grade: " + grade(อันนี้ก็มาจากcalGrade()ที่หาค่าเฉลี่ยจากคะแนน);
//ผลลัพท์ที่ได้จึงเป็นแบบนี้ Undergraduated Student: Name: Wuttipong, Grade: pass
 