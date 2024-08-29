link -> [ https://www.geeksforgeeks.org/problems/introduction-to-trees/1 ] 
class Solution {
    static int countNodes(int i) {
        // code here
        int count =(int) Math.pow(2,i-1);
        return count;
    }
}
