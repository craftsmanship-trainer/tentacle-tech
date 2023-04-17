package org.karapakkam;


import java.util.LinkedHashMap;
import java.util.Map;

public class Relatednumber {
     static Map<Integer,Integer>calcfriends(int s){
    	 Map<Integer, Integer> m= new LinkedHashMap<>();
    	 
			int total = 0;
	for (int i = 1; i < s; i++) {
		if (s%i!=0) {
			
		}else {
        System.out.println(i);
       total = total+i;
       m.put(s,total);
       
       
		}
  		}
	return m;
     }
	public static void main(String[] args) {
		 Map<Integer, Integer> p = calcfriends(284);
		System.out.println(p);
	}
	
	
}

