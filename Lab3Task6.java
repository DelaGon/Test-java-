import java.util.Scanner;
public class Lab3Task6
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter your text:");
    String x=sc.nextLine();
    
    System.out.println(x.length()); 
    System.out.println("Then it should output 2 lines: ");
    
        for (int i =0;i<x.length() ;i++ ) {
            char a = x.charAt(i);
                if (a == 'a'||a == 'e'||a == 'i'||a == 'o'||a == 'u' ) {
                System.out.print(a);  
                }else{
                System.out.print(" ");
                }
        }
    System.out.println(" ");
        for (int k =0;k<x.length() ;k++ ) {
            char a = x.charAt(k);
                if (a == 'a'||a == 'e'||a == 'i'||a == 'o'||a == 'u' ) {
            System.out.print(" ");
            }else{
            System.out.print(a); 
            }
        }

    }
}
