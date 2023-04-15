package mathProb;

public class CheckSum {
	
	int calcChecksum(String input) {
		 Integer Value = Integer.valueOf(input);
		 int n= Value.intValue();
		 System.out.println(n);
		 
		  int i,valueAdd=0,positioncal =0,sum=0;
		  for(i=1;i<n;i++)
		 {  
			 int remainder = n%10;
			 positioncal = positioncal+remainder*i;
			 valueAdd = valueAdd + positioncal;
			 n=n/10;
		 }
		return valueAdd%10;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		String input = "7271";
		CheckSum ch = new CheckSum();
		int checksum = ch.calcChecksum(input);
		System.out.println(checksum);
	}
}
