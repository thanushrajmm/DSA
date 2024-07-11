    public static int minimumAbsoluteDifference(List<Integer> arr) {
    int n = arr.size();
    Collections.sort(arr);
        int minAbsDifference = Integer.MAX_VALUE; // to track the minimum absolute difference
        
        for (int i = 1; i < n; i++) {
            int diff = Math.abs(arr.get(i) - arr.get(i-1));   
            if (diff < minAbsDifference) {
                minAbsDifference = diff;
            }
        }
        return minAbsDifference;
    }
}
