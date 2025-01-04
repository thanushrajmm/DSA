brute force -> 
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
--------------------------------------------------------------------------------
optimised ->
class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
       int maxpro = 0;
       int mini = prices[0];
       for(int i =0; i<n; i++){
            int cost = prices[i]-mini;
            maxpro = Math.max(cost,maxpro);
            mini = Math.min(mini,prices[i]);
       }
       return maxpro;
    }
}
