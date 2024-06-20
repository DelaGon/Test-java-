import java.util.Scanner;
public class Q6{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w1 =sc.nextLine();
    String w2 =sc.nextLine();
    int one =w1.length();
    int two = w2.length();
    if (one==two) {
        System.out.print(true);
    }else{
        System.out.print(false);
    }
}
}