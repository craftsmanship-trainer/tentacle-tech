package kanmaniAssingment;
import java.util.*;
//Non-Repeating Character
public class NonRepeatingCharacter2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String :");
	     String input = sc.next();
	     String str = input.toLowerCase();
	   	 char c = ' ';
	     
	     char[] letters = str.toCharArray();
	     
	     for(char i :letters) {
	    	 if(str.indexOf(i) == str.lastIndexOf(i)) {
	    		 c = i;
	    		 break;
	    		 }
	     }
	     if(c == ' ') {
	    	 System.out.println("Every Character is repeating");
	     }else {
	    			System.out.println("The First Non-repeating Character is: " +c);
	    			}
	     }
}
	     

	


