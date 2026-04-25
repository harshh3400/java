public class linear_search {
    public static void linear_Search(int arr[],int key)
    {
        for(int i=0;i<=arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(key +" found at index :"+ i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=90;
        linear_Search(arr,key);

    }
    
}
