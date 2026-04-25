public class bincoffe {
    public static int binomalcoeff(int n,int r){
        int n_factorial=factorialofnum(n);
        int r_factorial=factorialofnum(r);
        int n_r_factorial=factorialofnum(n-r);
        int binomalcoefficient=n_factorial/(r_factorial*n_r_factorial);
        return binomalcoefficient;
    }
    public static int factorialofnum(int num)
    {
        if(num==0)
        return 1;
        int result=1;
        for(int i=1;i<=num;i++)
        {
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(binomalcoeff(5,2));
}
}
