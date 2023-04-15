package Assignment;

public class basicCalculation {

			
			int calC(final int n,int m) {
				
				int modulus = (n*m/2)%7;
				System.out.println("The result Is " + modulus);
				return 0;
			}
			
			public static void main(String[] args) {
				
				basicCalculation sum = new basicCalculation();
				sum.calC(6,7);
				basicCalculation sum2 = new basicCalculation();
				sum2.calC(3,4);
				basicCalculation sum3 = new basicCalculation();
				sum3.calC(5,5);
			

		
	}

}
