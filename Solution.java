public class Solution {
  public static void main(String[] args) throws ArithmeticException {
    System.out.println("****************************");
    try {
      int x = 10;
      int y = 0;
      int z = x / y;
      throw new ArithmeticException("in throw...");

    } catch (ArithmeticException e) {
      System.out.println(">>> " + e);
    }
    System.out.println("****************************");
  }

}
