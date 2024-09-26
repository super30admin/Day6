package Oct20;

import java.util.HashMap;
import java.util.Map;

class ContiguousArray {
    
	// Time Complexity: O(n) where n is number of elements in given array.
	// Because we are traversing the array once completely which is O(n).
	// Also we are doing put, contains and get operations on Hashmap with integer key, which is O(1).

	// Space Complexity: O(n) 
	// If all elements of given array are 1, there will be max n entries in the hashmap. So, O(n) space complexity.
	        
	// Did this code successfully run on Leetcode : Yes

	// Any problem you faced while coding this : No

	// Approach: 
	// We initialise a running sum variable with 0. For every 0 in array, running sum reduced by -1 and for every 1 in array, running sum increased by +1.
	// Manage a hashmap where we store key = current running sum AND value = current index.
	// While processing the string, if we encounter a value of running sum which is already present in hashmap => a string of equal no.of 0s and 1s exist between the indexes of current running sum and the one in hashmap.
	// For edge case, we should insert key=0, value=-1 in hashmap right after initializing it.
	    
	    public int findMaxLength(int[] nums) {
	       
	        // edge cases
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }
	        
	        int numsLen = nums.length;
	        
	        // variable to hold cumulative sum till current index element
	        int runningSum = 0;
	        // variable to hold result
	        int maxSubArrayLen = 0;
	        
	        Map<Integer, Integer> hm = new HashMap<>();
	        // used to handle edge cases like when array is (0,1) or (1,0)
	        hm.put(0,-1);
	        
	        for (int i = 0; i < numsLen; i++) {
	            int cur = nums[i];
	            runningSum = (cur == 0)? runningSum-1:runningSum+1;
	            if (hm.containsKey(runningSum)) {
	                int curVal = hm.get(runningSum);
	                maxSubArrayLen = Math.max(maxSubArrayLen, i-curVal);
	            } 
	            else {
	                hm.put(runningSum, i);
	            }
	        }
	        return maxSubArrayLen; 
	    }
	}
