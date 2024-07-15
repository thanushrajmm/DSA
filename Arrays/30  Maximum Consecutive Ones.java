problem link : [http://bit.ly/3ZFZji5]

For Example:
ARR = [0, 1, 1, 0, 0, 1, 1, 1], here you can see the maximum length of consecutive 1’s is 3. Hence the answer is 3.
  
public class Solution {
	public static int consecutiveOnes(int n, int[] arr) {
		// Write your code here.
		int count = 0;
		int maxi = 0;
		for(int i = 0; i<n; i++){
			if(arr[i]==1){
				count++;
				maxi = Math.max(count, maxi);
			}
			else
			count = 0;
		}
		return maxi;
	}
}
