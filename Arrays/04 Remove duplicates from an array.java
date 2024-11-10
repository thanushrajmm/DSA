Practice link -> 1. [https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/]
                 2. [https://bit.ly/3if2k8G]
Input
nums =
[0,0,1,1,1,2,2,3,3,4]
Output
[0,1,2,3,4]
brute force : use hashset

 optimised:  
class Solution {
    public int removeDuplicates(int[] nums) { //two pointer approach;
        int i = 0;                            //first pointer at i;
        for(int j = 1; j<nums.length; j++){   //second pointer at j; traverse through the sorted array    
            if(nums[i] != nums[j]){           //if nums[0] is not equal to nums[j];
                nums[i+1] = nums[j];          //place nums[j] in nums[i+1] (the next to nums[i] i.e nums[0]; 
                i++;                          //increment the i; 
            }
        }
                return i+1;                   //return the unique value number
    }
}
