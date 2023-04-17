package org.karapakkam;

public class Sum1b {
     private void calcAndCountAllNumberDivby_2_or_7() {
     int num =15;
     int count =0;
     int sum=0;
  for (int i = 2; i < num; i++) {
	if (i%2==0) {
		System.out.println("divisible by 2="+i);
		sum+=i;
		count++;
	}
	
	if (i%7==0) {
		System.out.println("divisible by 7="+i);
		sum+=i;
		count++;
	}
}
  System.out.println("count is="+count);
  System.out.println("sum is="+sum);
	}
     public static void main(String[] args) {
		Sum1b s= new Sum1b();
		s.calcAndCountAllNumberDivby_2_or_7();
	}
}
