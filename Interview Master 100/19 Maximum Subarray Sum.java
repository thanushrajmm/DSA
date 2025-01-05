class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int total = 0;
        for(int i =0; i<n; i++){
             if(total<0){
                total = 0;
            }
            total = total+nums[i];
           
            max = Math.max(max,total);
        }
        return max;
    }
}
