problem link -> [ https://www.naukri.com/code360/problems/subset-sum_630213 ] 
public class Solution {
    public static boolean isSubsetPresent(int n, int k,int []a) {
        return solve(0, k, a, 0);
    }

    public static boolean solve(int i, int target, int[] a, int currentSum) {
        if (target == 0)
            return true;

        if (i == a.length || target < 0)
            return false;

        if (solve(i + 1, target - a[i], a, currentSum + a[i]))
            return true;

        if (solve(i + 1, target, a, currentSum))
            return true;

        return false;
    }
}
