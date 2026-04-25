public class binary_search {
    public static int binary_Search(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10,16,18};
        int key=8;
        System.out.print("Key found at "+binary_Search(arr,key));
    }
}
