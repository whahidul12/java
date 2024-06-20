import java.util.Scanner;

class Cal {
  public int add(int a, int b) {
    int r = a + b;
    return r;
  }
}

public class Demo {
  public static void main(String[] args) {
    System.out.println("***********************\n");
    System.out.println("1. log in\n");
    System.out.println("2. Diposit\n");
    System.out.println("3. Withdraw\n");
    System.out.println("4. log out\n");
    System.out.println("***********************\n\n");
    System.out.println(">>>\n");
  }

  Scanner sc = new Scanner(System.in);
  int input = sc.nextInt();sc.close();switch(input)
  {
    case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
    default:
    System.out.println("withdraw\n");
      // code block
  }

}
