import java.util.Scanner;
class Lab2Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = factorial(sc.nextInt());
        System.out.println(result);
    }
    public static int factorial(int r){
        int sum =1;
        for (int a=r;a>0 ;a-- ) {
            sum=sum*a;
        }
        return sum;
    }
    
}