package ProgramAssignments;

import java.util.Scanner;

public class Reverse_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String To Reverse:");
		String str = sc.nextLine();
		String reverse="";
	
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.print("Reversed String: "+reverse+"");
	}

}
