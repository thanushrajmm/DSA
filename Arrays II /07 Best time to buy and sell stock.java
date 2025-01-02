link -> [ https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ ]
Brute Force ->
    class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
       int maxpro = 0;
       for(int i =0; i<n; i++){
        for(int j = i+1; j<n; j++){
            if(prices[j]>prices[i]){
                maxpro = Math.max(maxpro, prices[j]-prices[i]);
                }
            }
       }
       return maxpro;
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------
Optimised Approach ->
    
class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;

        for(int i = 1; i<prices.length; i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit,cost);
            mini = Math.min(prices[i],mini);
        }
        return maxProfit;
    }
}
