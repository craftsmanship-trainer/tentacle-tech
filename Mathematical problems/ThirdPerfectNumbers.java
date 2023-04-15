package assignment2;
import java.util.ArrayList;
import java.util.List;

public class ThirdPerfectNumbers {
	

	

	    public static List<Integer> calcPerfectNumbers(int max) {
	        List<Integer> perfectNumbers = new ArrayList<>();
	        
	        for (int i = 1; i <= max; i++) {
	            int sum = 0;
	            
	            for (int j = 1; j <i; j++) {
	                if (i % j == 0) {//2%2=0
	                    sum = sum + j;//0+ 2= 2
	                }
	            }
	            
	            if (sum == i) {
	                perfectNumbers.add(i);
	            }
	        }
	        
	        return perfectNumbers;
	    }

	    public static void main(String[] args) {
	        List<Integer> perfectNumbers = calcPerfectNumbers(1000);
	        System.out.println(perfectNumbers);
	    }
	}


