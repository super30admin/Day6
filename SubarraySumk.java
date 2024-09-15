package Hashing2;
//Time Complexity : o(n)
//Space Complexity :o(n) 
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this :No

import java.util.HashMap;

//Your code here along with comments explaining your approach
//running sum pattern is used, * z-y = k *


public class SubarraySumk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,2,3};
		int k = 3;
		int count = findSubarraySumEqualsk(nums,k);
		
		System.out.println(count);
	}

	private static int findSubarraySumEqualsk(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int rSum = 0;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0,1);
		
		for(int i =0;i<nums.length;i++) {
			rSum = rSum + nums[i];
			if(map.containsKey(rSum -k)) {
				count += map.get(rSum-k);
			}else {
				map.put(rSum, map.getOrDefault(rSum,0) +1);
			}
		}
		
		return count;
	}

}
