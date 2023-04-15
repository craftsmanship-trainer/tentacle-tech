package ProgramAssignments;

import java.util.Scanner;

public class Count_Duplicate_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Name:");
		String str = sc.next();
		
		char arr[] = str.toCharArray();
		char duplicate = arr[0];
		System.out.print("Duplicate Characters are: ");
		int Count =0;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j]) 
				{
					duplicate = arr[i];
					System.out.print(duplicate+" ");
					Count++;
				}
			}
		}
		System.out.println();
		System.out.println("Duplicate Count is: " + Count);
	}
		
}

