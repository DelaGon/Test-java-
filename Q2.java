import java.util.Scanner;
public class Q2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Watch w = input();System.out.println(w.toString());
    }
    private static Watch input() {
        String name = sc.nextLine();
        String colour = sc.nextLine();
        int price = Integer.parseInt(sc.nextLine());
        return new Watch(name, colour, price);
    }
    
}
