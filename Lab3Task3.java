import java.util.Scanner;
class Lab3Task3{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String[] input =in.nextLine().split(" ");
	int[] leon =new int[input.length];
	for (int i=0;i<input.length ;i++ ) {
		leon[i] =Integer.parseInt(input[i]);
	}
	for (int i=0;i< leon.length;i++ ) {
		if (leon[i]<leon[leon.length-1]) {
			System.out.print(leon[i]+" ");
		}
		
	}
}
}