public class largest_num {
    public static int find_largest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]>largest)
            {
                largest=num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
        int largest=find_largest(arr);
        System.out.println("Largest Number In array is "+largest);
    }
}
