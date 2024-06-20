class Lab5Task4
{
    public static void main(String[] args) 
    {
        Fraction f1 = new Fraction(3,6);
        System.out.println(f1.toString()+" = "+f1.toDouble());
        f1.simplify();
        System.out.println(f1.toString()+" = "+f1.toDouble());
    }
}