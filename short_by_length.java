package Assignment;
import java.util.Arrays;

public class short_by_length {
public static void main(String[] args) {
		
		String f[]= {"apple", "watermelon", "orange", "banana", "mango"};
		
		System.out.println(Arrays.toString(f));
		
		for (int i = 0; i < f.length; i++) {
			for (int j = i+1; j < f.length; j++) {
				if(f[i].length()>f[j].length()) {
					String temp = f[i];
					f[i] = f[j];
					f[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(f));		
	}
}

