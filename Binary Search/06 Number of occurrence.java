problem link -> [ https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1 ]
class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int lowbound = lowboundindex(arr,x);
        int upperbound = upperboundindex(arr,x);
        int count = upperbound - lowbound + 1;
        
        if(lowbound == -1 && upperbound ==-1){
            return 0;
        }
        return count;
    }
    
    int lowboundindex(int[] arr, int x){
        int s = 0;
        int e = arr.length-1;
        int index =-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == x){
                index = mid;
                e = mid-1;
            }
            else if(arr[mid]>=x){
                e = mid -1;
            }
            else{
                s = mid+1;
            }
        }
        return index;
    }
    
    int upperboundindex(int[] arr, int x){
        int s = 0;
        int e = arr.length-1;
        int index =-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == x){
                index = mid;
                s = mid +1;
            }
            else if(arr[mid]>x){
                e = mid -1;
            }
            else{
                s = mid+1;
            }
        }
        return index;
    }
}
