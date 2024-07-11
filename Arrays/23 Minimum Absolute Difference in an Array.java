1. Minimum Absolute difference:
public static int minimumAbsoluteDifference(List<Integer> arr) {
    int n = arr.size();
    Collections.sort(arr);
        int minAbsDifference = Integer.MAX_VALUE; 
        
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i-1));   //using Math.abs to find the minimum value ( (i)-(i-1) ) 
            if (diff < minAbsDifference) {                    //if the diff is less than minAbsDiff 
                minAbsDifference = diff;                      //put diff in minAbsDiff
            }
        }
        return minAbsDifference;                              //return minAbsDiff
    }
}

---------------------------------------------------------------------------------------------------
2. Sum of Minimum Absolute Difference:
    public static int sumOfMinAbsDifferences(List<Integer> arr) {
    Collections.sort(arr);
    int sum = 0;                                    //initially the sum is 0
    for (int i = 1; i < arr.size(); i++) {          
        sum += Math.abs(arr.get(i) - arr.get(i-1)); //adding the value of ( (i)-(i-1) ) to sum
    }
    return sum;                                      //then returning the sum.
}
