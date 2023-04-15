package mathProb;

public class Statistics {
	
	 void calcSumAndCountAllNumbersDivBy_2_Or_7(int n) {
	 
		 int sum =0;
		 int count =0;
		 for(int i=1;i<n;i++) 
		 {
			 if(i%2 == 0) 
			 {
				 sum = sum + i;
				 System.out.println("divisible by 2 is: "+ i+ " ");
				 count++;
			 }
		 }
			 for(int j=1;j<n;j++)
			 {
				 if(j%7==0) 
				 {
					 sum = sum+j;
				 System.out.println("divisible by 7 is: "+ j+ " ");
				 count++;
				 }
			 }
			 
			 System.out.println("Sum value is: "+sum + " ");
			 
		 System.out.println("count value is: "+count);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statistics st = new Statistics();
		st.calcSumAndCountAllNumbersDivBy_2_Or_7(8);
	}
}