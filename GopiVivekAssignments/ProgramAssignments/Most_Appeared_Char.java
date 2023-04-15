package ProgramAssignments;

import java.util.Scanner;

public class Most_Appeared_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Name:");
		String str = sc.next();
		
		char result=' ';
		int max =0;
		int n=str.length();
		int count[] = new int[256];
		for (int i=0;i<n;i++)
		{
			count[str.charAt(i)]++;
		
				if (count[str.charAt(i)] > max)
					{
			            max = count[str.charAt(i)];
			            result = str.charAt(i);
					}
		
		}
		System.out.println(result);
		
	}

}
