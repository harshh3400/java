public class check_power_of_two {
    public static boolean check_Power_of_Two(int n)
    {
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(check_Power_of_Two(4));
    }
}
