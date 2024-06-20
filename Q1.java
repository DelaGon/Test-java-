import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double venus = 224.70;
    double earth = 365.25;
    int age =sc.nextInt();
    double daysearth = earth*age;
    double ys = daysearth/venus;
    System.out.printf("%.2f",ys);
}
}
