package kanmaniAssingment;
public class Countingaccurance6 {
    public static void main(String[] args) {
        String str = "This is a sample string";
        char searchChar = 's';
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == searchChar){
                count++;
            }
        }
        System.out.println("Number of occurrences of "+searchChar+" in the string is: "+count);
    }
}