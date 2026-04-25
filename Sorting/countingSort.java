public class countingSort {
    public static void counting_Sort(int[] arr) {
        int n = arr.length;

        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store the count of each unique object
        int[] count = new int[max + 1];

        // Store the count of each number
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        // Reconstruct the sorted array
        // Traverse the count array and fill the original array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;// place the number in the original array
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64,64,34, 34, 25, 12, 22, 11, 90};
        counting_Sort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
