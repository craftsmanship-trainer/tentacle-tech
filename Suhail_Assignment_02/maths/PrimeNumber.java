package org.karapakkam;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
  static  List<Integer>CalcPrimesupto(int num){
  
	List<Integer>l= new ArrayList<>();
	for (int j = 0; j < num; j++) {
	int count=0;	
	
	for (int i = 2; i <=i/2; i++) {
		if (j%i==0) {
			count++;
		}
	}
	if (count==0) {
		l.add(j);
	}
	
	}return l;
	
  
  }	
  public static void main(String[] args) {
    List<Integer> primes = CalcPrimesupto(100);
    System.out.println(primes);


  }




}