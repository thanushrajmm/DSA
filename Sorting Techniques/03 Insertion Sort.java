Problem link -> [https://www.geeksforgeeks.org/problems/insertion-sort/0]
class Solution
{
  static void insert(int arr[],int i)
  {
       int n = arr.length;
       for(int k=0; k<=n-1; k++){
           int j=k;
           while( j>0 && arr[j-1]>arr[j]){
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
               j--;
           }
       }
       for(int m =0; i<n; i++){
           System.out.print(arr[m]);
       }
  }
  public void insertionSort(int arr[], int n)
  {
      insert(arr,n);
  }
}
