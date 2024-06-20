import java.util.Scanner;
class Lab2Task3{

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
int s = sc.nextInt();
int tw,ten,five,two,one,money=0;
money = sc.nextInt();
int  p= money-s;
int r=0;

tw = p/20;
r = p%20;

ten = r/10;
r = r%10;

five= r/5;
r = r%5;

two = r/2;
r = r%2;
one=r;

System.out.println(tw+","+ten+","+five+","+two+","+one);
}
}