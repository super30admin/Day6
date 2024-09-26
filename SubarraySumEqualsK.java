// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Approach

/**
 * In this problem, we have to find the number of contiguous subarray with sum equal to k
 * We employ the approach of running sum and store the (running_sum --> index) as key --> value pair in hashmap
 * We take the advantage of the concept (X - Y == Z) to find the subarrays with sum equal to k
 */

 // https://leetcode.com/problems/subarray-sum-equals-k/

 class Solution {
    public int subarraySum(int[] nums, int k) {
        //Create a map of running_sum --> index
        Map<Integer, Integer> map = new HashMap<>();
        
        int result_count = 0;
        
        int running_sum = 0;
        for (int i=0;i<nums.length;i++) {
            running_sum += nums[i];
            
            if(running_sum == k) {
                result_count++;
            }
            
            if(map.containsKey(running_sum - k)) {
                result_count += map.get(running_sum - k);
            }
            
            if(!map.containsKey(running_sum)) {
                map.put(running_sum, 1);
            } else {
                map.put(running_sum, map.get(running_sum) + 1);
            }
            
        }
        
        return result_count;
    }
}