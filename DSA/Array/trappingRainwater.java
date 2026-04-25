public class trappingRainwater{
    public static void tappedRainwater(int arr[]){
        
        //left max boundary calculation
        int leftMaxBoundary[]=new int [arr.length];
        leftMaxBoundary[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftMaxBoundary[i]=Math.max(leftMaxBoundary[i-1],arr[i]);
        }
        //right max boundary calculation
        int rightMaxBoundary[]=new int [arr.length];
        rightMaxBoundary[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightMaxBoundary[i]=Math.max(rightMaxBoundary[i+1],arr[i]);
        }
        //trapped rain water calculation
        //waterlevel=min(rightMaxBoundary,leftMaxBoundary)-height
        int trappedRainWater=0;
        for(int i=0;i<arr.length;i++){
            int waterLevel=Math.min(rightMaxBoundary[i],leftMaxBoundary[i]);
            trappedRainWater+=waterLevel-arr[i];
        }
        System.out.println("Trapped Water :"+trappedRainWater);
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        tappedRainwater(height);
    }
}

/*
Trapping Rainwater Algorithm:

1. For each bar, water depends on the tallest bar to the left and right.
2. Compute leftMax[i] = max height from start to i.
3. Compute rightMax[i] = max height from end to i.
4. Water level at bar i = min(leftMax[i], rightMax[i]).
5. Trapped water at bar i = waterLevel - height[i].
6. Sum up trapped water for all bars to get the answer.
*/

/*
Trapping Rainwater Algorithm:

Bars (height array): [4,2,0,6,3,2,5]

1. For each bar, water trapped depends on tallest wall to the LEFT and RIGHT.

   Example visualization:
   |
   |        #
   |  #     #     #
   |  #     #  #  #
   |  #     #  #  #
   |  #  #  #  #  #
   -------------------
      4  2  0  6  3  2  5   <- heights

2. Compute Left Max:
   leftMax[i] = max height from start → i
   => [4,4,4,6,6,6,6]

3. Compute Right Max:
   rightMax[i] = max height from end → i
   => [6,6,6,6,5,5,5]

4. Water level at each bar:
   waterLevel[i] = min(leftMax[i], rightMax[i])
   => [4,4,4,6,5,5,5]

5. Trapped Water at bar i:
   trapped[i] = waterLevel[i] - height[i]
   => [0,2,4,0,2,3,0]

6. Total Trapped Water = sum(trapped[i])
   => 11 units
*/
