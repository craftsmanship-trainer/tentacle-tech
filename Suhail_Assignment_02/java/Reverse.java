package org.ten;

public class Reverse {
   public static void main(String[] args) {
	String s= "hi what are you doing";
	String s1="";
	String[] s2=s.split(" ");
	for (String s3 : s2) {
		String s4="";
		for (int i = s3.length()-1;i>=0; i--) {
			char c=s3.charAt(i);
			s4=s4+c;
		}
		s1=s1+s4+" ";
	}
	String[]s5=s1.split(" ");
	String s6="";
	for (int i = 0; i < s5.length; i++) {
		s6=s5[i]+" "+s6;
	}
	System.out.println(s6);
}
}
