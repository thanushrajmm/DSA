import java.util.HashSet;
import java.util.Set;

public class Main { 

    public static void rem_dup(int[] arr, int n){
        Set hashset = new HashSet<>();            //Using Hashset stores only the unique elements 
        for(int i = 0; i<n; i++){
            hashset.add(arr[i]);
        }
        
        System.out.println(hashset);
    }
    public static void main(String[] args) { 
        int[] arr = {10,10, 40, 50,50,60, 20, 10, 20, 30, 10, 60, 80};
        int n = arr.length;
        rem_dup(arr, n);
       
  }
}

O/P:
[80, 50, 20, 40, 10, 60, 30]
------------------------------------------------------------------------------
   Problem Link = [https://leetcode.com/problems/contains-duplicate/]
    Contains Duplicate: 
    class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
        if(set.contains(num)){
            return true;
        }
        else {
            set.add(num);
        }
    }
            return false;
    }
}
---------------------------------------------------------------------------------
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();

	int[] arr = new int[n];
	for(int i = 0; i<n; i++){
		arr[i] = sc.nextInt();
	}
	HashSet<Integer> set = new HashSet<>();

	for(int i=0; i<n; i++){
		set.add(arr[i]);
	}

	Integer[] result = set.toArray(new Integer[0]);
	System.out.print(Arrays.toString(result));
	
	}
}
