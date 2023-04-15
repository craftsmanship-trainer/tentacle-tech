package mathProb;

import java.util.List;
import java.util.Scanner;

public class Armstrong_Number {
	
	List<Integer> calcArmstrongNumbers(int Input){
		 int Output = Input;
		 int result=0; int remainder;
		 while(Output !=0)
		 {
			 remainder = Output%10;
			 result = (int) (result + Math.pow(remainder,3));
			 Output = Output/10;
		 }
		 if(result == Input)
		 {
			 System.out.println(Input + " = " + result);
			 System.out.println(Input + " Is an Armstrong Number");
		 }
		 
		return null;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input Number:");
		int Input = scan.nextInt();
		System.out.println("Input is Equal to Output:");
		
		Armstrong_Number armstrong = new Armstrong_Number();
		armstrong.calcArmstrongNumbers(Input);
	}

}
