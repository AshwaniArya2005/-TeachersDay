public class Problem1 {
    //Q) Best Time to Buy and Sell Stock
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    // You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    // Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0;i <prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            int profit = prices[i]-min;
            if(profit>maxprofit){
                maxprofit =profit;
            }
        }
        return maxprofit;
    }
}
