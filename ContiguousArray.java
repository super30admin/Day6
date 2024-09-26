// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Approach

/**
 * We are required to find the maximum length of Contiguous subrray with equal number of 0s and 1s
 * For every 0, we add -1 to the running suma nd for every 1, we add 1 to the running sum
 * when we encounter same running same encountered before that we stored in the hashmap, we know that we have found the subarray with sum == 0 (Equal number of 1s and 0s)
 */


 // https://leetcode.com/problems/contiguous-array/

class Solution {
    public int findMaxLength(int[] nums) {
         
        // Map of Running sum --> index
        Map<Integer, Integer> map  = new HashMap<>();
        
        int running_sum = 0;
        
        int max_length = 0;
        
        map.put(0, -1);
        
        // for every 0, we add -1
        // for every 1 we add 1
        for (int i=0;i<nums.length;i++) {
            running_sum += (nums[i] == 0 ? -1 : 1);
            
            if (map.containsKey(running_sum)) {
                max_length = Math.max(max_length, i - map.get(running_sum));
            } else {
                map.put(running_sum, i);
            }
            
        }
        
        return max_length;
    }
}
