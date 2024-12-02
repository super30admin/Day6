// Time Complexity : O(n)  n=number of elements in input Array.
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


import java.util.HashMap;
import java.util.Map;

class SubArraySum {
	public static int subarraySum(int[] nums, int k) {
		int size = nums.length;
		int rSum = 0;
		int count = 0;
		int search;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < size; i++) {
			rSum += nums[i];
			search = rSum - k;
			if (map.containsKey(search)) {
				count += map.get(search);
			}
			if (map.containsKey(rSum)) {
				map.put(rSum, map.get(rSum) + 1);
			} else {
				map.put(rSum, 1);
			}
		}
		return count;
	}
}