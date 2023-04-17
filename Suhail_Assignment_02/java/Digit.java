package org.ten;

public class Digit {
   public static void main(String[] args) {
	String s1="suhail0223";
	String digit="";
	for (int i = 0; i < args.length; i++) {
		char c=s1.charAt(i);
		if (c>=48 && c<=57) {
			digit+=c;
		}
		
	}
	if (digit.length()==s1.length()) {
	System.out.println("strin contains digits only");	
	}else {
		System.out.println("string contains all word");
	}
}
}
