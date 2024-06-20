import java.util.Scanner;

class Py{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String text, p = ",.?!";
    int word = 0, punc = 0;
    while(true){
      text = input.nextLine();
      if (text.equals("***")) { break; }
      String[] arr = text.split(" ");
      for ( String w : arr ) {
        word += 1;
        for ( char letter : w.toCharArray() ) {
          if (p.indexOf(letter) != -1) {
            punc += 1;
          }
        }
      }    
    }
    System.out.println(word + " words");
    System.out.println(punc + " punctuation mark");
  }
}