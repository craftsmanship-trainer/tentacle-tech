package org.karapakkam;

public class Sum1c {
  	public static boolean isOdd() {
		int num =12;
		if (num%2!=0) {
			return true;
		}else {
			
		
		return false;
		}
  	}
		
		public static boolean isEven(){
			int n = 14;
			if (n%2==0) {
				return true;
			}else {
				return false;
			}
			
		}
		public static void main(String[] args) {
	boolean odd=isOdd();
	System.out.println(odd);
	boolean even =isEven();
	System.out.println(even);
		}
	
}

