package mathProb;

public class Even_or_Odd {
	
	boolean isEven(int n){
			if(n%2 ==0) 
				System.out.println(n +" Is An Even Number");
			else 
				System.out.println(n + " Is Not an Even Number");
				
			return false;
	}
	boolean isOdd(int n) {
		if(n%2 != 0) 
			System.out.println(n +" Is An ODD Number");
		else 
			System.out.println(n+" Is Not An ODD Number");
			
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=100;
		Even_or_Odd even_odd = new Even_or_Odd();
		even_odd.isEven(110);
		even_odd.isOdd(88);
	}

}
