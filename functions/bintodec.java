public class bintodec {
    public static void binTodec(int num)
    {
        int pow=0;
        int dec=0;
        while(num>0)
        {
            int lastdig=num%10;
            dec=dec+(lastdig*(int)Math.pow(2, pow));
            pow++;
            num/=10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        binTodec(10000001);
    }
}
