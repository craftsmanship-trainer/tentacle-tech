package mathProb;

import java.util.List;
import java.util.Scanner;

public class Prime_Factorization {

	List<Integer> calcPrimeFactors(int input){
		for(int i=2;i<input;i++) {
			while(input%i == 0)
			{
				System.out.print(i+" ");
				input = input/i;
			}
		}
		if(input >2)
		{
			System.out.println(input);
		}
		return null;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Input Number:");
		input = sc.nextInt();
		System.out.println("Prime Factorization numbers are:");
		Prime_Factorization primefact = new Prime_Factorization();
		primefact.calcPrimeFactors(input); 
		
	}

}
