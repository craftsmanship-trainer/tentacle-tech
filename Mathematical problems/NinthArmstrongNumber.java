package assignment2;

import java.util.ArrayList;
import java.util.List;

public class NinthArmstrongNumber {
	 public static  List<Integer> calcArmstrongNumbers() {
List<Integer> arms = new ArrayList<Integer>();
for (int x = 0; x < 10; x++) {
	for (int y = 0; y < 10; y++) {
		for (int z = 0; z < 10; z++) {
			int leftside= x*100+y*10+z;
			int rightside = x*x*x + y*y*y+z*z*z;
			
			if (leftside==rightside) {
				arms.add(leftside);
				
			}
		}
		
	}
}
return arms;

}
	 public static void main(String[] args) {
		 List<Integer> arms=calcArmstrongNumbers();
		 for (Integer num : arms) {
			 System.out.println(num);
			
		}
	}
}
