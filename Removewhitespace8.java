package kanmaniAssingment;
public class Removewhitespace8 {
	   public static void main(String[] args) {
	      String str = "Hello Nature   this is beatyfull"+ " ";
	      str = str.replaceAll("\\s","");
	      System.out.println(str);
	   }
	}
