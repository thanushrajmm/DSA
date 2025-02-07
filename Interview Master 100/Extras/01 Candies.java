link -> https://www.hackerrank.com/challenges/candies/problem
public static long candies(int n, List<Integer> arr) {
    // Write your code here
    int[] candies = new int[n];
    Arrays.fill(candies,1);
    
    for(int i = 0; i<n-1; i++){
        if(arr.get(i+1) > arr.get(i)){
            candies[i+1] = candies[i] + 1;
        }
    }
    
    for(int i = n-1; i>0; i--){
        if(arr.get(i-1) > arr.get(i) && candies[i-1] <= candies[i] ){
            candies[i-1] = candies[i] + 1;
        }
    }
    
    long sum = 0;
    for(int i = 0; i<n; i++){
        sum+= candies[i];
    }
    return sum;
    }
