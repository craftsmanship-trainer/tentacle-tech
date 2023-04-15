 package assignmenttt;

public class TwelthRemoveDuplicates {
	
	public  static void duplicateString(String str1) {
        
       String str2 = "";
        
        
        int length = str1.length();
        
        for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			
			if (str2.indexOf(c)<0) {
				
				str2= str2+c;
				
			}
		}
        System.out.println(str2);
      
	}
	public static void main(String[] args) {
		
		String str1= "Mkabelan";
		duplicateString(str1);
		
		
		  
	}

		}
	