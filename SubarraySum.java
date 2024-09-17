/** Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
* Maintain a map of running sum and its occurance. At each index, compute the difference between the running sum and target. If the difference exist in the map, then add the value of that to the count. It means if we find the same value in the map as the difference, then the sum of elements between those 2 points is the target.
* Time and space complexity is O(n)
*/
import java.util.HashMap;

public class SubarraySum {
	public int subarraySum(int[] nums, int k) {
		if (nums == null || nums.length == 0)
			return 0;
		HashMap<Integer, Integer> rsumCnt = new HashMap<Integer, Integer>();
		int rsum = 0;
		int count = 0;
		int difference = 0;
		rsumCnt.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			rsum = rsum + nums[i];
			difference = rsum - k;
			if (rsumCnt.containsKey(difference)) {
				count = count + rsumCnt.get(difference);
			}
			if (rsumCnt.containsKey(rsum)) {
				int cnt = rsumCnt.get(rsum);
				cnt = cnt + 1;
				rsumCnt.put(rsum, cnt);
			} else {
				rsumCnt.put(rsum, 1);
			}

		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1 };
		SubarraySum sum = new SubarraySum();
		int subsum = sum.subarraySum(arr, 0);
		System.out.println("the subsum is  " + subsum);

	}
}
