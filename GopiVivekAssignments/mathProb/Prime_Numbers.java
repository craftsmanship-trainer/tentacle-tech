package mathProb;

import java.util.List;
import java.util.Scanner;

public class Prime_Numbers {

	 List<Integer> calcPrimesUpTo(int min,int max){
		System.out.println("Prime Numbers of " +max+" are: ");
		 for(int n=min;n<=max;n++) 
		  {
			int count=0;
				for(int i=2;i<=n/2;i++)
				 {
					if(n%i == 0)
					{
						count++;
						break;
					}
				 }
					if(count == 0 && n != 1) 
					{
						System.out.print(n+" ");
					}
		  }
				 
		 return null;
	}
	
		 public static void main(String[] args) { 
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Min value:");
			 int min = sc.nextInt();
			 System.out.println("Enter Max value:");
			 int max = sc.nextInt();
		Prime_Numbers prime = new Prime_Numbers();
		prime.calcPrimesUpTo(min,max);
  }
}