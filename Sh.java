import java.util.Scanner;

public class Sh {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int count = scan.nextInt(); 

		for (int i = 0; i < count; i++) { 
			for (int j = 0; j < count; j++) { 
				if (i == 0 || i == (count - 1)) { 
					System.out.print("*");
				} else {
					if (j == 0 || j == (count - 1)) { 
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}
		System.out.println();
	}
}