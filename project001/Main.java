import java.util.ArrayList;
// import java.util.Scanner;
// import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {

    String[] cars = new String[3];

    cars[0] = "one";
    cars[1] = "two";
    cars[2] = "three";

    ArrayList<String> foods = new ArrayList<>();
    foods.add("pizza");

    System.out.println(foods.get(0));

    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
  }
}