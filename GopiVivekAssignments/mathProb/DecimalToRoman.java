package mathProb;

public class DecimalToRoman {
	
	String toRomanNumber(int n) {
		int values[] = {1000,500,100,50,10,5,1};
		String roman[] = {"M","D","C","L","X","V","I"};
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<values.length;i++) 
		{
			while(n>=values[i])
			{
				n = n-values[i];
				sb.append(roman[i]);
			}
			
		}
		System.out.println(sb.toString());
		return null;		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalToRoman Decimal = new DecimalToRoman();
		Decimal.toRomanNumber(15);
	}

}
