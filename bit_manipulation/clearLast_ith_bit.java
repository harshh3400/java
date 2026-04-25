public class clearLast_ith_bit {
    public static int Clear_Last_Ith_Bit(int n,int i)
    {
        return n & (-1<<i);
    }
    public static void main(String[] args) {
        int result=Clear_Last_Ith_Bit(11,2);
        System.out.println(result);
    }
}
