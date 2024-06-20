import java.util.Scanner;
class Q1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Watch w = input();
        System.out.println("Watch name: " + w.getName());
        System.out.println("Colour: " + w.getColour());
        System.out.println("Price: " + w.getPrice() + " baht");
    }
    private static Watch input() {
        String name = sc.nextLine();
        String colour = sc.nextLine();
        int price = Integer.parseInt(sc.nextLine());
        return new Watch(name, colour, price);
    }
    }