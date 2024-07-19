Method - 1: Time Complexity -> O(N*N)
class Main
{
   public static void main(String[] args) {
    int[] arr = {10,20,30,10,20,30,40,50,30,20,10};
    int[] freq = new int[arr.length];               //Declaring another array -> freq

    for(int i = 0; i<arr.length;i++){             
        int count = 1;                             //initialising count as 1; because the number occurs atleast once;
        for(int j = i+1; j < arr.length; j++ ){
            if(no == arr[j]){                      //checking if the no==arr[j]
                count++;                           //if yes increment count;
                freq[j] = -1;                      //mark the place of freq[j] as -1;
            }
        }
        if(freq[i]!=-1){                           //if freq[i] is not equal to -1;
        freq[i] = count;                           //update freq[i] as count;  
        }
    }
        for(int i = 0; i<arr.length; i++){
            if(freq[i]>0)                         //if freq[i] is greater than 0 print the values.
            System.out.println(arr[i]+" occurs "+freq[i]+" times ");
        }
}
}
---------------------------------------------------------------------------
Method 2 using Hashmap: Time Complexity -> O(N)

import java.util.HashMap;
import java.util.Map;

class Main
{
   public static void main(String[] args) {
    int[] arr = {10,20,30,10,20,30,40,50,30,20,10};

    Map<Integer,Integer> map = new HashMap<>();      //Creating a Map;
    for(int i = 0; i<arr.length;i++){                //iterating through the array;
        if(map.containsKey(arr[i])){                 //checking if arr[i] is already a key in Map;
            map.put(arr[i], map.get(arr[i])+ 1);     //if yes, updating the frequency value with + 1;
        }
        else{
            map.put(arr[i], 1);                      //if no, frequency is 1;
        }
    }
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        System.out.println(entry.getKey()+ "  " + entry.getValue()+ "  ");
    }
  
}
}

