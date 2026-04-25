public class ArrayCreation {
    public static void main(String[] args) {

        // 1. Creating an array by declaring and assigning values directly
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Creating an array using 'new' keyword with fixed size
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Mango";
        fruits[2] = "Banana";

        // 3. Creating and initializing a double array using 'new'
        double[] prices = new double[] {19.99, 29.99, 9.99};

        // Printing all arrays
        System.out.println("Integer array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nString array:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        System.out.println("\nDouble array:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
    }
}

