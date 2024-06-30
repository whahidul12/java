package assingment004;

import java.util.Scanner;

class Compute {
  public void compute(int price, int amount) {
    float result = (float) price / amount;
    Double RESULT = Math.ceil(result);
    System.out.println("Your Inastallment time will be " + RESULT + " months.");
  }
}

public class Solution {
  public static void main(String[] args) {
    boolean condition = true;
    int insAmout = 0;
    System.out.println("Which phone you want to buy");
    System.out.println("===============");
    System.out.println("1. Iphone 12 (1200 $)");
    System.out.println("2. Iphone 13 (1300 $)");
    System.out.println("3. Iphone 14 (1400 $)");
    System.out.println("4. Iphone 15 (1500 $)");
    System.out.println("===============");
    Scanner sc = new Scanner(System.in);
    System.out.print(">>> ");
    int input = sc.nextInt();
    System.out.println("===============");
    System.out.println("Installment Amount: ");
    System.out.println("(50) (100) (200) (300)");
    while (condition) {
      System.out.print(">>> ");
      insAmout = sc.nextInt();
      if (insAmout == 50 || insAmout == 100 || insAmout == 200 || insAmout == 300) {
        condition = false;
        break;
      }
      System.out.println("invalid Amount..Try again");
    }
    System.out.println("===============");
    sc.close();

    Compute objCompute = new Compute();

    switch (input) {
      case 1:
        objCompute.compute(1200, insAmout);
        break;
      case 2:
        objCompute.compute(1300, insAmout);
        break;
      case 3:
        objCompute.compute(1400, insAmout);
        break;
      case 4:
        objCompute.compute(1500, insAmout);
        break;

      default:
        System.out.println("somrthing Worng...");
        break;
    }

  }
}
