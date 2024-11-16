problem link -> [ https://leetcode.com/problems/3sum/ ]
Brute force -> O(n^3);
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> triplets = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(triplets);
                        if(!ans.contains(triplets)){
                            ans.add(triplets);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
