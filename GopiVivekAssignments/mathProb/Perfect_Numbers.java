package mathProb;

import java.util.List;
import java.util.Scanner;

public class Perfect_Numbers {

	List<Integer> calcPerfectNumbers(int min,int max){
		int n,sum;
		System.out.println("Divisors of 10000 are:");
		for(n=min;n<=max;n++) 
		{
			sum=0;
			for(int i=1;i<=n/2;i++)
			{
				if(n%i == 0)
				{
					sum =sum+i;	
				}
			}
				if(sum == n) 
				{
					System.out.println(n+"");
				}
		}
		return null;	
    }
  	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Min value:");
        int min = sc.nextInt();
        System.out.println("Enter Max value:");
        int max = sc.nextInt();
        Perfect_Numbers perf = new Perfect_Numbers();
        perf.calcPerfectNumbers(min,max);
	}
}
