For example:
Input:
'a' = [1, 2, 4, 5], 'n' = 5

Output :
3
optimal solution - 1 (summation)
public class Solution {
    public static int missingNumber(int []a, int N) {
        int s1 = (N*(N+1)/2);    // find the sum of natural numbers
        int s2 = 0;          
        for(int i =0; i<N-1;i++){
            s2 = s2 + a[i];      //add the elements present currently in the array     
        }
        int ans = s1-s2;         //by substracting s2 from s1 we get the element which is missing 
        return ans;
    }
}
---------------------------------------------------------------------------------------
  optimal solution - 2 (XOR)
  public class Solution {
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        int xor1 = 0;
        int xor2 = 0;
        for(int i =0; i<N-1; i++){
            xor2 = xor2 ^ a[i];      //Xor2 with the array elements
            xor1 = xor1 ^ (i+1);     //xor1 from 1-> n-1
          
        }
        xor1 = xor1 ^ N;             //xor1 with the remaining N(last element); 
        return xor1 ^ xor2;          //xor1 and xor2;
    }
}
