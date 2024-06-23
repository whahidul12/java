class A {
  public A() {
    System.out.println("in A");
  }

  public A(int n) {
    System.out.println("in A int" + n);
  }
}

class B extends A {
  public B() {
    System.out.println("in B");
  }

  public B(int n) {
    super(7);
    System.out.println("in B int" + n);
  }
}

public class Solution {
  public static void main(String[] args) {

    B objB = new B(5);

  }
}
