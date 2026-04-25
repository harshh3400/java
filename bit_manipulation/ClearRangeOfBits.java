public class ClearRangeOfBits {
    public static int ClearRange_Of_Bits(int n,int i,int j)
    {
        int a=-1<<j+1;
        int b=(1<<i)-1;
        return n & (a|b);
    }
    public static void main(String[] args) {
        int result=ClearRange_Of_Bits(255,1,6);
        System.out.println(result);
    }
}
