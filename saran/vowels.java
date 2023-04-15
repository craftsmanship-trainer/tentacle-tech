package Assignment;

public class vowels {

	public static void main(String[] args) {
		String txt = "vowels";
        txt = txt.toLowerCase();
        int count = 0;
        
 
        for (int i = 0; i < txt.length(); i++) 	
        {
        	if (txt.charAt(i) == 'a' 
        		|| txt.charAt(i) == 'e'
                || txt.charAt(i) == 'i'
                || txt.charAt(i) == 'o'
                || txt.charAt(i) == 'u') 
        	
                count++;
        	
                
        }
        int value = txt.length()-count++;
 
        
        System.out.println("Given string: " + txt);
        System.out.println("Total no of vowels in string are: "+count);
        System.out.println("not vowels count: "+ value);
        
   
    }

}


