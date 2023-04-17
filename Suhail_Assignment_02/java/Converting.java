package org.ten;

public class Converting {
  public static void main(String[] args) {
	String slong="9884165768";
	String s1double="17.345675678D";
	String s2int="2001";
	String s3float="21.789f";
	
	
	Integer value=Integer.valueOf(s2int);
	System.out.println(value.intValue());
	
	Float value1=Float.valueOf(s3float);
	System.out.println(value1.floatValue());
	
	Double value2=Double.valueOf(s1double);
	System.out.println(value2.doubleValue());
	
	Long value3=Long.valueOf(slong);
	System.out.println(value3.longValue());
	
	

}
}
