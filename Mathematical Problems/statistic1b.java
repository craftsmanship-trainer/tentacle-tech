package mathamaticalproblem;
public class statistic1b {
public void calcSumAndCountAllNumbersDivBy_2_Or_7(int max) {
		int count = 0;
		int sum = 0;
		
		for (int i = 2; i < max; i++) {
			if (i % 2 == 0 || i % 7 == 0) {
				count++;
				sum += i;
			}
		}
		
		System.out.println("Count: " + count + ", Sum: " + sum);
	}
	
	public int[] getSumAndCountAllNumbersDivBy_2_Or_7(int max) {
		int count = 0;
		int sum = 0;
		
		for (int i = 2; i < max; i++) {
			if (i % 2 == 0 || i % 7 == 0) {
				count++;
				sum += i;
			}
		}
		
		int[] result = {count, sum};
		return result;
	}
}