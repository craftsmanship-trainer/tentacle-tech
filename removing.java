package Assignment;
public class removing {
    public static void main(String[] args) {
        String str = "hello all";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(c) < 0) {
                result += c;
            }
        }
        
        System.out.println(result);	
    }
}