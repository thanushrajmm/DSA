problem link -> [ https://leetcode.com/problems/maximum-subarray/ ]

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int total = 0;

        for (int i = 0; i<n; i++) {
            if (total < 0) {
                total = 0;
            }
            total += nums[i];
            res = Math.max(res, total);
        }

        return res;        
    }
}
