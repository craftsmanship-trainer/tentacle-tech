package org.karapakkam;


public class Sum1 {
   void cal(int m, int a) {
	int result = (m*a/2)%7;
	System.out.println(result);
}
   public static void main(String[] args) {
	Sum1 s =new Sum1();
	s.cal(8, 7);
   }
}


