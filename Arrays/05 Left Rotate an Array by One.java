Example:
Input: 'a' = 5, 'arr' = [1, 2, 3, 4, 5]

Output: [2, 3, 4, 5, 1]

Explanation: We moved the 2nd element to the 1st position, and 3rd element to the 2nd position, and 4th element to the 3rd position, and the 5th element to the 4th position, and move the 1st element to the 5th position.

import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];         // store the initial value in temp
        for(int i = 1; i<n; i++ ){ //traverse the loop
            arr[i-1] = arr[i];     //place arr[i] in arr[i-1] one step backward
        } 
            arr[n-1] = temp;       //now place temp in arr[n-1] i.e last index.
            return arr;
    }
}
