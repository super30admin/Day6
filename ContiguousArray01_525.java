// Time Complexity : O(N) where N is length of the array
// Space Complexity : O(N) worst case (all 1's)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/*
Algorithm:
=========
1. Add -1 to sum if 0, 1 if 1 so that if there are equal number of 1s and 0s, result sum would be 0 
2. Store temporary sum so far as key and index it last occurred as value. If same sum occurs again, means there are equal 1's and 0's
3. Update max as we iterate through the array and return max
*/


class Solution {
    public int findMaxLength(int[] nums) {
    	if(nums == null || nums.length == 0) return 0;
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, -1); //(sum, index the sum last occurred)
        int maxLen = 0, sum = 0; 
        
        // Check if the sum occurred before
        for(int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;
            Integer lastIndex = map.get(sum);
            // If sum already occurred, then check whether it is greater than maxlen and update it
            if(lastIndex != null) 
                maxLen = Math.max(maxLen, i - (map.get(sum)));
            else 
                map.put(sum, i);
        }
        return maxLen;
    }
}