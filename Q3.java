import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    if (num%2==0&&num%3==0) {
        System.out.println("23");
    }else if(num%2==0) {
        System.out.println("2");
    }else if (num%3==0){
        System.out.println("3");
}else{
         System.out.println("None");
    }
}
}