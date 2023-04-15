package mathProb;

import java.util.Scanner;

public class Twin_Cousin_Sexy_PrimeNumbers {
	
	static int prime(int Number) {
		
		int m=0,i;
		for(i=2;i<=Number/2;i++)
		{
			if(Number%i == 0) {
				m=1;
				break;
			}
		}
		return m;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min,max;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number:");
		min = sc.nextInt();
		System.out.println("Enter last Number:");
		max =sc.nextInt();
		System.out.println("Twin Prime Numbers are: ");
		
		for(int i=min;i<=max;i++)
		{
			if(prime(i)==0 && prime(i + 2)==0)
			{
				System.out.print("("+ i + "="+(i+2)+")");
			}
		}
		System.out.println(" ");
		System.out.println("Cousin Prime Numbers are:");
		for(int i=min;i<=max;i++)
		{
			if(prime(i)==0 && prime(i + 4)==0)
			{
				System.out.print("("+ i + "="+(i+4)+")");
			}
		}
		System.out.println(" ");
		System.out.println("Sexy Prime Numbers are:");
		for(int i=min;i<=max;i++)
		{
			if(prime(i)==0 && prime(i + 6)==0)
			{
				System.out.print("("+ i + "="+(i+6)+")");
			}
		}
		
		int Number =min;
		Twin_Cousin_Sexy_PrimeNumbers tcsPrime= new Twin_Cousin_Sexy_PrimeNumbers();
		tcsPrime.prime(Number);	
		
	}

}
