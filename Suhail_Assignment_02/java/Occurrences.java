package org.ten;

import java.util.Scanner;

public class Occurrences {
  public static void main(String[] args) {
	String s="karapakkam";
	int l = s.length();
	int count=0;
	Scanner k= new Scanner(System.in);
	char c = k.next().charAt(0);
	for (int i = 0; i < l; i++) {
		char d = s.charAt(i);
		if (c==d) {
			count++;
		}
	}
		if (count>1) {
			System.out.println(count);
		}
		 
	}
	
}

