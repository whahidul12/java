class Human {
  private int age;
  private String name;
  private boolean alive;
  private String aliveState;

  public Human(String a) {
    System.out.println("this is Human constractor: " + a);
  }

  public void isAlive() {
    if (alive) {
      this.aliveState = "alive";
    } else {
      this.aliveState = "dead";
    }
  }

  public void setInfo(int age, String name, boolean alive) {
    this.age = age;
    this.name = name;
    this.alive = alive;

  }

  public void getInfo() {
    isAlive();
    System.out.println("his name is " + name + ".");
    System.out.println("he is " + age + " years old.");
    System.out.println("and he is " + aliveState + ".");
  }
}

public class Solution {
  public static void main(String[] args) {
    Human objHuman = new Human("whahid");
    objHuman.setInfo(12, "Nafi", false);
    objHuman.getInfo();
  }

}
