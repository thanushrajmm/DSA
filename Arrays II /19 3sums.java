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
-------------------------------------------------------------------------------------------
Optimal 2 pointers approach -> O(N^2);
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                List<Integer> sortedArray = Arrays.asList(nums[i],nums[j],nums[k]);
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    ans.add(sortedArray);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}
