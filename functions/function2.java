import java.util.Scanner;
public class function2 {
    public static int add(int a,int b)//formal parameters
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ente a number:");
        int a=sc.nextInt();
        System.out.println("Enter a another number:");
        int b=sc.nextInt();
        int sum=add(a,b);//arugments or actual parameters
        System.out.println("Sum of to number is:"+sum);
        sc.close();

    }
}
