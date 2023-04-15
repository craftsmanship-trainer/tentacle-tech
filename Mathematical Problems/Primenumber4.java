package mathamaticalproblem;
import java.util.*;

public class Primenumber4 {
	
	public static List<Integer> calcPrimesUpTo(int limit) {
		List<Integer> primes = new ArrayList<Integer>();
		
		// Initialize an array of booleans to true
		boolean[] primeChecker = new boolean[limit+1];
		for (int i=2; i<=limit; i++) {
			primeChecker[i] = true;
		}
		
		// Iterate through the array and check if each number is prime
		for (int i=2; i<=limit; i++) {
			if (primeChecker[i]) {
				primes.add(i);
				
				// Set all multiples of the prime number to false
				for (int j=i; j*i<=limit; j++) {
					primeChecker[i*j] = false;
				}
			}
		}
		
		return primes;
	}

	public static void main(String[] args) {
		System.out.println(calcPrimesUpTo(15));
		System.out.println(calcPrimesUpTo(25));
		System.out.println(calcPrimesUpTo(50));
	}
	
}

