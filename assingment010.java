import java.util.Scanner;

public class assingment010 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(">>> ");
    int num = sc.nextInt();
    sc.close();
    int count = 1;
    for (int i = 2; i <= num; i++) {
      count *= i;
    }
    System.out.println(">>> " + count);
  }
}
