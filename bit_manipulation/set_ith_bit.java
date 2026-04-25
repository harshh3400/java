public class set_ith_bit {
    public static void Set_ith_Bit(int n,int bit_no)
    {
        int bitmask=1<<bit_no;
        int result=n | bitmask;
        System.out.println("After Setting:"+result);
    }
    public static void main(String[] args) {
        Set_ith_Bit(5,1);
    }
}
