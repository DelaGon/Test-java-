import java.util.Scanner;
public class Lab3Task7
{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);    
        String x ="";
        while(true){
            x+=","+in.nextLine();
            if (x.contains("*")) {
                break;
            }
        }
        String [] pond = x.split(",");
        for (int i =0;i<pond.length ;i++ ) {
            if (i==pond.length/2) {
                if (pond.length%2==0) {
                    System.out.println(pond[i-1]);
                }
                System.out.println(pond[i]);
            }
        }
        
    }
}