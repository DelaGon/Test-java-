import java.util.*;
public class Lab2Task10 {
    public static void main(String[] args) {
    String word;
    Scanner sc = new Scanner(System.in); 
    word= sc.nextLine();
    int c=0;
    int s=0;
    for (char letter: word.toCharArray() ) {
        if (letter=='C') {
            c++;
        }else if (letter=='S') {
            s++; 
        }
    }
    if (c==s) {
        System.out.println(true);
    }else{
        System.out.println(false);
    }

}
}
