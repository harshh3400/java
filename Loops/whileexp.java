public class whileexp {
    public static void main(String[] args) {
        int n=1098;
        while (n>0) {
            int lastdigit=n%10;
            n=n/10;
            System.out.print(lastdigit);
        }

    }
}
