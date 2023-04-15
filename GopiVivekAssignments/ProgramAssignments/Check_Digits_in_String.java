package ProgramAssignments;

public class Check_Digits_in_String {

	public static boolean DigitsInString(String sentence, int n) {
		int count=0;
		for (int i = 0; i < n; i++) 
		{
		      if (sentence.charAt(i)<'0' || sentence.charAt(i)>'9') 
		      {
		    	  
		    	   return false;
		      }
		      count++;
		}
		System.out.println("digit count: " + count);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "2023";
		int n =sentence.length();
		System.out.println(DigitsInString(sentence, n));
		
		      
		
	}
}
