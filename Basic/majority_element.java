import java.util.*;

public class majority_element {
  public static void findMajorityElement(int arr[], int n) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put((arr[i]), 1);
      }
    }
    System.out.println(map);
    for (int key : map.keySet()) {
      if (map.get(key) > n / 3) {
        System.out.println("Majority Elemnt :" + key);
      }
    }
  }

  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 3, 2, 2, 3 };
    findMajorityElement(arr, arr.length);
  }
}
