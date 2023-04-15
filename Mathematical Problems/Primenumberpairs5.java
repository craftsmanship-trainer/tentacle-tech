package mathamaticalproblem;
public class Primenumberpairs5 {   
	  public static void main(String[] args) 
	    { 
	        int limit = 50; 
	        System.out.println("Twin primes up to " + limit + " are : "); 
	        for (int i = 3; i <= limit; i++) { 
	            if (isPrime(i) && isPrime(i + 2)) 
	                System.out.println(i + " and " + (i + 2)); 
	        } 
	        System.out.println("\nCousin primes up to " + limit + " are : "); 
	        for (int i = 3; i <= limit; i++) { 
	            if (isPrime(i) && isPrime(i + 4)) 
	                System.out.println(i + " and " + (i + 4)); 
	      } 
	        System.out.println("\nSexy primes up to " + limit + " are : "); 
	        for (int i = 3; i <= limit; i++) { 
	            if (isPrime(i) && isPrime(i + 6)) 
	                System.out.println(i + " and " + (i + 6)); 
	        } 
	    } 
	      // Function to check if a number is prime or not 
	    static boolean isPrime(int n) 
	    { 
	        // Corner case 
	        if (n <= 1) 
	            return false; 
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	        return true; 
	    } 
	}