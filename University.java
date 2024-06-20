class University{
  private Student students[] = new Student[100];
  private int c =0;
   public University(String name){
    System.out.println("Student of "+name);
    }
    public void add(Student student){
    	students[c] = student;
    	c++;
    }
    public void listStudents(){
    	for (int i=0;i<c ;i++ ) {
    		students[i].calGrade();
    		System.out.println(students[i].toString());
    	}
    	}
    }