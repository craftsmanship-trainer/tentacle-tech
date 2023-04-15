package mathamaticalproblem;
import java.util.Scanner;
public class Romannumbers7b {
 public static String toRomanNumber(int number) {
        StringBuilder result = new StringBuilder();
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String :");
	     String input = sc.next();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(numerals[i]);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println("17 in Roman numerals: " + toRomanNumber(17));
        System.out.println("444 in Roman numerals: " + toRomanNumber(444));
        System.out.println("1971 in Roman numerals: " + toRomanNumber(1971));
        System.out.println("2020 in Roman numerals: " + toRomanNumber(2020));
    }

}
