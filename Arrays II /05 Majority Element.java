problem link -> [ https://leetcode.com/problems/majority-element/ ]
Brute Force:
  class Solution {
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
------------------------------------------------------------------------------------------------
Moore's Voting Algorithm:
  class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int el = 0;
        for(int i = 0; i<n; i++){
            if(count==0){
                count = 1;
                el = nums[i];
            }
            else if(nums[i]==el){
                count++;
            }
            else count--;
        }
        int count1 = 0;
    for(int i=0; i<n;i++){
        if(nums[i]==el) count1++;  
    }
     if(count1 > n/2){
        return el;
    }
        return -1;
    }
}
