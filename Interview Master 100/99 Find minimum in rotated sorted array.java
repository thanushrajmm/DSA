class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = nums[0];

        while( left<=right ){
            int mid = right + left / 2;
            if( nums[left] < nums[right] ){
                ans = Math.min( ans, nums[left] );
            }
                ans = Math.min( ans,nums[mid] );
            if( nums[left] < nums[mid] ){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
}
