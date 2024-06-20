import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int num;
      Scanner s = new Scanner(System.in);
      
      int row = s.nextInt();
      
      for(int i=1; i<=row; i++)
      {
         for(byte whiteSpace=(byte)(row-i);whiteSpace>0; whiteSpace--){
            
            System.out.print(" ");
         }
     System.out.println();
         num=1;
         for(int j=0; j<=i; j++)
         {
            System.out.print(num +" ");
            num = num*(i-j)/(j+1);
         }
         System.out.print("\n");
      }
   }
}