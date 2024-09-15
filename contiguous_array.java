
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.Arrays;
import java.util.HashMap;

public class contiguous_array {
	public static int findMaxLength(int[] nums) {
		/*
		 * HashMap is created of key and value as Integer
		 */
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int count = 0;
		int max_length = 0;
		// Initially a key of 0 and a value of -1 is inserted into HashMap
		hmap.put(0, -1);
		/*
		 * We loop through the entire array, and whenever we encounter a 0 we decrement
		 * count by 1 or otherwise increment count by 1, we then check if the hashmap
		 * contains the count, if it does we compare our present max_length with our new
		 * calculated length and, if our new length is greater, then we assign it to
		 * max_length, else max_length remains the same
		 */
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count = count - 1;
			}
			if (nums[i] == 1) {
				count = count + 1;
			}
			if (hmap.containsKey(count)) {
				max_length = Math.max(max_length, i - hmap.get(count));
			} else {
				hmap.put(count, i);
			}
		}
		// In the end, longest contiguous max length is returned
		return max_length;
	}

	public static void main(String[] args) {
		int nums[] = { 0, 1, 0, 0, 1, 1, 0 };
		int max_length = findMaxLength(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(max_length);
	}

}