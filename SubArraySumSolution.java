/*
Time Complexity : O(n)
Space Complexity : O(n)

Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

*/

import java.util.*;
public class SubArraySumSolution {
	public static void main (String args[]) {
		int[] a = {1,2,3};
		System.out.println("Subarray Sum:"+ subarraySum(a, 3) );

	}

	public static int subarraySum(int[] nums, int k) {
		if(nums==null || nums.length==0) {
			return 0;
		}
    	int count=0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0,1);
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
			if(map.containsKey(sum-k)) {
				count+=map.get(sum-k);

			}
			map.put(sum,map.getOrDefault(sum,0)+1);
		}
		return count;
    }

}