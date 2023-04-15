package assignment2;

public class SixthQuestion {
	 
    public static void main(String args[])
    {
    	int num = 11111;
		int value = 0;
		int cal = 0;
		int i = 1;
		int rem;

		while (num > 0) {
			rem = num % 10;//1111
			cal = cal + rem * i;//1111
			
			value = value + cal;//1111
		   num = num / 10;	//111
			rem = 0;
			i++;
		}

		System.out.println(value % 10);

	}
 
        
} 


