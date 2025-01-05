brute force -> {class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j =0; j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>n/2){
            return nums[i];
        }
        }
        return -1;
    }
}
--------------------------------------------------------------------------------------------------------
Optimised -> TC - O(N);
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = nums[0];
        for(int i = 0; i<n; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
}
