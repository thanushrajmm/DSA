import java.util.*;
 
class Main
{
 static boolean Disjoint(int arr1[], int arr2[])
    {
       HashSet set = new HashSet<>();     //create a hashset - it stores unique values
 
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);             //add arr1 in set  
        }            
 
        for (int i=0; i<arr2.length; i++){
            if (set.contains(arr2[i])){   //check if any arr2 elements are there in set
                return false;             //if no return false
            }            
        }
        return true;                       //if yes return true
    }
 
    public static void main (String[] args)
    {
        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {80, 71, 29,};
        
        if (Disjoint(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
