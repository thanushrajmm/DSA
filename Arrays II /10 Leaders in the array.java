problem link -> [ https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620 ]
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int max =  Integer.MIN_VALUE;
         int n = arr.length;
         
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                ans.add(arr[i]);
                max = arr[i]; 
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
