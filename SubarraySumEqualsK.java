// Time Complexity : O(n) where n is the length of nums input array
// Space Complexity : O(n) where n is the length of the nums input array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Running sum is used as a technique to avoid the exploration of all possible subarrays sum
 * We calculate the runningSum for each element and for each running sum, we put the number of times that sum is seen in a subarray
 * 
 * If we see any runningSum - k already occuring earlier, we know that there is a valid subarray with k sum.
 
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        // to capture initial subarray with the sum = k
        hmap.put(0, 1);
        
        int rSum = 0;
        
        int result = 0;
        
        for (int i=0; i<nums.length; i++) {
            rSum += nums[i];
            
            if (hmap.containsKey(rSum - k)) {
                result += hmap.get(rSum - k);
            }
            
            hmap.put(rSum, hmap.getOrDefault(rSum, 0) + 1);
        }
        
        return result;
    }
}
