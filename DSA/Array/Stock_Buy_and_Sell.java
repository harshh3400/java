public class Stock_Buy_and_Sell{
    public static int buyAndsellstock(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ //if profit
                int profit=prices[i]-buyPrice; //today's profit
                maxProfit=Math.max(profit,maxProfit);
            }else{
                buyPrice=prices[i];  //price<buy price
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int profit=buyAndsellstock(prices);
        System.out.println("Maximum profit:"+profit);
    }
}

// Algorithm to solve Stock Buy and Sell (Single Transaction):
    /*
        1. Initialize:
           - buyPrice = infinity (Integer.MAX_VALUE)
           - maxProfit = 0

        2. Loop through each day's price:
            a) If today's price > buyPrice
               → Calculate profit = today's price - buyPrice
               → Update maxProfit = max(profit, maxProfit)

            b) Else (today's price <= buyPrice)
               → Update buyPrice = today's price (better day to buy)

        3. After loop ends → return maxProfit

        ✅ Key Idea:
           - Keep track of the lowest price so far (best buying price).
           - At each step, calculate profit if selling today.
           - Keep updating maximum profit possible.
    */