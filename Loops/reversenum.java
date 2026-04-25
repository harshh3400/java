public class reversenum {
    public static void main(String[] args) {
        int n=1098;
        int reverse=0;
        while (n>0) {
            int lastdigit=n%10;
            n=n/10;
            reverse=(reverse*10)+lastdigit;
        }
        System.out.println(reverse);
    }
}

