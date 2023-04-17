package org.ten;

public class MostAppearance {
  public static void main(String[] args) {
	String rp = "MOHAMMED";
	int mos[] = new int [rp.length()];
	
	char mc = rp.charAt(0);
	int i, j, sr;
	char[] cs = rp.toCharArray();
	for ( i = 0; i < cs.length; i++) {
		mos[i]=1;
		for ( j = i; j < cs.length; j++) {
			if (cs[i]==cs[j]) {
				mos[i]++;
				cs[j]=0;
			}
		}
	}
	
	sr=mos[0];
	for ( i = 0; i < cs.length; i++) {
		if (sr<mos[i]) {
			sr=mos[i];
		   mc=cs[i];
		}
	}
	System.out.println(mc);
}
}

