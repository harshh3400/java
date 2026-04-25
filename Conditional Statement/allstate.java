public class allstate {
    public static void main(String[] args) {

        int a = 10, b = 20;

        // 1. if statement
        // Executes the block only if the condition is true
        if (a < b) {
            System.out.println("a is less than b");
        }

        // 2. if-else statement
        // Executes one block if condition is true, another if false
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // 3. if-else if-else ladder
        // Useful when checking multiple conditions
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }

        // 4. Nested if
        // An if statement inside another if block
        int age = 25;
        String nationality = "Indian";
        if (age >= 18) {
            if (nationality.equals("Indian")) {
                System.out.println("Eligible to vote in India");
            }
        }

        // 5. switch statement
        // Used when you have multiple specific values to check
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }

        // 6. Ternary operator (shorthand for if-else)
        // Syntax: condition ? expression_if_true : expression_if_false
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result);

    }
}

