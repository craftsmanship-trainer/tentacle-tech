package assignmenttt;

public class SixthOccurenceoofCertainCharacters {
	
	

	public static int method1(String s,char c) {
        
        int answer=0;
       
        for (int i = 0; i < s.length(); i++) {
        	
        	if (s.charAt(i)==c) {
        		//System.out.println(c);
        	answer++;	
			}
        	
		}
		return answer;
		
        
	}
	public static void main(String[] args) {
		
		String s = "Mkabelan";
		char c = 'z';
		System.out.println(method1(s,c));
		
	}
	

}
