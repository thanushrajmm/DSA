import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
       int low=0;
      int high=n-1;
      int[] ans={-1,-1};
      while(low<=high)
      {
        int mid=(low+high)/2;
        if(a[mid]==x)
        {
          ans[0]=x;
          ans[1]=x;
          return ans;
        }
        else if(a[mid]<x)
        {
          ans[0]=a[mid];
          low=mid+1;
        }
        else
        {
          ans[1]=a[mid];
          high=mid-1;
        }
      }
      return ans;
    }
} 
