import java.util.Scanner;
public class BREAKEXP{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do{
            System.out.print("Enter a Number :");
            choice=sc.nextInt();

        }while((choice%10)!=0);
    }
}