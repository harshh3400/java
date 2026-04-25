import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Integer number = 100;

    // Using getClass() and getName() together
    System.out.println("Object 1 type: " + list.getClass());
    System.out.println("Object 2 type: " + number.getClass().getName());
    String str = "Hello";
  }
}
