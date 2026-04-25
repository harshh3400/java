import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.TreeSet;

public class methods {
  public static void main(String[] args) {
    Iterable it = new Iterable<T>() {

    };
    Collection c = new ArrayList<>();
    // ArrayList<String> cars = new ArrayList<>();
    // cars.add("BMW");
    // cars.add("Audi");
    // cars.add("Bugati");
    // cars.add("BMW");
    // System.out.println(cars);
    // ArrayList<String> brands = new ArrayList<>();
    // brands.add("Maruti");
    // brands.add("Mahindra");
    // System.out.println(brands);
    // brands.addAll(cars);
    // System.out.println(brands);
    // ArrayList<String> cars2 = new ArrayList<>();
    // cars2 = (ArrayList) cars.clone();
    // System.out.println(cars2.clone());
    // ListIterator<String> it = cars.listIterator();
    // System.out.println(it.next());
    // while (it.hasPrevious()) {
    // System.out.println(it.previous() + " ");
    // }
    // HashMap<String, String> capitalCities = new HashMap<String, String>();
    // capitalCities.put("England", "London");
    // capitalCities.put("Germany", "Berlin");
    // capitalCities.put("Norway", "Oslo");
    // capitalCities.put("USA", "Washington DC");

    // HashMap<String, String> copy = (HashMap) capitalCities.clone();
    // copy.remove("England");

    // System.out.println(capitalCities);
    // System.out.println(copy);
    // System.out.println(capitalCities);
    // System.out.println(capitalCities.entrySet());
    // System.out.println(capitalCities.getOrDefault("India", "Unkn"));
    // String[] cars = { "Volvo", "BMW", "Tesla" };
    // String[] cars2 = { "Maruti" };

    // System.out.println(Arrays.compare(cars, cars2));
    TreeSet<Integer> numbers = new TreeSet<>();
    numbers.add(40);
    numbers.add(10);
    numbers.add(30);
    numbers.add(20);

    for (int n : numbers) {
      System.out.println(n);
    }
  }
}
