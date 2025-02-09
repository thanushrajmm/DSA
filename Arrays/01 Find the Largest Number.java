Practice link -> [https://bit.ly/3Pld280]
Example 1:
Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90.

brute force : O(nlogn)
    class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }
}

optimised: O(n)
class Compute {
    
    public int largest(int arr[], int n){
        int large = arr[0];          //assume large = arr[0]
        for(int i = 0; i<=n-1; i++){
            if(arr[i] > large){      //if there is something greater than arr[0]
            large = arr[i];          //then assign large to it.
            }
        }
        return large;
    }    
}
