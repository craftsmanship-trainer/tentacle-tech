package kanmaniAssingment;
public class Palindrom11 {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = true;
        int strLength = str.length();

        for (int i = 0; i < strLength / 2; i++) {
            if (str.charAt(i) != str.charAt(strLength - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }
}