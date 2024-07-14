Problem link : [http://bit.ly/3KSSx3Z]

Example :int A[]= {1,2,3,3,4,5,6,7};
  int B[]= {3,3,4,4,5,8};
O/P : 3 3 4 5

public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		n = arr1.size();
		m = arr2.size();
		int i = 0;
		int j = 0;

		ArrayList<Integer> ans = new ArrayList<>();

		while(i<n && j<m){
			if(arr1.get(i)<arr2.get(j)){
				i++;
			}
			else if(arr2.get(j)<arr1.get(i)){
				j++;
			}
			else{
				ans.add(arr1.get(i));
				i++;
				j++;
			}
		}
		return ans;
	}
}
