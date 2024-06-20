import java.util.Scanner;
class Lab2Task1{

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String word = sc.nextLine();
   int num = sc.nextInt();
   int nw = word.length();
   if (num>nw) {
      System.out.println("error");
}else{
      char m = wordLab2Task2 .charAt(num-1);
      System.out.println(m);
   }

}
}