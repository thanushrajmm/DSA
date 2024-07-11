
import java.util.Arrays;
import java.util.HashSet;
class Main{

   static boolean isSubset(int arr1[], int arr2[], int m, int n)
    {
        HashSet set = new HashSet<>();      //creating Hashset to store unique values
 
        for (int i = 0; i < m; i++) {
                set.add(arr1[i]);           //Add elements in set from arr1
        } 
        for (int i = 0; i < n; i++)
        {
            if (!set.contains(arr2[i]))     //if the set not contains elements of arr2
                return false;               //if no return false
        }
        return true;                        //if yes return true
    }
  
    public static void main(String args[])
    {
        int arr1[] = { 11, 10, 13, 21, 30, 70 };
        int arr2[] = { 11, 30, 70, 10,5 };
    
        int m = arr1.length;
        int n = arr2.length;
        
        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print("arr2[] is not subset of arr1[] ");
 
    }
} 
