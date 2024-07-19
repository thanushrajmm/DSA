//[4, 2, 7, 3, 8, 5, 1]
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
        int pivot = arr[low];                        // Select a pivot;
        int i = low;                                 //set i pointer in low;
        int j = high;                                //set j pointer in high;
        
        while(i<j){                                  //till i<j loop runs
            while(arr[i]<=pivot && i<=high-1){       //if arr[i]<=pivot and i<=high-1;
                i++;                                 //increment the i pointer;
            } 
            while(arr[j]>pivot && j>=low+1){         //if arr[j]>pivot and j>=low+1;
                j--;                                 //decrement j pointer;
            }
            if(i<j){                                 //swap arr[i] and arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp1 = arr[low];                        //after the i becomes greater than j;
        arr[low] = arr[j];                          //swap arr[low](pivot) and arr[j];
        arr[j] = temp1;
        return j;
    } 
}
