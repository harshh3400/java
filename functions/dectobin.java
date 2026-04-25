import java.util.Scanner;

public class dectobin {
    public static void decToBin(int num){
        int pow=0;
        int binary=0;
        while(num>0)
        {
            int reminder=num%2;
            binary=binary+reminder*(int)Math.pow(10,pow);
            pow++;
            num/=2;
        }
        System.out.print(binary);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num=sc.nextInt();
        decToBin(num);
        sc.close();
    }
}
