Problem link : [http://bit.ly/3mNSZ9u]
Example :
Input: ‘n’ = 7 ‘k’ = 3
‘a’ = [1, 2, 3, 1, 1, 1, 1]

Output: 3
Explanation: Subarrays whose sum = ‘3’ are:
[1, 2], [3], [1, 1, 1] and [1, 1, 1]

Example:
Input: ‘N’ = 5,  ‘K’ = 4, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]
Output: 4
There are two subarrays with sum = 4, [1, 2, 1] and [2, 1, 0, 1]. Hence the length of the longest subarray with sum = 4 is 4.

public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        int n = a.length;
        long sum = 0;
        int maxLen = 0;

        for(int i = 0; i<n; i++ ){
            sum = sum + a[i];             //sum the Array elements one by one.

        if(!preSumMap.containsKey(sum)){  //check if the hashmap contains sum value.
            preSumMap.put(sum, i);        //if not add it.
        }
        
        if(sum == k){                       //if sum value and k value are equal 
            maxLen = Math.max(maxLen,i+1);  //check the the maxlen and update the maxlen value
        }

        long rem = sum - k;                //find the remaining by sum - k.

        if(preSumMap.containsKey(rem)){     //if rem value present in map
            int len = i - preSumMap.get(rem); //subtract the current index and the previous rem value index 
            maxLen = Math.max(maxLen, len);  // update the max length.
        }
        }
        return maxLen;                    //atlast return the max value 
    }
