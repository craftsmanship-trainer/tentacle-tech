package org.ten;

public class Palindrome {
   public static void main(String[] args) {
	String m="amma";
	System.out.println(m);
	String e="";
	for (int i = 0; i < m.length(); i++) {
		e=m.charAt(i)+e;
	}
	if (e.equals(m)) {
		System.out.println("palindrome string");
		
	}else
	
	System.out.println("not a palindrome");
	}
}

