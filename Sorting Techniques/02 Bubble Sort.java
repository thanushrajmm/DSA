Problem Link -> [https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort]
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i = n-1; i>= 1; i--){
            int didSwap = 0;
            for(int j = 0; j<= i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
        if(didSwap == 0)
        break;
        }
    }
}
TC -> O(n^2);
SC -> O(1);
