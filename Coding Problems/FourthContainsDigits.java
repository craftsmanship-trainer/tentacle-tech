package assignmenttt;

public class FourthContainsDigits {
	
	public static  boolean  digits(String str) {
		  
		  
		  for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
		
		

	}
	public static void main(String[] args) {
		String str = "Mk@2806";
		if (digits(str)) {
			System.out.println("contains only digits");
			
		} else {
			System.out.println("there is non digits");

		}
	}

}
