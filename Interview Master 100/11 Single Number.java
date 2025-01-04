brute -> 
import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n-1; i += 2) {
            if(nums[i] != nums[i+1]) {
                return nums[i];  // Return the unique value
            }
        }
        return nums[n-1];  // Last element is the single number if loop doesn't return
    }
}
-----------------------------------------
optimised approach ->
  class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            xor = xor^nums[i];
        }
        return xor;
    }
}
