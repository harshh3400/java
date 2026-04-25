public class KnapSack {
  public static int knapsack(int W, int[] wt, int[] val, int n) {
    if (n == 0 || W == 0) {
      return 0;
    }
    if (wt[n - 1] <= W) {
      int include = val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1);
      int exclude = knapsack(W, wt, val, n - 1);
      return Math.max(include, exclude);
    } else {
      return knapsack(W, wt, val, n - 1);
    }
  }

  public static void main(String[] args) {

    int val[] = { 1, 2, 3 };
    int wt[] = { 4, 5, 1 };
    int W = 4;

    int n = wt.length;

    int result = knapsack(W, wt, val, n);

    System.out.println("Maximum Profit: " + result);
  }
}
