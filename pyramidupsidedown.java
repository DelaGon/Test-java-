import java.util.Scanner;

public class pyramidupsidedown {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int py = scan.nextInt(); 
      for (int i=py;i>=1;i-- ) {
      	for (int j=py;j>i;j-- ) {
      		System.out.print(" ");
      	}for (int k=1;k<=i ;k++ ) {
      		System.out.print("#");
      	}
      	System.out.println("");
      }
      
  }
}