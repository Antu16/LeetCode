class Solution {
    public int maxProfit(int[] prices) {
        int leastStockValue = prices[0];
        int profit = 0;
        int currentProfit = 0;
        
        for (int i = 1; i<prices.length;i++){
            if (prices[i] < leastStockValue){
                leastStockValue = prices[i];
            }
            currentProfit = prices[i] - leastStockValue;
            
            if (currentProfit > profit){
                profit = currentProfit;
            }
        }
        
        return profit;
    }
}