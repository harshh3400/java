import java.util.Scanner;

public class hollowrec {
    public static void hollowrectangle(int row,int col){
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1 || i==row || j==1 || j==col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int row=sc.nextInt();
        System.out.print("ENter number of column:");
        int col=sc.nextInt();
        hollowrectangle(row,col);
        sc.close();
    }
}
