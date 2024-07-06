Practice link -> [https://bit.ly/3pFvBcN]

Example 1:
Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.

class Solution {
    int print2largest(int arr[], int n) {
        
        int largest = arr[0];        //assume largest = arr[0]
        int seclargest = -1;         //assume seclargest = -1
        for(int i = 0; i<=n-1; i++){
            if(arr[i] > largest){    //if there is someting greater than arr[0]
                seclargest = largest; //assign largest to seclargest; 
                largest = arr[i];     //then assign the largest to arr[i]
            }
            else if (arr[i]<largest && arr[i] > seclargest){ //if arr[i] is less than largest and arr[i] is greater than seclargest 
                seclargest = arr[i];                         // assign seclargest to arr[i];
            }
        }
            return seclargest;
    }
}
