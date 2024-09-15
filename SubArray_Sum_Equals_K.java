
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.HashMap;
import java.util.Arrays;

class SubArray_Sum_Equals_K {
	public static int subarraySum(int[] nums, int k) {
		/*
		 * HashMap is created of key and value as Integer
		 */
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int result = 0;
		int sum = 0;
		// Initially a key of 0 and a value of 1 is inserted into HashMap
		hmap.put(0, 1);
		/*
		 * We loop through the entire nums array and calculate the sum at each index,
		 * and check if the hashmap contains the difference between the sum and the
		 * k(target), if it is present, we simply get the value and increment the result
		 * by 1. In the end we insert the sum as key and 1 as value into the HashMap
		 */
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (hmap.containsKey(sum - k)) {
				result += hmap.get(sum - k);
			}
			hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1 };
		int k = 2;
		int count = subarraySum(nums, k);
		System.out.println(Arrays.toString(nums));
		System.out.println("Target: " + k);
		System.out.println("Total Number of continuous subarrays equal to target: " + count);
	}
}