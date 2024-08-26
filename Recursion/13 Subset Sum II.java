problem link -> [ https://leetcode.com/problems/subsets-ii/ ] 
Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }

    public void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList ){
    ansList.add(new ArrayList<>(ds));
    for(int i = ind; i<nums.length; i++){
        if(i!=ind && nums[i] == nums[i-1]) continue;
        ds.add(nums[i]);
        findSubsets(i+1, nums, ds, ansList);
        ds.remove(ds.size()-1);
    }
    }
}
