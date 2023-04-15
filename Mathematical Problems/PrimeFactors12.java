import java.util.*;
public class PrimeFactors {
   public static List<Integer> calcPrimeFactors(int n) {
      List<Integer> primeFactors = new ArrayList<>();
      while (n % 2 == 0) {
         primeFactors.add(2);
         n /= 2;
      }
      for (int i = 3; i <= Math.sqrt(n); i += 2) {
         while (n % i == 0) {
            primeFactors.add(i);
            n /= i;
         }
      }
      if (n > 2) {
         primeFactors.add(n);
      }
      return primeFactors;
   }

   public static void main(String[] args) {
	   int number;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number :");
     number =sc.nextInt();
      System.out.printf("Prime factors of %d are: %s", number, calcPrimeFactors(number));
   }
}
