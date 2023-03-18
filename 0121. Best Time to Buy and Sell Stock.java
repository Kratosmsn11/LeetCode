class Solution {
    public int maxProfit(int[] prices) {
        int min = 0, max = 0, maxProfit=0;
        min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if (prices[i] < min) min = prices[i];
            if (maxProfit < (prices[i] - min)) maxProfit = (prices[i] - min);
        }
        return maxProfit;
    }
}
