package kanmaniAssingment;
public class Removingduplicatecharector12 {
	public static void main(String[] args) {
		String str = "aabbccddee";
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(!result.contains(String.valueOf(str.charAt(i)))) {
				result += String.valueOf(str.charAt(i)); 
			}
		}
		
		System.out.println("Input String: "+str);
		System.out.println("Modified String: "+result);
	}
}