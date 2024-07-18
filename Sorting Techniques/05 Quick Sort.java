class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high){
            int pIndex =partition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            } 
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp1;
        return j;
    } 
}
