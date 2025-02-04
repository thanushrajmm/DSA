public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Mark numbers outside the range [1, n] with a special marker (n+1)
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark each cell appearing in the array by converting the index to negative
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num > n) {
                continue;
            }
            num--; // Convert to zero-based index
            if (nums[num] > 0) { // Prevents double negative operations
                nums[num] = -1 * nums[num];
            }
        }

        // Step 3: Find the first cell that isn't negative (the missing positive)
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                return i + 1;
            }
        }

        // Step 4: If all numbers are present, return n+1
        return n + 1;
    }
}
