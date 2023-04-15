package Assignment;

public class onlydigits {

	public static void main(String[] args) {
		String txt = "code65";
		System.out.println(txt);
		System.out.println(txt.length());
		System.out.println("String = "+txt);
		String digit="";
		
		for (int i = 0; i < txt.length(); i++) {
			char ch = txt.charAt(i);
			if (ch >= 48 && ch <= 57) {
				digit+=ch;
			}
		}
		System.out.println(digit);
		System.out.println(digit.length());
			//System.out.println(digit);
			if (digit.length()==txt.length())
				System.out.println("String contains digits only");
			else
				System.out.println("String contains all unicode characters");
		
	}


	}


