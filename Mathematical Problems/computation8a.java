package mathamaticalproblem;
//Reduce the running time of O(n3) to O(n2).
public class Combinations {
  public static void main(String[] args) {
      int a, b, c;
      for (a = 1; a < 10; a++) {
          for (b = 1; b < 10; b++) {
              c = (int)Math.sqrt(a * a + b * b);
              if (a * a + b * b == c * c) {
                  System.out.println("a = " + a + " b = " + b + " c = " + c);
              }
          }
      }
  }
}
