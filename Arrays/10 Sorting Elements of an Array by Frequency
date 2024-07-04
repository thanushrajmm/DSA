Practice Link -> [https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency/0]
Example:
Input:
2
5
5 5 4 6 4
5
9 9 9 2 5

Output:
4 4 5 5 6
9 9 9 2 5

Solution:
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void sort(List<Integer>list, int n){  //sort function
        HashMap<Integer,Integer>map=new HashMap<>();    //storing the frequency of elements using Hashmap    
        for(int i = 0; i<n; i++){
            if(map.containsKey(list.get(i))){            
                map.put(list.get(i),map.get(list.get(i))+1);
            }
        
            else{
                map.put(list.get(i),1);
            }
        }
        
        Collections.sort(list, new Comparator<Integer>(){  //as we are using list, Collections.sort does the job;
            public int compare(Integer a, Integer b){      //comparing Integer a & Integer b;
                Integer freq1 = map.get(a);                //storing value of (a) from map in freq1
                Integer freq2 = map.get(b);                //storing value of (b) from map in freq2                    
                if(freq1!=freq2){                          //if freq1 is not equal to freq2
                    return freq2 - freq1;                  //sort in descending order
                }
                else{
                    return a - b;                          //else sort the values in ascending order;
                }
            }
        });
        for(int i = 0; i<n;i++){
            System.out.print(list.get(i)+ " ");            //print the list;
        }
    }
	public static void main (String[] args)
	 {
	 //code
	 Scanner s=new Scanner(System.in);            
	 int t = s.nextInt();                          //how many arrays needed
	 for(int i = 0; i<t;i++){
	     int n = s.nextInt();                      //how many elements in the array needed
	     Integer[] arr = new Integer[n];
	     for(int j = 0; j<n; j++)
	         arr[j] = s.nextInt();                //Storing the input value in array
	         List<Integer>list = Arrays.asList(arr); //Converting the arrays to a list for collections.sort
	         sort(list,n);                       //calling sort function
	         System.out.println();
	     }
	 }
}
