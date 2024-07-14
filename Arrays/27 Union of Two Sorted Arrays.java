1. Brute Force - using Hashset 
  Time Compleixty : O( (m+n)log(m+n) ); 
  Space Complexity : O(m+n);

public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        HashSet<Integer> Union = new HashSet<>();
        
        for(int j = 0; j<a.length; j++){
            Union.add(a[j]);                //add the unique elements from arr1 to union
        }
        for(int j = 0; j<b.length; j++){
            Union.add(b[j]);                //add the unique elements from arr2 to union
        }
      ArrayList<Integer> s = new ArrayList<>();
        for(int it : Union ){
            s.add(it);                      //itterate and add all the elements from set to list.
        }
        Collections.sort(s);                //sort the list
        return s;
    }
}
------------------------------------------------------------------------------------------------------
2. Optimal Solution - Two Pointer approach.
  TC -> O(m+n)
  Space Complexity : O(m+n)

  public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
       int n1 = a.length;
       int n2 = b.length;
       int i = 0;
       int j = 0;
       ArrayList<Integer> Union = new ArrayList<>();
       while(i<n1 && j<n2){
           if(a[i] <= b[j]){
               if(Union.size()==0 || Union.get(Union.size()-1) != a[i] )     
               Union.add(a[i]);
           }
           i++;
           else{
               if(Union.size()==0 || Union.get(Union.size()-1) != b[j])
               Union.add(b[j]);
           }
            j++;
       }
       while(i < n1){
           if(Union.get(Union.size()-1 != a[i]))
           Union.add(a[i]);
             i++;
       }
      
        while(j < n2){
           if(Union.get(Union.size()-1 != b[j]))
           Union.add(b[j]);
             j++;
       }
     
       return Union;
    }
}
