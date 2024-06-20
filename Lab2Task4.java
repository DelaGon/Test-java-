import java.util.Scanner;

public class Lab2Task4 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int first = s.nextInt();
   
    int second = s.nextInt();
    
if (second > first) {
   for (int i = first + 1; i < second; i++)
            System.out.print(i + " ");
    } else {
   for (int i = second + 1; i < first; i++)
            System.out.print(i + " ");
    }
 }
}