package kanmaniAssingment;
//Program to Reverse Words and Letters
public class Reversingletters3 {

  public static void main(String[] args) {
      String str = "life is more beautyfull live your life";
      String[] words = str.split(" ");
      String reversedString = "";

      for (int i = words.length-1; i >= 0; i--) {
          String word = words[i]; 
          String reverseWord = "";

          for (int j = word.length()-1; j >= 0; j--) {
              reverseWord = reverseWord + word.charAt(j);
          }
          reversedString = reversedString + reverseWord + " ";
      }
      System.out.println(str);
      System.out.println(reversedString);
  }
}