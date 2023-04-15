package assignmenttt;

public class ThirdReverseLetters {
	public static void main(String[] args) {
		String first = "Software Developer";
		String second = " ";
		
		String[] separate = first.split(" ");
		
		for (String k : separate) {
			String t =" ";
			for (int i = k.length()-1; i >=0; i--) {
				char ch = k.charAt(i);	
				t=t+ch;
			
				
				}
			second = second + t+ " ";//" "+ 
		}
		String[] s = second.split(" ");
		String srev = "";
		for (int i = 0; i < s.length; i++) {
			srev = s[i]+ " "+  srev;
			
		}
		System.out.println(srev);
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
