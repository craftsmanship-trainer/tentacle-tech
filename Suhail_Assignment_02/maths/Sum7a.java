package org.karapakkam;

public class Sum7a {
   
	   static int value(char r) {

			if (r == 'I' || r == 'i')
				return 1;
			if (r == 'V' || r == 'v')
				return 5;
			if (r == 'X' || r == 'x')
				return 10;
			if (r == 'L' || r == 'l')
				return 50;
			if (r == 'C' || r == 'c')
				return 100;
			if (r == 'D' || r == 'd')
				return 500;
			if (r == 'M' || r == 'm')
				return 1000;
			return -1;
		}

		static void roman(String a) {

			int total = 0;
			for (int i = 0; i < a.length(); i++) {
				int a1 = value(a.charAt(i));
				if (i + 1 < a.length()) {
					int a2 = value(a.charAt(i + 1));
					if (a1 <= a2)
						total -= a1;
					else
						total += a1;
				} else {
					total += a1;
				}
			}
			System.out.println(total);
		}

		public static void main(String[] args) {

			roman("md");

		}
	



}