public class LoopsInJava {
    public static void main(String[] args) {

        // 1. for loop
        // Used when the number of iterations is known
        // Syntax: for(initialization; condition; update)
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // 2. while loop
        // Used when the number of iterations is not known beforehand
        // It checks the condition before executing the block
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        // 3. do-while loop
        // Similar to while loop, but condition is checked after execution
        // So it runs at least once even if the condition is false
        int k = 1;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k <= 5);

        // 4. for-each loop (enhanced for loop)
        // Used to iterate over arrays or collections easily
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("For-Each Loop Element: " + num);
        }

        // 5. Nested loops
        // A loop inside another loop
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("[" + row + "," + col + "] ");
            }
            System.out.println(); // for new line
        }

        // 6. break statement
        // Used to exit a loop prematurely
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // exits the loop when i == 3
            }
            System.out.println("Break Example: " + i);
        }

        // 7. continue statement
        // Skips the current iteration and continues with the next
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // skips the iteration when i == 3
            }
            System.out.println("Continue Example: " + i);
        }
    }
}



