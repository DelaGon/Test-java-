import java.util.Scanner;
public class RRTT{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String messenger=sc.nextLine();
    String x = messenger.toLowerCase();
    if (x.contentEquals("mercury")){
        System.out.println("Mercury is the 1st planet fromm the Sun.");
        }if (x.contentEquals("venus")) {
        System.out.println("Venus is the 2nd planet from the Sun."); 
        }if (x.contentEquals("earth")) {
        System.out.println("Earth is the 3rd planet from the Sun.");
        }if (x.contentEquals("mars")) {
        System.out.println("Mars is the 4th planet from the Sun.");   
        }if (x.contentEquals("jupiter")) {
        System.out.println("Jupiter is the 5th planet from the Sun");    
        }if (x.contentEquals("saturn")) {
        System.out.println("Saturn is the 6th planet from the Sun.");     
        }if (x.contentEquals("uranus")) {
        System.out.println("Uranus is the 7th planet from the Sun.");     
        }if (x.contentEquals("neptune")) {
        System.out.println("Neptune is the 8th planet from the Sun.");   
        }if (x.contentEquals("pluto")) {
        System.out.println("Pluto is the 9th planet from the Sun.");   
        }
}
}
