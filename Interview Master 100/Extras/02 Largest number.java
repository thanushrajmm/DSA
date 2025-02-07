link -> [ https://leetcode.com/problems/largest-number/ ] 
class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] s = new String[n];

        for(int i = 0; i<n; i++){
            s[i] = String.valueOf(nums[i]);
        }
            Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
            if(s[0].equals("0")){
                return "0";
            }

            StringBuilder largest = new StringBuilder();
            for(String str : s){
                largest.append(str);
            }
    return largest.toString();
    }
}
