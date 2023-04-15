package mathamaticalproblem;
//To reduce the running time of O(n4) to O(n3)
public class Computation8b {
 
    public static void main(String[] args) {
        // Initialize variables
        int a, b, c, d;
 
        for (a = 1; a < 10; a++) {
            for (b = 1; b < 10; b++) {
                for (c = 1; c < 10; c++) {
                    // Calculate d using the formula
                    d = (int) Math.sqrt(a * a + b * b - c * c);
                    // Check if d is valid
                    if ((d * d == a * a + b * b - c * c) && (d > 0 && d < 10)) {
                        System.out.println("(" + a + ", " + b + ", " + c + ", " + d + ")");
                    }
                }
            }
        }
    }
}
