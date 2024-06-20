import java.util.Scanner;

public class Pny {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int t=1;
		 for (int i =1;i<n ;i++ ) {
		 	for (int j =1;j<n ;j++ ) {
		 		System.out.print(" ");
		 	}
		 	t=1;
		 	for (int h =0;h<=i ;h++ ) {
		 		System.out.print(t+" ");
		 		t=t*(i-h)/(h+1);
		 	}
		 	n--;
		 	System.out.println();
		 }
		}
	}