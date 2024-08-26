problem link -> [ https://leetcode.com/problems/combination-sum/ ]
Time complexity: O(2^t)
Space complexity: O(t+k)
Example 1:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public void findCombinations(int ind, int[] candidates, int target, List<List<Integer>> ans, List<Integer> ds ){
        if(ind == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[ind]<=target){
            ds.add(candidates[ind]);
            findCombinations(ind, candidates, target - candidates[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1, candidates, target, ans, ds);
    }
}

