package kanmaniAssingment;
public class Appearances14 {
    public static void main(String[] args) {
        String str = "This is a string with multiple characters";

        char mostAppeared = findMostAppeared(str);

        System.out.println("The character with the most appearances is: " + mostAppeared);
    }

    public static char findMostAppeared(String str) {
        int[] count = new int[256];
        int max = 0;
        char mostAppeared = ' ';
        for (char c : str.toCharArray()) {
            count[c]++;
            if (count[c] > max) {
                max = count[c];
                mostAppeared = c;
            }
        }

        return mostAppeared;
    }
}
