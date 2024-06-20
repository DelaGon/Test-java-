import java.util.*;
public class Lab3Task2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] num = new int[100];
    int a=0;
    num[0]= Integer.parseInt(args[0]);
    num[1]= Integer.parseInt(args[1]);
    num[2]= Integer.parseInt(args[2]);
    num[3]= Integer.parseInt(args[3]);
    num[4]= Integer.parseInt(args[4]);
    if (args.length >5 ){
        System.out.println("Max input");

    }else{
        for (int i=0;i<args.length ;i++ ) {
            if (num[i]>a) {
                a=num[i];
            }
        }
        System.out.println(a);
    }
    
}
}