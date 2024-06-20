import java.util.Scanner;
public class Lab3Task2f{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number[] = new int[100];
        
   for (int i = 0; i < 5; i++){
        number[i] = Integer.parseInt(args[i]);
    }
    if (args.length>5) {
        System.out.println("Max input");
        
    }else{
        
    int  max = number[0];
    for (int j = 0; j < args.length; j++){
        if (number[j] > max){
        max = number[j];
        }
    }
    System.out.println(max);
}
}
}
