public class get_ith_bit {
    public static void Get_ith_Bit(int n,int bit_no){
        int bitmask=1<<bit_no;
        if((n & bitmask)==0){
            System.out.println(bit_no+" bit is 0.");
        }
        else
        {
            System.out.println(bit_no+" bit is 1.");
        }
    }
    public static void main(String[] args) {
        Get_ith_Bit(4, 2);
    }
}
