package mathamaticalproblem;
public class OddorEvennumber1c {
 
    public static boolean isEven(int n) {
	        if (n % 2 == 0) {
	            return true;
	        }
	        return false;
	    }
	 
	    public static boolean isOdd(int n) {
	        if (n % 2 == 0) {
	            return false;
	        }
	        return true;
	    }
	 
	    public static void main(String[] args) {
	        int number = 12;
	        boolean even = isEven(number);
	        boolean odd = isOdd(number);
	        if(odd == true){
	        	System.out.println("The Number " + number + " is odd number");
	        }
	        else{
	        	System.out.println("The Number " + number + " is even number");
	        }
	    }
	}