problem link -> [ https://www.geeksforgeeks.org/problems/subset-sums2234/1 ]
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
