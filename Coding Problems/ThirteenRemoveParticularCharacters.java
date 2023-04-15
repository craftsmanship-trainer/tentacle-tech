package assignmenttt;

public class ThirteenRemoveParticularCharacters {

	
	public static String removeChar(String str, char ch) {
      
      String s="";
		for (int i = 0; i < str.length() ;i++) {
			char c = str.charAt(i);
			
			if (c != ch) {
			s=s+c;
			}
		}
		return s;
		
		}
	public static void main(String[] args) {
		String str = "Mkabelan";
		char ch = 'e';
		
		String z = removeChar(str,ch);
		
		System.out.println(z);
	}

}    
		
	
