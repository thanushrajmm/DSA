class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        answer[0] = 1;
        for(int i = 1; i<n; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i = n-1; i>=0; i--){
            answer[i] = answer[i]*suffix;
            suffix = suffix*nums[i];
        }
        return answer;
    }
}
-------------------------------
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result,1);
        int pre = 1, pos = 1;

        for(int i = 0; i<nums.length; i++){
            result[i] = pre;
            pre = nums[i]*pre;
        }

        for(int i = nums.length-1; i>=0; i--){
            result[i] = result[i]*pos;
            pos = nums[i]*pos;
        }
        return result;
    }
}
