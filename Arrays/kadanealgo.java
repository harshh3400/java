public class kadanealgo {
    public static void main(String[] args) {
        
        int arr[] = {1, -2, 6, -1, 3}; // Mixed array
        kadane_Algo(arr); // Original Kadane's (may fail for all-negative)
        
        int arr1[] = {-4, -2, -7, -1};  // All negative array
        kadane_Max_Subarray_Sum(arr1); // Fixed Kadane's to handle all-negative case
    }

    // ✅ Kadane's algorithm (original): Works well for mix of + and -
    public static void kadane_Algo(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0; // Reset on negative sum
            }

            maxSum = Math.max(currSum, maxSum); // Track maximum so far
        }

        System.out.println("Kadane (may fail on all-negatives): " + maxSum);
    }

    // ✅ Modified Kadane's algorithm: Handles all-negative case properly
    public static void kadane_Max_Subarray_Sum(int arr[]) {
        int maxSum = arr[0]; // Initialize with first element
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]); // Start new or continue
            maxSum = Math.max(maxSum, currSum); // Update max if needed
        }

        System.out.println("Kadane (all-negative handled): " + maxSum);
    }
}