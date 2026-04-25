public class prefixsum_max_subarray_sum {
    
    // Function to calculate the maximum subarray sum using prefix sum
    public static void prefixsum_Max_Subarray_Sum(int arr[]) {
        
        int currSum = 0; // To store the sum of current subarray
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible integer value

        // Step 1: Create prefix sum array
        int prefix_arr[] = new int[arr.length];
        prefix_arr[0] = arr[0]; // First element of prefix array is same as original array

        // Fill the prefix array where each element is the sum of all previous elements including itself
        for (int i = 1; i < arr.length; i++) {
            prefix_arr[i] = prefix_arr[i - 1] + arr[i];
            // Example: if arr = {1, -2, 6, -1, 3}
            // prefix_arr = {1, -1, 5, 4, 7}
        }

        // Step 2: Try all subarrays using two nested loops
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                // Step 3: Calculate subarray sum using prefix array
                // If subarray starts from index 0
                if (i == 0) {
                    currSum = prefix_arr[j]; // sum from 0 to j
                } else {
                    currSum = prefix_arr[j] - prefix_arr[i - 1]; // sum from i to j
                }

                // Step 4: Update maxSum if current sum is greater
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        // Step 5: Print the result
        System.out.println("Maximum subarray sum :" + maxSum);
    }

    // Main function
    public static void main(String[] args) {
        // Input array
        int arr[] = {1, -2, 6, -1, 3};

        // Call the function to calculate maximum subarray sum
        prefixsum_Max_Subarray_Sum(arr);
    }
}
