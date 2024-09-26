// Time Complexity : O(n*n) : n -> size of array
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : TimeLimit Exceeded
// Any problem you faced while coding this : No

package problem2;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubarray {
	public int findMaxLength(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}

		int n = nums.length;
		int ans = 0;
		int rSum = 0;
		Map<Integer, Integer> runningSumMap = new HashMap<Integer, Integer>();

		// To handle edge cases like [0,1]
		runningSumMap.put(0, -1);

		for (int i = 0; i < n; i++) {
			rSum += (nums[i] == 0) ? -1 : 1;
			if (runningSumMap.containsKey(rSum)) {
				ans = Math.max(ans, i - runningSumMap.get(rSum));
			} else {
				runningSumMap.put(rSum, i);
			}
		}
		return ans;
	}
	/* ---------------------------- BruteForce --------------------------------- */
	/*
	 * Traverse through the array, keeping count of the number of zeroes and ones
	 * from index i to j. If they are equal, increment count.
	 */
	/*
	 * public int findMaxLength(int[] nums) { if (nums == null || nums.length == 0)
	 * { return 0; }
	 * 
	 * int n = nums.length; int ans = 0;
	 * 
	 * for (int i = 0; i < n; i++) { int zeroCnt = 0; int oneCnt = 0; for (int j =
	 * i; j < n; j++) { if (nums[j] == 0) { zeroCnt++; } else { oneCnt++; }
	 * 
	 * if (zeroCnt == oneCnt) { ans = Math.max(ans, j - i + 1); } } } return ans; }
	 */

	public static void main(String[] args) {
		ContiguousSubarray obj = new ContiguousSubarray();
		System.out.println("Maximum Length of contiguous subarray or 0s and 1s = "
				+ obj.findMaxLength(new int[] { 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0 }));
	}

}
