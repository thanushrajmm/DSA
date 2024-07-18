problem link -> [https://www.geeksforgeeks.org/problems/merge-sort/0]
class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         ArrayList<Integer> temp = new ArrayList<>();   //create a arraylist named temp to store the elements;
         int left = l;                   //storing low in left;     
         int right = m+1;                //storing mid+1 in right;
         while(left<=m && right<=r){     //while left is than mid and mid+1 is less than high; 
             if(arr[left]<=arr[right]){  //check if arr[left] is less than arr[right]; 
                 temp.add(arr[left]);    //add arr[left] in temp;
                 left++;    
             }
             else{                       //else
                 temp.add(arr[right]);   //add arr[right] in temp;
                 right++;
             }
         }
         while(left<=m){                 //if any element is left in left till mid;
             temp.add(arr[left]);        //add arr[left] in temp;
             left++; 
         }
         while(right<=r){                //if any element is left in right till high;
             temp.add(arr[right]);       //add arr[right] in temp;
             right++;
         }
         for(int i = l; i<=r; i++){      //place the elements in temp back in arr;
             arr[i] = temp.get(i-l);
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //this functions divides the array low to mid & mid+1 to high;
        if(l>=r) return;                  //base condition if low>=high;
        int mid = (l+r)/2;                //find the middle;
        mergeSort(arr,l,mid);             //from low to mid;
        mergeSort(arr,mid+1,r);           //from mid+1 to high;
        merge(arr,l,mid,r);               //merge function called to merge.(low,mid,high);
    }
}
