package mathamaticalproblem;
public class ArithmeticOperaion1a {

    public static int calc(int m, int n) {
        int result = (m * n / 2) % 7;
        return result;
    }

    public static void main(String[] args) {
        int m = 6;
        int n = 7;
        System.out.println(calc(m, n));
    }
}