import java.util.Scanner;

class reverseString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=0;
        int r=str.length()-1;
        char[] charArray=str.toCharArray();
        while(l<r){
            char temp=charArray[l];
            charArray[l]=charArray[r];
            charArray[r]=temp;
            l++;
            r--;    
        }
        System.out.println(new String(charArray));
        sc.close();
    }
}