package ProgramAssignments;

import java.util.Scanner;

public class Remove_Given_Char {
 
	String removeGivenChar(String str,String str1, String str2) {

		String result = str.replace(str1, str2);
		System.out.println(result);
		return result;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:");
		String str = sc.nextLine();
		System.out.println("Enter the character to remove and replace position");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		Remove_Given_Char r = new Remove_Given_Char();
		r.removeGivenChar(str,str1,str2);
	}

}
