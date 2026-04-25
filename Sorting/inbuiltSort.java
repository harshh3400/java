import java.util.Arrays;
public class inbuiltSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        // Using Java's built-in sort method
        Arrays.sort(arr);
        
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}