import java.util.Scanner;
class Midnum {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pyramid(n);
	}

public static void pyramid(int n)
{

int[][] arr = new int[n][n];
for(int d=0; d<n; d++){
for(int s=1; s <= n-d; s++){
System.out.print(" ") ;

}
}
for (int i = 0; i < n; i++)
{
	
	for (int j = 0; j <= i; j++)
	{
	
	if (i == j || j == 0)
		arr[i][j] = 1;
	else 
		arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
	System.out.print(" "+arr[i][j]+" ");
	}
	System.out.println(" ");
}
}
}


