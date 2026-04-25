import java.util.ArrayList;
import java.util.Scanner;
public class arraylist_in_reverseOrder{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count of number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter number:");
            int num=sc.nextInt();
            arr.add(i,num);
        }
        System.out.println("Arraylist in reverse ordered:");
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
}
class a{

}
class b{
    
}