public class butterfly {
    public static void butterflyPattern(int n)
    {
        //first half
        for(int i=1;i<=n;i++)
        {
            //stars
            for(int p=1;p<=i;p++)
            {
                System.out.print("*");
            }
            //spaces
            for(int q=1;q<=(2*(n-i));q++)
            {
                System.out.print(" ");
            }
            //stars
            for(int r=1;r<=i;r++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--)
        {
            for(int p=1;p<=i;p++)
            {
                System.out.print("*");
            }
            for(int q=1;q<=(2*(n-i));q++)
            {
                System.out.print(" ");
            }
            for(int r=1;r<=i;r++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        butterflyPattern(10);
    }
}
