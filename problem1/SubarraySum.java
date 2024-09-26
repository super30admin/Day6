// Time Complexity : O(n) : n -> size of array
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Figuring out edge case

package problem1;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
	/* ------------------------- BruteForce ----------------------------- */
	/*
	 * public int subarraySum(int[] nums, int k) { if (nums == null || nums.length
	 * == 0) { return 0; }
	 * 
	 * int n = nums.length; int cnt = 0;
	 * 
	 * for (int i = 0; i < n; i++) { int sum = 0; for (int j = i; j < n; j++) { sum
	 * += nums[j]; if (sum == k) { cnt++; } } } return cnt; }
	 */

	/*
	 * Use hashmap to store the prefix sum. If a key with the sum - target already
	 * exists, increment count.
	 */
	public int subarraySum(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int n = nums.length;
		Map<Integer, Integer> ans = new HashMap<Integer, Integer>();
		int cnt = 0;
		int sum = 0;
		ans.put(0, 1);
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			if (ans.containsKey(sum - k)) {
				cnt += ans.get(sum - k);
			}
			ans.put(sum, ans.getOrDefault(sum, 0) + 1);
		}
		return cnt;
	}

	public static void main(String[] args) {
		SubarraySum obj = new SubarraySum();
		System.out.println(
				"Number of subarrays with sum = 3: " + obj.subarraySum(new int[] { 1, 2, 3, -1, -2, 5, 2 }, 3));
	}

}
