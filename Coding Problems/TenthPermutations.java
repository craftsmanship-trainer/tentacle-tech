package assignmenttt;

public class TenthPermutations {
	 public static void main(String[] args) {
	        String a = "xyz";
	        possibilities(a.toCharArray(), 0, a.length() - 1);
	    }

	    public static void possibilities(char[] c, int last, int first) {
	        if (last == first) {
	            System.out.println(new String(c));
	        } else {
	            for (int i = last; i <= first; i++) {
	                convert(c, last, i);
	                possibilities(c, last + 1, first);
	                convert(c, last, i);
	            }
	        }
	    }

	    public static void convert(char[] ch, int i, int j) {
	        char k = ch[i];
	        ch[i] = ch[j];
	        ch[j] = k;
	    }

 
}

