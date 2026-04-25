public class functionoverloading {
     // add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // add three numbers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    // sum of two integer
    public static int sum(int a,int b){
        return a+b;
    }
    // sum of two float int
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));      // Output: 30
        System.out.println(add(10, 20, 30));  // Output: 60
        System.out.println(sum(3,2));
        System.out.println(sum(2.5f,2.5f));
    }
}
