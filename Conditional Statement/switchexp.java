import java.util.Scanner;
public class switchexp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Samosa");
            break;
            case 2:
            System.out.println("Pizza");
            break;
            case 3:
            System.out.println("Juice");
            break;
            default:
            System.out.println("Get the bill!");
        }
        sc.close();
    }
}
