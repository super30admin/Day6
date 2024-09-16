// Time Complexity : O(n) where n is the length of nums input array
// Space Complexity : O(n) where n is the length of the nums input array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * In this problem, we employ the running sum approach to reduce the nested iteration to find all the subarrays
 * For every 0, we add -1 to the running sum and for every 1, we add 1 to running sum
 * when we see that the running sum becomes 0, means we have a balanced subarray
 * Also, if we have a running sum difference of 0 at any point, we can conclude that there is a balanced subarray found.
 * we calculate the max Length of the subarray and update the maxLen
 *
 */

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        // we calculate the running sum for each item
        //if we get a running sum which is already present in hashmap, we know that there is a subarray which is balanced
        
        // To capture the initial balanced subarray, we need an initial entry in hashmap
        // The running sum should be 0 and index should be -1;
        
        hmap.put(0, -1);
        
        int runSum = 0;
        int maxLen = 0;
        
        for (int i=0; i<nums.length; i++) {
            runSum += nums[i] == 0 ? -1 : 1;
            
            if (hmap.containsKey(runSum)) {
                // we have a valid balanced subarray with equal 0s and 1s
                maxLen = Math.max(maxLen, i - hmap.get(runSum));
            } else {
                // put the runSum and index at which it is observed
                hmap.put(runSum, i);
            }
        }
        
        return maxLen;
    }
}
