class tim {
  int age;
  int point;
  static String name;
  String brand;

  public void display() {
    System.out.println(age + " : " + "is " + brand);
  }

  public static void disnam(tim age) {
    System.out.println(age + " : " + "is " + name);
  }
}

class InnerDemo {
  public static void main(String[] var0) {
    tim objInner = new tim();
    objInner.age = 21;
    objInner.brand = "mustag";
    objInner.display();
    tim.name = "whahid";
    objInner.disnam(objInner.age);

  }
}
