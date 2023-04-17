package org.karapakkam;

public class Sum6 {
	static int calcChecksum(String s) {
		   Integer value = Integer.valueOf(s); 
		   int n=value.intValue();
		   System.out.println(n);
		   
		   int i=1,cal=0,val=0,bal;
		   while(n>0) {
			   bal=n%10;
			   cal=cal+bal*i;
			   val+=cal;
			   n=n/10;
			   
			   i++;
			   }
		  return val%10;
		   
}
	public static void main(String[] args) {
		
		int r = calcChecksum("7271");
		System.out.println(r);
	}
}