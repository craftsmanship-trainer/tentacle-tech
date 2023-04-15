package assignment2;

import java.util.ArrayList;
import java.util.List;

public class FourthPrimeNumbers {
	 
		public static List<Integer> calcPrimesUpTo(int max) {
			List<Integer> method1= new ArrayList<Integer>();
			int count;
			for (int i = 1; i <= max ; i++) {
			count = 0;
			for (int j = 2; j <= i/2 ; j++) {
			if (i % j == 0) {
			count++;
			}
			}
			if (count == 0) {
			System.out.println(i);
			}
			}
			return method1;
}
		public static void main(String[] args) {
			List<Integer> method1 = calcPrimesUpTo(14);
		
				
			}
		}


