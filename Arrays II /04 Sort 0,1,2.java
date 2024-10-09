problem link -> [ https://leetcode.com/problems/sort-colors/ }
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]==0) count0++;
            else if(nums[i]==1) count1++;
            else count2++;
        }

        for(int i = 0; i<count0; i++){
            nums[i] = 0;
        }
        for(int i = count0; i<count0+count1; i++){
            nums[i] = 1;
        }
        for(int i = count0+count1; i<n; i++){
            nums[i] = 2;
        }
    }
}
---------------------------------------------------------------------------------------
    class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums[low],nums[mid]);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums[mid],nums[high]);
                high--;
            }
        }
    }
};
