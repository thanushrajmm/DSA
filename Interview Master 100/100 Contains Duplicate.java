class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j = i+1; j<n; j++){
            if(nums[i]==nums[j]) continue;
            else{
                nums[i+1] = nums[j];
            }
            i++;
        }
        return i+1;
    }
}
