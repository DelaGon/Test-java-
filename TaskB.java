import java.util.Scanner;
class TaskB {

    public static void main(String[] args) {
        String[] words = inputStringArray();
        String result = longWord(words);
        System.out.println(result);
    }

    private static String[] inputStringArray() {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] result = input.split(",");
        return result;
    }
    public static String longWord(String[] words){
    int max =6;
    String longest ="";
    for(int i=1;i<words.length;i++ ){
        if(max<words[i].length()){
           max = words[i].length();
           longest =words[i];
    }
    return longest;
    }
    
}