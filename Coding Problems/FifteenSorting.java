package assignmenttt;

import java.util.Arrays;

public class FifteenSorting {
	public static void main(String[] args) {
		
		String[] places   =  {"chennai", "madurai", "villuppuram", "Gingee", "trichy"};
		
		for (int i = 0; i < places.length; i++) {
			for (int j = i + 1; j < places.length; j++) {
				
				if (places[i].length()>places[j].length()) {
					String max = places[i];
					places[i]= places[j];
					places[j]=max;
					
					
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(places));
	}

}
