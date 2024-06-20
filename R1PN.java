import java.util.Scanner;
public class R1PN{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String messenger=sc.nextLine();

    if (messenger.equalsIgnoreCase("mercury")){
        System.out.println("Mercury is the 1st planet from the sun.");
        }if (messenger.equalsIgnoreCase("venus")) {
        System.out.println("Venus is the 2nd planet from the Sun."); 
        }if (messenger.equalsIgnoreCase("earth")) {
        System.out.println("Earth is the 3rd planet from the Sun.");
        }if (messenger.equalsIgnoreCase("mars")) {
        System.out.println("Mars is the 4th planet from the Sun.");   
        }if (messenger.equalsIgnoreCase("jupiter")) {
        System.out.println("Jupiter is the 5th planet from the Sun.");    
        }if (messenger.equalsIgnoreCase("saturn")) {
        System.out.println("Saturn is the 6th planet from the sun.");     
        }if (messenger.equalsIgnoreCase("uranus")) {
        System.out.println("Uranus is the 7th planet from the Sun.");     
        }if (messenger.equalsIgnoreCase("neptune")) {
        System.out.println("Neptune is the 8th planet from the Sun.");   
        }
        
}
}
