import java.util.*;
public class Lab3Task1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num []= new int[100];
     int a =0;
     do{
        int x =sc.nextInt();
        if (x==0) {
            break;
        }
        num[a]= x;
        a++;
     }while(true);
     for (int i = a-1;i>=0 ;i-- ) {
         System.out.println(num[i]);
     }
     
 }
}

 