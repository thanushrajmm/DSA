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
-----------------------------------------------------------------------
2.printing the subarray
    class Solution {
    public int[] maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int total = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < n; i++) {
            if (total < 0) {
                total = 0;
                tempStart = i; // Update the starting index of the new subarray
            }
            total += nums[i];

            if (total > res) {
                res = total;
                start = tempStart; // Update the starting index
                end = i;           // Update the ending index
            }
        }

        // Extract the subarray using start and end indices
        int[] subArray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            subArray[i - start] = nums[i];
        }

        return subArray;        
    }
}

