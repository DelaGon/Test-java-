public class Lab5Task7 {
    public static void main(String [] args) {
        Fraction third = new Fraction(1, 3);
        Fraction half = new Fraction(1, 2);
        System.out.print(half.toString() + " + " + third.toString());
        Fraction result = third.multiply(half);
        System.out.println(" = " + result.toString());
    }
}
