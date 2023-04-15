package ProgramAssignments;

import java.util.Scanner;

public class RemoveDuplicateChar {
	
	char removeduplicate(String str){
		
		char arr[] = str.toCharArray();
		int n = arr.length;
		String duplicate = "";
		System.out.print("Removed Duplicate Characters are: ");
		int i,j;
		for(i=0;i<n;i++) 
		{
			for(j=0;j<i;j++)
			{
				if(arr[i] == arr[j]) 
				{
					break;
				
				}
			}

				if(j==i)
				{
					duplicate =duplicate + arr[i] + " ";
				}
	   	}
			System.out.println(duplicate+" ");
		    return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		
		RemoveDuplicateChar remove = new RemoveDuplicateChar();
		remove.removeduplicate(str);
	}

}
