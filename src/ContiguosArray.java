// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/**
 * https://leetcode.com/problems/contiguous-array/
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

brute force - checking each sub array, do we need to do that? if we maintain running sum and corresponding index then no.
			  we avoid nested operations using running sum strategy
Strategy - running sum problem, maintain count, count++ for 1, count-- for 0, maintain running sum at each index, 
		   if sum is equal at two indices, between those 2 indices we have same number of 1 and 0s
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        //map to keep track of count and corresponding index
        Map<Integer, Integer> countMap = new HashMap<>();
        
        //we need this for test edge case e.g {1,0}
        countMap.put(0, -1);
        
        int len = 0, countSoFar = 0;
        
        for(int i=0; i<nums.length; i++) {
            //increase count if 1 , decrease if 0 found
            if(nums[i] == 1) {
                countSoFar++;
            }else {
                countSoFar--;
            }
            
            //if same count is found before, current index and that index will give contiguous array
            if(countMap.containsKey(countSoFar)) {
            	// if sum is equal at two indices, between those 2 indices we have same number of 1 and 0s, 
            	//see if length of that sub array is max
                len = Math.max(len, i - countMap.get(countSoFar));
            } else
            {
                countMap.put(countSoFar, i);
            }
        }
        
        return len;
    }
}