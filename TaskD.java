import java.util.Scanner;
class TaskD{
    public static void main(String[] args) {
        String[] ws = inputString();
        word(ws);
    }
    private static String[] inputString() {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] rs = ip.split(",");
        return rs;
    }
    public static void word(String[] input){
        for (int i=0;i<input.length;i++) {
            if (input[i].length() > 6) {
                System.out.println(input[i]);
            }
        }
    }
}