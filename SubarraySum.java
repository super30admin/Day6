package day6;

import java.util.*;

    // Time Complexity : O(n)
	// Space Complexity : O(n)
	// Did this code successfully run on Leetcode : yes
	// Any problem you faced while coding this : it took time for me to understand the solution concept


	// Your code here along with comments explaining your approach
public class SubarraySum {
	
	    public int subarraySum(int[] nums, int k) {
	        int count = 0, sum = 0;
	        HashMap < Integer, Integer > map = new HashMap < > ();
	        map.put(0, 1);
	        //keep on adding the cumulative sum in the Hashmap
	        for (int i = 0; i < nums.length; i++) {
	            sum += nums[i];
	            //we check whether that sum has already occurred in any subarray
	            if (map.containsKey(sum - k))
	            	 // everytime a sum is encountered, we increment the count
	                count += map.get(sum - k);
	            map.put(sum, map.getOrDefault(sum, 0) + 1);
	        }
	        return count;
	    }
	}

