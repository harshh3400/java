import Sorting.AllSortingAlgorithms;
public class demo {
    public static void main(String[] args) {
        int [] arr={1,3,5,6,2,7,9,10};
        AllSortingAlgorithms.quickSort(arr,0,arr.length-1); 
        AllSortingAlgorithms.traverse(arr);
    }
}
