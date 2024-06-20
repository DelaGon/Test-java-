import java.util.Scanner;
class Lab2Task8 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String result = checknumber(sc.nextInt());
    System.out.println(result);
}
public static String checknumber(int num){
 if(num%2==0){
    return "Even";
 }
else {
    return "Odd";
}
}
}
