package assingment003;

import java.util.Scanner;

public class Product {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int roll = scanner.nextInt();
    String name = scanner.nextLine();

    System.out.println(name + " : " + roll + " ");
    scanner.close();

  }
}
