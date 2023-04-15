package ProgramAssignments;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Polindrome String Name:");
		String str = sc.nextLine();
		String str1 ="";
		int n = str.length();
		for(int i=n-1;i>=0;i--) {
			str1 =str1+str.charAt(i);
		}
		System.out.println("Reversed Polindrome String: "+str1);
		
			if(str.equalsIgnoreCase(str1)) {
				System.out.println("String Is Polindrome");
			}
			else {
				System.out.println("String Is Not Polindrome");
			}
	}

}
