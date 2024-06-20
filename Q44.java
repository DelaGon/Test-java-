import java.util.Scanner;
public class Q44{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    for (int i=1;i<=num ;i++ ) {
        double v= Math.pow(i,2);
        System.out.println((int)v);
    }
}
}