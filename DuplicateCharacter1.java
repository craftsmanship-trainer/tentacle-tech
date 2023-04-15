package kanmaniAssingment;
import java.util.*;

public class DuplicateCharacter1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		//Duplicate Characters in the String
	    System.out.println("Enter the String :");
		String str = sc.next();
		int count;
		
		char[] letters = str.toCharArray();
		int size = letters.length;
		
		for(int i = 0;i<size;i++) {
			count = 1;
			for(int j=i+1;j<size;j++) {
				if(letters[i]==letters[j] && letters[i]!= ' ') {
					count++;
				
				letters[j] = '0';
				}
			}
			if(count > 1 && letters[i]!='0') {
				System.out.println(letters[i]);
			}
		}
		
		

	}

}
