import java.util.Scanner;
public class R1wc{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a ="";
    
    while (true){
           a = a+ sc.nextLine()+"\n";
           if (a.contains("***")) 
           {
            break;
           }
       }
               
           int n = a.length();
           char k =' ';
           int sum =1;
           for(int j =0;j<n;j++){
            if (a.charAt(j)==k) {
                sum =sum+1;
            }
           }
           System.out.println(sum+" word");
           
           int c =0;
           for (int i=0;i<a.length() ;i++ ) {
               if (a.charAt(i)==','||a.charAt(i)=='.'||a.charAt(i)=='?'||a.charAt(i)=='!') {
                   c++;
               }

               }
               System.out.println(c+" punctuation mark");
               

    }
}
