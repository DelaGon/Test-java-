public class Student {
 private final int NUM_OF_TESTS = 10; // number of Test
 private int count = 0;
 private String name; // Student Name
 private String grade; // can be "pass" or "fail"
 private int[] test; // keep the score test

    public Student( ) {
    this.name = "undefined";
    test = new int[NUM_OF_TESTS];
    }
    public Student(String name) {
    this.name = name;
    test = new int[NUM_OF_TESTS];
    grade = "unknown";
    }
    public int getCount(){
        return count;
     }
     public double getTest(int i){
        return test[i];
     }
     
     public String getGrade() {
     return grade;
     }
     public String getName() {
     return name;
     }
     
     public void insertTestScore(int testScore) {
     if(count<NUM_OF_TESTS){
     test[count] = testScore;
     count++;
     }
     else System.out.println("Out of range");
     }

     public void gotGrade(String a){
        this.grade = a;
     }
     public String toString(){
        return "Name: "+ name+",Average Score: "+String.format("%.2f",Average())+",Grade: "+grade;
     }
     public double Average(){
        double score = 0;
        for (int i =0;i<count ;i++ ) {
          score+=test[i];
        }
        double ave= score/count;
        return ave;
    }
     public void calGrade(){   
        if (Average()>=50){
            this.grade ="pass";
    }else{
            this.grade="fail";
        }
     }
}