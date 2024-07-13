1. Using a temp Variable; //brute force (takes O(K) space complexity. 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        int n = arr.length;
        int[] temp = new int[d]; //temp arr to store the values of the elements that needs to be rotated
        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }

        for(int i = 0; i<n-d; i++){ //storing the remaining elements in the arr[i] index starting from 0;
            arr[i] = arr[i+d];
        }
        int j = 0;
        for(int i = n-d; i<n; i++){
            arr[i] = temp[j];      //storing the temp arr values to the end i.e from index arr[n-d];     
            j++;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" "); 
        }
    }
}
--------------------------------------------------------------------------------------------------------------------
  
