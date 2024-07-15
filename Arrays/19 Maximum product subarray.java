Practice link: [https://bit.ly/3VPdyyq]

Example:
Sample Input 1:
4
1 -2 3 -4
Sample Output 1:
24

Solution: 
public class Solution {
    public static int subarrayWithMaxProduct(int []arr){
        double pre = 1; int suf =1;     //initialize pre and suff as 1;
        double ans = Integer.MIN_VALUE; 
        double n = arr.length;
        for(int i =0; i<n;i++){
            if(pre==0) pre = 1;     //if pre and suff becomes 0 then reset the value to 1; 
            if(suf ==0) suf =1;
            pre = pre*arr[i];       //pre multiplies from starting of the array
            suf = suf*arr[n-i-1];   //suff multiplies from end of the array
            ans = Math.max(ans,Math.max(pre,suf)); //compare the pre and suff max, then compare it with ans.
         }
            return (int)ans;    //return the max value
    }
}
