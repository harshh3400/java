public class check_set_bits {
    public static int Check_Set_Bits(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n &1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Check_Set_Bits(10));
    }
}
