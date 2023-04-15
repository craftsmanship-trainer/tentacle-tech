package ProgramAssignments;

public class Vowels_and_consonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Elon musk walking with 1 umbrella";
		int vow = 0,con = 0,digits = 0,spaces = 0;
		 String line = sentence.toLowerCase();
		 
		    for (int i = 0; i < line.length(); ++i) {
		        char ch = line.charAt(i);
		        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		        {
		          ++vow;
		        }

		        else if ((ch >= 'a' && ch <= 'z')) {
		          ++con;
		        }
		        
		      }

		      System.out.println("Vowels: " + vow);
		      System.out.println("Consonants: " + con);

	}

}
