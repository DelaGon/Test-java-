import java.util.Scanner;

class pyramidnum
{
public static void main(String args[])
{
int b;
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
	for(int i=0; i<a; i++){
		for(int s=a; s>i; s--){

        System.out.print("");
		}
		b=1;
			for(int j=0; j <= i; j++){
			System.out.print(b+" ");
			System.out.print(" ");
			b = b*(i-j)/(j+1);
			}
		System.out.print("\n");
	
	}

  }
}
