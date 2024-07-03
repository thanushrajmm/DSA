Practice link - [https://www.geeksforgeeks.org/problems/sort-first-half-in-ascending-and-second-half-in-descending1714/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article]

Example 1:

Input:
n = 4
arr[] = {10, 20, 30, 40}
Output: 10 20 40 30
Example 2:

Input:
n = 9
arr[] = {5, 4, 6, 2, 1, 3, 8, 9, 7}
Output: 2 4 5 6 9 8 7 3 1

Solution:
class Solution {
    void customSort(int[] arr, int n) {
        
        Arrays.sort(arr,0,n/2); //sorting first half
        Arrays.sort(arr,n/2,n); //sorting Second half
        //reversing later half
        int i = n/2;           //i starts from middle   
        int j = n-1;           //j starts from last
        
        while(i<=j){           //till i becomes greater than j the loop runs  
            int temp = arr[i]; //store i -> temp 
            arr[i] = arr[j];   //then store j -> i
            arr[j] = temp;     //then store temp -> j
            
            i++;               //increment i
            j--;               //decrement j
        }
    }
 }
