import java.util.ArrayList;

public class Heap {
  public static void main(String[] args) {

    ArrayList<ArrayList<Integer>> allin = new ArrayList<>();
    ArrayList<Integer> colors = new ArrayList<>();
    ArrayList<Integer> foods = new ArrayList<>();
    ArrayList<Integer> cars = new ArrayList<>();

    colors.add(00);
    colors.add(01);
    colors.add(02);
    colors.add(03);
    colors.add(04);
    foods.add(10);
    foods.add(11);
    foods.add(12);
    foods.add(13);
    cars.add(20);
    cars.add(21);
    cars.add(22);

    allin.add(colors);
    allin.add(foods);
    allin.add(cars);

    System.out.println(colors);
    System.out.println(foods);
    System.out.println(cars);
    System.out.println(allin);
  }
}
