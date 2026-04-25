import java.util.Scanner;

public class practice1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Side of Square:");
        int a=sc.nextInt();
        float area=a*a;
        System.out.println(area);
        sc.close();
    }

}