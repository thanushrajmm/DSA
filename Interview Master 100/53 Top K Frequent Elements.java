link -> https://leetcode.com/problems/top-k-frequent-elements/
TC - O(nlogn)
SC - O(N)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+ 1 );
            } 
            else{
                map.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        int[] sortedKeys = new int[k];
        for (int i = 0; i <k; i++) {
            sortedKeys[i] = entryList.get(i).getKey();
        }
        return sortedKeys;
    }
}
---------------------------------------------------------------------------------------------------------
  TC - O(nlogk)
  SC - O(N)
  class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+ 1 );
            } 
            else{
                map.put(nums[i],1);
            }
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
        );

        for(int n : map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i<k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }
}
