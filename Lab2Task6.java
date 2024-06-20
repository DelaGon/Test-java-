import java.util.*;
public class Lab2Task6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
  int n = sc.nextInt(); 
  for(int i=0;i<n-1;i++){ 
  for(int j=0; j<n-1; j++){
    System.out.print(" ");
}
    System.out.println("*");
}
   for(int i=0;i<n*2-1;i++){
    System.out.print("*");
}
    System.out.println(); 
   for(int i=0;i<n-1;i++) { 
   for(int j=0; j<n-1; j++){
    System.out.print(" ");
}
    System.out.println("*");
}
}
}