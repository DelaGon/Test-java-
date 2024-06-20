import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;
class TaskC {

    public static void main(String[] args) {
        String[] words = inputStringArray();
        boolean result = longWord(words);
        System.out.println(result);
    }

    public static String[] inputStringArray() {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] words = input.split(",");
        return words;
    }
    public static boolean longWord(String[] words){
        if (Arrays.stream(words).distinct().count() == 1 ) {
            return true;
        }
        return false;
    }
}