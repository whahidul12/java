class Calculator {

  public int add(int a, int b) {
    int r = a + b;
    return r;
  }
}

public class Main_file {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 4;

    Calculator cal = new Calculator();
    cal.add(num1, num2);
  }
}
