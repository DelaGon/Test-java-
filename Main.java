import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int word = 0, punc = 0;
    String p = ".,!?";
    while(true){
      String text = input.nextLine();
      if (text.equals("***")) { break; }
      String[] arr = text.split(" ");
      for ( String w : arr ) {
        for ( char letter : w.toCharArray() ) {
          if (p.indexOf(letter) == -1) {
            word += 1;
            break;
          }
        }
        for ( char letter : w.toCharArray() ) {
          if (p.indexOf(letter) != -1) {
            punc += 1;
          }
        }
      }    
    }
    if (word>1) {
      System.out.println(word + " words");
    } else {
      System.out.println(word + " word");
    }
    if (punc>1){
      System.out.println(punc + " punctuation marks");
    } else {
      System.out.println(punc + " punctuation mark");
    }
  }
}