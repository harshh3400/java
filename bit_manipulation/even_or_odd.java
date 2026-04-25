import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        if((n&1)==1)
        {
            System.out.println("Entered number is odd!");
        }
        else{
            System.out.println("Entered number is even!");
        }
        sc.close();
    }
}
