package org.ten;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicate {
  public static void main(String[] args) {
	String sr = "karappakkam";
	int l = sr.length();
	String s="";
	 char[] c = sr.toCharArray();
	Map<Character,Integer> rj= new LinkedHashMap<>();
	for (int i = 0; i < l; i++) {
		
		if (rj.containsKey(c[i])) {
			
		}else {
			rj.put(c[i],1);
		}
		
	}
	Set<Entry<Character, Integer>> en = rj.entrySet();
	for (Entry<Character, Integer> e : en) {
		s=s+e.getKey();
	}
	System.out.println(s);
}
}
