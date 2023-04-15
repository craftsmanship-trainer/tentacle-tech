package assignmenttt;

public class SeventhConvertaString {
	public static void main(String[] args) {
		
	
	
         String  numint = "2342";
         String numdouble= "8897536754321789d";
         String  numfloat= "8976565f";
	     String  numlong = "89719845637345"; 
	     
	     double d = Double.parseDouble(numint);
	   System.out.println(d);
	   
	   float f = Float.parseFloat(numfloat);
	   System.out.println(f);
	   
	   int i = Integer.parseInt(numint);
	   System.out.println(i);
	   
	   long l = Long.parseLong(numlong);
	   System.out.println(l);
	    
}
}