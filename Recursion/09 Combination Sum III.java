Problem link -> [ https://leetcode.com/problems/combination-sum-iii/ ] 
Example 1:
Input: k = 3, n = 7
Output: [[1,2,4]]
    
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] number={1,2,3,4,5,6,7,8,9};
        solve(0,number,k,n,new ArrayList<>());
        return ans;
    }
    public void solve(int index,int [] numbers,int k,int target,List<Integer> ds){
        if(target==0 && ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(ds.size()>k){
            return;
        }
        for(int i=index;i<numbers.length;i++){
            ds.add(numbers[i]);
            solve(i+1,numbers,k,target-numbers[i],ds);
            ds.remove(al.size()-1);
        }
    }
}
