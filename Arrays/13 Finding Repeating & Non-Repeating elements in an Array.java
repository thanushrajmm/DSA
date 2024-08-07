import java.util.Arrays;
import java.util.HashMap;

import javax.swing.RowFilter.Entry;

public class Main { 

    public static void count_freq(int[] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            map.put(arr[i], 1);
        }
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet() ){
            if(entry.getValue()>1){                                  //Checking the values that occurs more than 1 time(Repeating) 
                System.out.println(entry.getKey()+" ");              //Then printing the key of it.
            }
            if(entry.getValue()==1){                                //Checking for non-repeating values.
                System.out.println(entry.getKey()+" "); 
            }
        }
    }
    public static void main(String[] args) { 
        int[] arr = {10,10, 40, 50,50,60, 20, 10, 20, 30, 10, 60, 80};
        int n = arr.length;
        count_freq(arr, n);
  }
}

O/P:
50 
20 
10
60
