problem link -> [https://leetcode.com/problems/container-with-most-water/]
two pointer pattern
class Solution {
    public int maxArea(int[] height) {
        int ans = -1;
        int n = height.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            int length = right - left;
            int width = Math.min(height[left], height[right]);
            int area = length * width;
            ans = Math.max(ans,area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return ans;
    }
}
