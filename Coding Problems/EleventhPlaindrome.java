package assignmenttt;

public class EleventhPlaindrome {
	public static void main(String[] args) {
		
	{
          String s = "love";
		String p =" ";
		
		for (int i= s.length()-1; i >=0; i--) {
			//System.out.println(i);
			p= p+s.charAt(i);
			//System.out.println(p);
			
		}
	
		if (p==s) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("not a palindrome");

		
		}
	}}}
	
	
