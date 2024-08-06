Problem Link -> [https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort]

class Solution
{
	int  select(int arr[], int i)
	{
            int mini = i;
            for(int j = i+1; j<arr.length; j++ ){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
        return mini;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i<n-1; i++){
	        int mini = select(arr,i);
	        int temp = arr[mini];
	        arr[mini] = arr[i];
	        arr[i] = temp;
	    }
	}
}
TC -> O(n^2);
SC -> O(1);
