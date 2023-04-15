package ProgramAssignments;

import java.util.Scanner;

public class Non_Repeated_Char {
	
	char NonrepeatCharacter(String str) {
		
		char arr[] = str.toCharArray();
		System.out.print("First Non-Repeated Character is: ");
		for(char i:str.toCharArray()) {
		if(str.indexOf(i)== str.lastIndexOf(i)) 
				{	
					System.out.print(i);
					break;
				}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Name:");
		String str = sc.next();

		Non_Repeated_Char nrc = new Non_Repeated_Char();
		nrc.NonrepeatCharacter(str);
	}

}
