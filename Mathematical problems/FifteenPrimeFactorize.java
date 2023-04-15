package assignment2;

import java.util.ArrayList;
import java.util.List;

public class FifteenPrimeFactorize {
public static List<Integer> calcPrimeFactors(int n) {
	List<Integer> FifteenPrimeFactorize = new ArrayList<>();
	int even = 2;
	
	while (n<1) {
		if (n%even==0) {
			FifteenPrimeFactorize.add(even);
			n = n/even;
			
		} else {
			even++;

		}
	}
	return FifteenPrimeFactorize;
	

}
public static void main(String[] args) {
	int n = 8;
	FifteenPrimeFactorize k = new FifteenPrimeFactorize();

	k.calcPrimeFactors(8);
	System.out.println(k);
	
}
}
