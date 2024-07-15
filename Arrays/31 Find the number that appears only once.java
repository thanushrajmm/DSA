Problem link : [https://leetcode.com/problems/single-number/]
Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
  
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for(int i = 0; i<n ; i++){
            xor = xor ^ nums[i];
        }
    return xor;
    }
}
