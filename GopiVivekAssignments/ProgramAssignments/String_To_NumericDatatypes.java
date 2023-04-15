package ProgramAssignments;

public class String_To_NumericDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Intval="1998",Floatval="26.876F";
	String LongVal="7550186686",DoubleVal="15.3420789651";
	
	Integer valueOfInt = Integer.valueOf(Intval);	
	int parseInt = Integer.parseInt(Intval);
	
	System.out.println(valueOfInt);
	System.out.println(parseInt);
	
	Float valueOfFloat = Float.valueOf(Floatval);
	float parseFloat = Float.parseFloat(Floatval);
	
	System.out.println(valueOfFloat);
	System.out.println(parseFloat);
	
	Long valueOfLong = Long.valueOf(LongVal);
	long parseLong = Long.parseLong(LongVal);
		
	System.out.println(valueOfLong);
	System.out.println(parseLong); 
	
	Double valueOfDouble = Double.valueOf(DoubleVal);
	double parseDouble = Double.parseDouble(DoubleVal);
		
	System.out.println(valueOfDouble);
	System.out.println(parseDouble);
	}

}
