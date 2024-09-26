package com.javadwarf.leetcode.subarray;

import java.util.HashMap;
import java.util.Map;

public class _525_ContiguousArray {

	public static void main(String[] args) {

	}

	public int findMaxLength(int[] nums) {


		if (nums==null || nums.length==0) return 0;

		int result = 0;

		int currCount  = 0;

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);//very important step to take care of subarray starting at index 0

		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 1) {
				currCount += 1;
			}
			else {
				currCount -= 1;
			}

			map.putIfAbsent(currCount, i);
			if(map.containsKey(currCount)) {
				result = Math.max(result,i-map.get(currCount));
			}
		}
		return result;


	}

	public int findMaxLength1(int[] nums) {

		if (nums==null || nums.length==0) return 0;

		int result = 0;

		int oneCount  = 0;
		int zeroCount  = 0;

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);//very important step to take care of subarray starting at index 0

		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) {
				zeroCount += 1;
			}
			else {
				oneCount += 1;
			}
			int diff = oneCount - zeroCount;
			map.putIfAbsent(diff, i);
			if(map.containsKey(diff)) {
				result = Math.max(result, i-map.get(diff));
			}
		}
		return result;

	}

}
