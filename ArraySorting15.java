package kanmaniAssingment;
import java.util.*;
//Sorting an array of strings by length
public class ArraySort15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings: ");
		int n = sc.nextInt();
		System.out.println("Enter the strings: ");
		String[] str = new String[n];		        
		
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
		}
		for(int j=0; j<n; j++)
		{
			for(int k=j+1; k<n; k++)
			{
				if(str[j].length() > str[k].length())
				{
					String temp = str[j];
					str[j] = str[k];
					str[k] = temp;
				}
			}
		}
		System.out.println("After Sorting the Given Strings by its Length: ");
		        
		for(int m=0; m<n; m++) 
		{
			System.out.println(str[m]);
		}
		
	}
		
	}

