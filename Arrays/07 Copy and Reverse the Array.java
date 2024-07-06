Practice Link : [https://www.naukri.com/code360/problems/copy-and-reverse-the-array_1058196?interviewProblemRedirection=true&attempt_status=COMPLETED&leftPanelTabValue=PROBLEM]
If 'ARR' contains the following elements [ 1, 2, 3, 4, 5 ], then you should return another array that is equal to [ 5, 4, 3, 2, 1].

Solution:
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] copyAndReverse(int[] arr, int n) {
        // Write your code here.
    n = arr.length;
    int i = 0;
    int j = n-1;
    int[] COPY_ARR = new int[n]; //Creating a new Array COPY_ARR[]. Size of the Array will be same as arr[]
    while(i<arr.length){
        COPY_ARR[i] = arr[j];     
        i++;
        j--;
    }
    return COPY_ARR;
    }
}
