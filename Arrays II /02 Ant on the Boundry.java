problem link -> [ https://leetcode.com/problems/ant-on-the-boundary/ ]
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum+nums[i];
            if(sum==0){
                count++;
            }
        }
        return count;
    }
}
