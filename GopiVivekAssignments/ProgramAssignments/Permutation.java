package ProgramAssignments;

public class Permutation {
	
    public static void permutation(String str1,String str2) {
		if(str2.length()==str1.length()) {
			System.out.println(str2);
			return;
		}
		for(int i=0;i<str1.length();i++) {
			permutation(str1, str2+str1.charAt(i));
		}
	}
    public static void generatePermutation(String str1) {
		System.out.println("Permuted Strings are:");
		permutation(str1, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		generatePermutation("JAVA");
		
	}
}
