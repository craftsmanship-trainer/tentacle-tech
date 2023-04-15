package assignment2;

public class SeventhARomantoDecimal{
	public static int input(char v) {
		if (v == 'I')
		return 1;
		if(v=='V')
		return 5; 
		if(v=='X')
		return 10;
		if(v=='L')
		return 50;
		if(v=='C')
		return 100;
		if(v=='D')
		return 500;
		if(v=='M')
		return 1000;
		return 0;
		}
		public  static int output(String s) {
		int t = 0;
		for (int i = 0; i < s.length(); i++) {
		int s1= s.charAt(i);
		if( s1>= s.length())
		{
		int s2= input(s.charAt(i+1));
		if (s1 >= s2) {
		t=t+s1;
		}
		else
		t=t-s1;
		}
		else {
		t=t+s1;
		}
		}
		return t;
		}
		
public static void main(String[] args) {
	SeventhARomantoDecimal num = new SeventhARomantoDecimal();
      String s = "V";
      System.out.println(num.output(s));
}

}



