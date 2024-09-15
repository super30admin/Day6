package Hashing2;
//Time Complexity : o(n)
//Space Complexity :o(n)
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this :No

import java.util.HashMap;

//Your code here along with comments explaining your approach
//running sum pattern - when contigous subarrays has to be calculated
//when 1 encountered add 1 to rsum and sub 1 from rsum is 0 encountered
//if rsum occured previously in set, from that index balanced subarray will be present


public class ContigousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,0,1,0,1,1,1,1};
		int count = findCountInContigousArray(nums);
		
		System.out.println(count);
	}

	private static int findCountInContigousArray(int[] nums) {
		// TODO Auto-generated method stub
		
		if(nums == null || nums.length == 0) return 0;
		int count = 0;
		int rSum = 0;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, -1);
		for(int i=0;i<nums.length; i++) {
			rSum = nums[i] == 0 ? rSum-1 : rSum+1;
			if(!map.containsKey(rSum)) {
				map.put(rSum, i);
			}else {
				count = Math.max(count, i-map.get(rSum));
			}
		}
		return count;
	}

}
