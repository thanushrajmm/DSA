Problem Link : [ http://bit.ly/3IQQdrt ] ->left rotate
Example:
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [5,1,2,3,4]
'k' = 2  rotated array = [5,4,1,2,3]
'k' = 3  rotated array = [5,4,3,1,2] and so on.

class Solution {
    public static void rightRotate(ArrayList<Integer> nums, int k){
        int n = nums.size();
        if(n == 0) return;
        k = k%n;
        if(k==0) return;

        Collections.reverse(nums);              //reverse the array the first 
        Collections.reverse(nums.subList(0,k)); //reverse from 0 -> K;
        Collections.reverse(nums.subList(k,n)); //reverse from K-> N;
    }

    public void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        rightRotate((ArrayList<Integer>) list, k);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);             //at last updating the original array
        }
    }
}
