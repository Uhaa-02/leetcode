class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
         int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0;i<n;i++){
            if(buyPrice < prices[i]) //profit
            {
                int profit = prices[i] - buyPrice;//tpday's profit
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}