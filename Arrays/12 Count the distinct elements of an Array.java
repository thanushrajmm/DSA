import java.util.Arrays;
import java.util.HashMap;

public class Main { 

    public static void count_freq(int[] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>(); //HashMap to count frequencies
        for(int i =0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            map.put(arr[i], 1);
        }
        System.out.println(map.size());                //Getting the size of map
    }
    public static void main(String[] args) { 
        int[] arr = {10,10, 40, 50, 20, 10, 20, 30, 10, 60, 80};
        int n = arr.length;
        count_freq(arr, n);
  }
}

O/P:
7
