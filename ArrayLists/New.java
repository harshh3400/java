import java.util.ArrayList;
import java.util.Collections;
public class New{
  public static void SwapNumbers() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);

        System.out.println("Before swap: " + nums);
        int temp = nums.get(0);
        nums.set(0, nums.get(1));
        nums.set(1, temp);
        System.out.println("After swap: " + nums);
    }
    public static void sortList(){

    }
  public static void main(String args[]){
    ArrayList<Integer> List1=new ArrayList<Integer>();
    List1.removeAll(List1);
  }
}



