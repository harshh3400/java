public class fast_exponentiation {
    public static int Fast_Exponentiation(int a,int n)
    {
        int ans=1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans=a*ans;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Fast_Exponentiation(5,3));
    }
}
