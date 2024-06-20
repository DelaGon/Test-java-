import java.util.Scanner;
class Ppay{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int c = n;
		for (int i =0;i<n ;i++,c-- ) {
			for(int s=0; s < (c*2)-2; s++){
				System.out.print(" ");
			}
		int v=1;
		int m=0;
			for(int j=0; j <= i; j++,m++){
				if (v>=5&&i>4){
					System.out.print(v+"  ");
				if(m>=i-2){
					System.out.print(" ");
					}
				}
				else if(j<i){
					System.out.print(v+"   ");	
				}
				else{
					System.out.print(v);
				}
				v=v*(i-j)/(j+1);
			}
		System.out.println();
		}
	}
}

