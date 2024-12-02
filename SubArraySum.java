//Time Complexity : O(n)
//Space Complexity : O(n)
//Code run successfully on LeetCode.

import java.util.HashMap;

public class SubArraySum {

	public int subarraySum(int[] nums, int k) {
		   
		   if(nums == null || nums.length == 0)
			   return 0;
		   
		   int diff;
		   int rsum =0;
		   int count = 0;
		   HashMap<Integer, Integer> map = new HashMap<>();
	       map.put(0,1);
		   
		   for(int i =0; i < nums.length; i++) {
			   
			   rsum += nums[i];
			   diff = rsum - k;
			   if(map.containsKey(diff)) {
				   count += map.get(diff);
			   }
			   map.put(rsum,map.getOrDefault(rsum, 0) +1);
		   }
	       return count; 
	    }
}
