package assignment2;

public class SeventhBDecimaltoRoman {
	
public static String  toRomanNumber(int givennumber) {
	if (givennumber<1 ) 
		System.out.println("check your number");
		String t = " ";
	
		while (givennumber >=1000) {
			t  = t+ "M";
			givennumber = givennumber-1000;
		}	
		while (givennumber >=900) {
				t  = t+ "CM";
				givennumber = givennumber-900;
		}		
		while (givennumber >=500) {
					t  = t+ "D";
					givennumber = givennumber-500;
		}	
					
		while (givennumber >=400) {
						t  = t+ "CD";
						givennumber = givennumber-400;
		}				
						
		while (givennumber >=100) {
				t  = t+ "C";
			givennumber = givennumber-100;
			
		}
			while (givennumber >=90) {
				t  = t+ "XC";
				givennumber = givennumber-90;
			}
	       while (givennumber >=50) {
			t  = t+ "L";
			givennumber = givennumber-50;
	}
    while (givennumber >= 40) {
        t =t + "XL";
        givennumber =givennumber- 40;
    }
    while (givennumber >= 10) {
        t =t+ "X";
        givennumber =givennumber- 10;
    }
    while (givennumber >= 9) {
        t =t + "IX";
        givennumber=givennumber -9;
    }
    while (givennumber >= 5) {
        t =t + "V";
        givennumber=givennumber- 5;
    }
    while (givennumber >= 4) {
        t  =t + "IV";
        givennumber=givennumber- 4;
    }
    while (givennumber >= 1) {
        t = t+ "I";
        givennumber =givennumber- 1;
        return t;
    }
	return t;
	
	
    
	}	
	public static void main(String[] args) {
		String r =SeventhBDecimaltoRoman.toRomanNumber(1000) ;
		System.out.println(r);
	}
}
	
	
		

	

		
