class Demo{
    static void printArray(int arr[],int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]);    
        }
    }

    static void printReverse(int arr[], int start, int end){
        if(start<end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           printReverse(arr, start+1, end-1);//after swap increment start+1; decrement end-1;          
        }
    } 
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {5,4,3,2,1};
        printReverse(arr,0, n-1); //initialize start = 0; end = n-1;
        printArray(arr,n);
    }
}
