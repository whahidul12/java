class Human {
  private int age;
  private String name;
  private boolean alive;
  private String aliveState;

  public Human() {

  }

  public void isAlive() {
    if (alive) {
      this.aliveState = "alive";
    }
  }

  public String getInfo() {
    System.out.println("his name is " + name + ".");
    System.out.println("he is " + age + "years old.");
    System.out.println("and he is " + aliveState);
  }

}

public class Solution {

  public static void main(String[] args) {

  }

}
