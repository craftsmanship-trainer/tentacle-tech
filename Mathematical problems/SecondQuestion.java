package assignment2;

import java.util.Scanner;

public class SecondQuestion {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
		int n = s.nextInt();
		
		if (n<0 ||n>20) {
			System.out.println("wrong input");
		}
		if (n==0) {
			System.out.println("zero");
			
		}
		else
		{//final int remainder = n%10;//11%10
		
		String[] valueAsText = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
		
		if (n<20) {
			System.out.println(valueAsText[n]);
		}
		}
		
	
		
	}
}



