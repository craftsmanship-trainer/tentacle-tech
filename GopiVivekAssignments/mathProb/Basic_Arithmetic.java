package mathProb;

public class Basic_Arithmetic {
	
	int calC(final int n,int m) {
		
		int modulus = (n*m/2)%7;
		System.out.println("Final Result Is " + modulus);
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic_Arithmetic arith1 = new Basic_Arithmetic();
		arith1.calC(6,7);
		Basic_Arithmetic arith2 = new Basic_Arithmetic();
		arith2.calC(3,4);
		Basic_Arithmetic arith3 = new Basic_Arithmetic();
		arith3.calC(5,5);
	}

}
