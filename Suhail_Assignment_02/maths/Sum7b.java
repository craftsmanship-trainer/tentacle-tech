package org.karapakkam;

public class Sum7b {
  public static void main(String[] args) {
	  int num= 40;
	  int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		System.out.println("values=" + values.length);
		String roman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		System.out.println("roman=" + roman.length);

		String s ="";
   for (int i = 0; i < values.length; i++) {
	  while(num>=values[i]) { 
		 
		  num = num-values[i];
		  s+=(roman[i]);
		  
	  }
		}
		
	System.out.println(s);	
	
}
}
