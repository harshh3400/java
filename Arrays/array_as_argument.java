// Java is always pass-by-value

// For primitives: actual value is passed (changes do NOT affect original)
// For arrays/objects: reference is passed BY VALUE
// So: you can modify array elements, but cannot reassign the original array

// Example:

public class array_as_argument {
    static void modify(int[] arr) {
        arr[0] = 100;              // ✅ Changes original array
        arr = new int[]{9, 9, 9};  // ❌ Only changes local reference
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        modify(a);
        System.out.println(a[0]);  // Output: 100 (element changed)
    }
}

