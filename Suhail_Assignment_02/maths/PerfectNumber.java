package org.karapakkam;


import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
   static List<Integer>calcPerfectNumbers(int num){
	  
  
	List<Integer> l = new ArrayList<>(); 

	    for (int i = 1; i <=num; i++) {
			 int sum=0; 
			 for (int j = 1; j <i; j++) {
				if (i%j==0) {
					sum =sum+j;
				}
			}
			 if (sum==i) {
				l.add(i);
			}
			 sum=0;
		}return l;
	   
}
   public static void main(String[] args) {
	   List<Integer> u = calcPerfectNumbers(10000);
	   System.out.println(u);
}
}