class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        int prev1 = 1;
        int prev = 1;
        for(int i = 2; i<=n; i++){
            dp[i] = prev + prev1;
            prev1 = prev;
            prev = dp[i];
        }
        return prev;
    }
}
