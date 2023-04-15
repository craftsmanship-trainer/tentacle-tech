package Assignment;

public class appearances {
		
		 static final int N = 256;
		 static char MaxOccuringChar(String str1) {
		  int ctr[] = new int[N];
		  int l = str1.length();
		  for (int i = 0; i < l; i++)
		   ctr[str1.charAt(i)]++;
		  int m = -1;
		  char result = ' ';

		  for (int i = 0; i < l; i++) {
		   if (m < ctr[str1.charAt(i)]) {
		    m = ctr[str1.charAt(i)];
		    result = str1.charAt(i);
		    
		   }
		  }

		  return result;
		 }
		 public static void main(String[] args) {
		  String txt = "max appearances";
		  System.out.println("The given string is: " + txt);
		  System.out.println("Max appearances character is: " + MaxOccuringChar(txt));
		  
		 }



	}


