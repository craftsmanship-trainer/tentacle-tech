package org.ten;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Count {
	public static void main(String[] args) {
		   String s = "coca cola";
		   Map<Character,Integer> sp= new HashMap<>();
		    int l = s.length();  
		    
		    for (int i = 0; i < l; i++) {
				char c = s.charAt(i);
				if (sp.containsKey(c)) {
					sp.put(c,sp.get(c)+1);
				}else {
					sp.put(c,1);
			
				}
		    }
			Set<Entry<Character, Integer>> e= sp.entrySet();
			for (Entry<Character, Integer> en : e) {
				Integer value = en.getValue();
				if (value>1) {
					System.out.println("key:"+en.getKey()+",value:"+en.getValue());
				}
			}
		    }
		    
				
				
			}
		    
		    
		

   