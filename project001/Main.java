import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
  public static void main(String[] args){

    String name = JOptionPane.showInputDialog("enter your name: ");
    
    int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
    
    JOptionPane.showMessageDialog(null, "name : " + name + "\n" + "age : " + age);;
  }
}