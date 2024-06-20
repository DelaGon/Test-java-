import java.util.Scanner;

public class Piramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int count = scan.nextInt(); 

		for (int i = 0; i < count; i++) { 
			for (int j = 0; j < (count - i - 1); j++) { 
				System.out.print(" ");
			}
			for (int k = 0; k < ((2 * i) + 1); k++) { 
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println();
	}
}