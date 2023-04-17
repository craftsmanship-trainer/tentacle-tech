package org.ten;

import java.util.ArrayList;
import java.util.List;

public class Delimiter {
 
public static void main(String[] args) {
	List<String>al= new ArrayList<>();
	al.add("A");
	al.add("S");
	al.add("D");
	al.add("F");
	String delimiter="&";
	String re="",prefix="";
	for (String ms: al) {
		re+=prefix+ms;
		prefix=delimiter;
	}
	System.out.println(re);
	}
}
