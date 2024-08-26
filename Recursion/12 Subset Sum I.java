problem link -> [ https://www.geeksforgeeks.org/problems/subset-sums2234/1 ]
Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList < Integer > subsetSums = new ArrayList < > ();
        subsetSumsHelper(0, 0, arr, n, subsetSums);
        Collections.sort(subsetSums);
        return subsetSums;
    }

    static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int n, ArrayList < Integer > subsetSums) {
        if (ind == n) {
            subsetSums.add(sum);
            return;
        }

        // pick the element 
        subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, n, subsetSums);

        // Do-not pick the element
        subsetSumsHelper(ind + 1, sum, arr, n, subsetSums);
    }

}
