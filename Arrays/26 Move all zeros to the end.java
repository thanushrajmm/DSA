Problem link : [ https://bit.ly/3XbsF6k]
Example :
Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
Output: [1, 2, 2, 3, 0, 0]
public class Solution {
        
        public static int[] moveZeros(int n, int []a) {
        //step-1
        int j = -1;
        for(int i = 0; i<n;i++ ){
            if(a[i]==0){
                j = i;
                break;
            }
        }
        if(j==-1) return a;
        //step-2
        for(int i = j+1; i<n; i++){
            if(a[i]!=0){
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
}
