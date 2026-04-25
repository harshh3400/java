import java.util.Scanner;
public class loopcontinue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.print("Enter a number:");
            choice=sc.nextInt();
            if(choice%10==0)
            continue;
            System.out.println(choice);
            System.out.print("Enter 100 to exit !");
        }while(choice!=100);

        sc.close();
    }
}
