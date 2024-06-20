public class Graduate extends Student {
   public Graduate(String name) {
      super(name);
   }
   public String toString(){
        return "Graduated Student: " +super.toString();
    }
   public void calGrade(){   
        if (super.Average()>=80){
            this.gotGrade("pass");
    }else{
            this.gotGrade("fail");
        }
     }
}

