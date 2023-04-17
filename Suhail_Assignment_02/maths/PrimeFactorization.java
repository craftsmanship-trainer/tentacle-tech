package org.karapakkam;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactorization {
	
	
     static List<Integer> calcPrimeFactors(int num){
		List<Integer>l= new ArrayList<>();
		int temp=num;
		int i=2;
		while (temp>1) {
			 if(temp%i==0) {
				System.out.print(i+",");
				temp = temp/i;
			}else {
				i++;   
			}
		}
		return l;
		
		
		
		
	}
     public static void main(String[] args) {
    	 calcPrimeFactors(14);
	}
}
