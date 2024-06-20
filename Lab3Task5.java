public class Lab3Task5 
{
  public static void main(String[] args)
  {
      int[] numbers = {5, 9, 12, 7, 14, 3, 2};
      int [] numbers5 = arrayPlus(numbers, 5);
      for (int i = 0; i < numbers5.length; i++)
      {
          System.out.print(numbers5[i] + ", ");
      }
      System.out.println();
      int[] numbers10 = arrayPlus(numbers, 10);
      for (int i = 0; i < numbers10.length; i++)
      {
          System.out.print(numbers10[i] + ", ");
      }
      System.out.println();
  }
  static int[] arrayPlus(int[] param1,int x){

      for (int i = 0; i < param1.length; i++){
         param1[i] = param1[i]+x;
       }
   return param1;
 }
}