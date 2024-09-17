// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * 
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2
Output: 2
 

Constraints:

The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].

brute force: check for each possible sub array - nested checking, good candidate for running sum

strategy - maintain hashmap of running sum and how many times that running sum occurred, while taking running sum
take diff of running sum and k and see if that diff is in the map, if yes, sum of sub array starting from the places where
that difference occurred as running sum and ending at current index will be equal to k
 *
 */

import java.util.HashMap;
import java.util.Map;

class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        
        if(nums == null || nums.length ==0 ) return 0;
       
        int count = 0, rSum = 0;
        //running sum, count
        Map<Integer, Integer> map = new HashMap<>();
        
        // edge case e.g {3,4} k=7
        map.put(0, 1);
        
        for(int num:nums) {
        	
        		//calculate running sum
            rSum+=num;
            
            //take difference
            int complement = rSum - k;
            
            //if complement already occurred, increase count by value corresponding to the
            //difference from the map -- that value represent how many times running sum seen till now
            if(map.containsKey(complement)) {
                count+=map.get(complement);
            }
            
            //if running sum occurred before, increase count, if not put 1 as value as running
            //sum occurred just now so count 1
            if(!map.containsKey(rSum)) {
                map.put(rSum, 0);
            }
            map.put(rSum, map.get(rSum) + 1);
        }
        
        return count;
    }
}