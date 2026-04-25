import java.util.Scanner;

public class factorial {
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int result=factorialofnum(num);
        System.out.println(result);
        sc.close();
    }
}
