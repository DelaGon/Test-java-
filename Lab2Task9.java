import java.util.Scanner;

public class Lab2Task9 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num =s.nextInt();
    int sum =0;

    for(int a = num;a>=2;a--){
    System.out.print(a+" + ");
}
    for(int i = num;i>=1;i--){
    sum +=i;
}
System.out.print("1"+" = "+sum);
  

}
}

    