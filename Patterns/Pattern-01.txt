Example 1:
Input: N = 3
Output: 
* * *
* * *
* * *


Example 2:
Input: N = 6
Output:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *

Solution:
public class Solution {
    public static void nForest(int n) {
        
        for(int i = 0; i<n; i++){ //Outer-loop for Rows
            for(int j = 0; j<n; j++){ //Inner-loop for columns
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
