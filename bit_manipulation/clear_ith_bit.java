public class clear_ith_bit {
    public static int Clear_ith_Bit(int n,int bit_no){
        int bitmask=~(1<<bit_no);
        return n & bitmask;
    }
    public static void main(String[] args) {
        int result=Clear_ith_Bit(4,2);
        System.out.println(result);
    }
}
