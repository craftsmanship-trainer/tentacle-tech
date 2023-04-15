  package assignment2;

public class FirstB {
	public static void main(String[] args) {
		int maximumValue=8;
		   int add =0;
		   int result =0;
		   for (int i = 1; i < maximumValue; i++) {
			   if (i%2 ==0 || i%7 ==0) {
				   System.out.println(i);
				   add = add +i;
				   result++;
				
			}
			
		}
		   System.out.println("result is " +result);
		System.out.println("sum is "+ add);

			}
}
		
	


