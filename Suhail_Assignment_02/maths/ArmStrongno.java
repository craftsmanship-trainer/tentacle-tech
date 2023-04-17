package org.karapakkam;

import java.util.ArrayList;
import java.util.List;


public class ArmStrongno {
      static List<Integer>calArmstrongNumber(){
	  int arm=0;
	  
	  
	  ArrayList<Integer>l= new ArrayList<>();
	for (int i = 1; i <= 1000; i++) {
		int temp=i;
	
	while (temp>0) {
		int n=temp%10;
		arm=arm+(n*n*n);
		temp/=10;
	}
	if (arm==i) 
		l.add(i);
		arm=0;
	}
	
	return l;
	
	
}
      public static void main(String[] args) {
		List<Integer> armstrong=calArmstrongNumber();
		System.out.println(armstrong);
	}
}
