 package org.ten;

public class Vowelscount {
   public static void main(String[] args) {
	 String a="mohammedsuhail";
	 int count=0;
	 for (int i = 0; i < a.length(); i++) {
	   char c=a.charAt(i); 	
	   switch(c) {
	   case'a':
	   case'e':
	   case'i':
	   case'o':
	   case'u': 
		   count++;
	   break;
	}
}
	 System.out.println("count of vowels="+count);
	 int consonate=a.length()-count;
	 System.out.println("consonats count is="+consonate);
}
}