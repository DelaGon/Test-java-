import java.util.Scanner;

public class Lab2Task5  {

   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   String word = scan.nextLine(); 
   int count = 0;
   for (int i = 0; i < word.length(); i++) {
      if(word.charAt(i) == 'A' || word.charAt(i) == 'a' || 
         word.charAt(i) == 'E' || word.charAt(i) == 'e' || 
         word.charAt(i) == 'I' || word.charAt(i) == 'i' || 
         word.charAt(i) == 'O' || word.charAt(i) == 'o' || 
         word.charAt(i) == 'U' || word.charAt(i) == 'u'    
   ) {
             count++;  
     }
       }	
      System.out.println(count); 
   }
}