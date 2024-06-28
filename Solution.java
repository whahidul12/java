class MyOwnExeption extends Exception {
  public MyOwnExeption(String note) {
    super(note);
  }
}

public class Solution {
  public static void main(String[] args) {
    int x = 10;
    int y = 2;
    int z = 0;
    try {
      z = x / y;
      if (y == 2) {
        throw new MyOwnExeption("/ by default...");
      }

    } catch (MyOwnExeption e) {
      System.out.println(">>> " + e);
    }
    System.out.println(z);
  }

}
