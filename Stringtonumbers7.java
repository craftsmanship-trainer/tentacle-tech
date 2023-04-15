package kanmaniAssingment;
import java.util.Scanner;
public class Stringtonumbers7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string representing a number :");
        String str = sc.nextLine();
        
        int num1 = Integer.parseInt(str);
        System.out.println("The string to int conversion is : " + num1);   
        long num2 = Long.parseLong(str);
        System.out.println("The string to long conversion is : " + num2);          
        float num3 = Float.parseFloat(str);
        System.out.println("The string to float conversion is : " + num3);          
        double num4 = Double.parseDouble(str);
        System.out.println("The string to double conversion is : " + num4);
    }
}