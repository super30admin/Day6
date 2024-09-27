import java.util.*;

//Time Complexity : o(n) - total no of elements
//Space Complexity : o(n)
//Did this code successfully run on Leetcode : yes
public class SubArraySunEqualsK {

	public int subarraySum(int[] nums, int k) {

		if (nums == null || nums.length == 0)
			return 0;
		int count = 0, rSum = 0;
		// key - running sum, val - count
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			rSum += nums[i];
			// check map contains the complement
			int comp = rSum - k;
			if (map.containsKey(comp)) {
				// add no of counts to result
				count += map.get(comp);
			}
			// add or increase count for particular running sum for next iteration
			map.put(rSum, map.getOrDefault(rSum, 0) + 1);
		}
		return count;
	}

}
