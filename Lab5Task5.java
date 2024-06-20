 class Lab5Task7{
 public static void main(String[] args) {
        Fraction quarter = new Fraction(1, 4);
        Fraction result = quarter.multiply(2);
        result.simplify();
        System.out.println("2 * "+ quarter.toString() + " =" + result.toString());
      } 
}
    


