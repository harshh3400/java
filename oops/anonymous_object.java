class calculator{
    public void add(int a, int b){
        System.out.println("The sum is: " + (a+b));
    }
}
public class anonymous_object {
    public static void main(String[] args) {
        new calculator().add(5, 10); // Anonymous object
    }
}
