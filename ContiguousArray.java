package day6;

import java.util.*;

//Time complexity : O(n) Array is completely traversed once.
//Space complexity :O(n) Size of the HashMap will be n.
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :no
public class ContiguousArray {

	public static int findMaxLength(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<>();
		int maxlen = 0;
		int zero = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) {
				// increment the count of zero when we encounter a 0.
				zero++;
			}
			// decrement the count of zero when we encounter a 1.
			else zero--;
			// if the value of zero becomes 0, it means it has equal number of 0s and 1s.
			// and we calculate max length by corresponding index.
			if(zero == 0) maxlen = i + 1;
			// we check if map has occurrence of any previous contiguous array 
			if(!map.containsKey(zero)) map.put(zero,  i);
			else maxlen = Math.max(maxlen, i - map.get(zero));
		}
		
		return maxlen;
		
		//Time complexity : O(n) Array is completely traversed once.
		//Space complexity :O(n) Size of the HashMap will be n.
		//Did this code successfully run on Leetcode : yes
		//Any problem you faced while coding this :no
		
		/*	Map<Integer, Integer> map = new HashMap<>();
		// Initalization of hashmap
		map.put(0, -1);
		int maxlen = 0;
		int count = 0;
		// If element is 1 then increment count by 1, else decrement by 1
		// if count is 0, then map already contains key as 0 so calculate the length of
		// subarray= current index(i) - initial index(-1) which is value of key 0 in
		// hashmap
		for (int i = 0; i < nums.length; i++) {
			 
			count = count + (nums[i] == 1 ? 1 : -1);
			
			// compare length with maxlen of subarray
			if (map.containsKey(count)) {
				maxlen = Math.max(maxlen, i - map.get(count));
			} else {
				// if count value do not contain inn hashmap then store count and index in
				// hashmap
				map.put(count, i);
			}
		}
		// returns maxmimum length of subarray
		return maxlen;  */
	}
}
