import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // keeping track of running sum at every index and the count of sum
        
        int rSum = 0, count = 0;
        
        // running sum pattern to eliminate nested iterations
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            
            if (map.containsKey(rSum - k)) {
                count += map.get(rSum - k);
            }
            
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        
        return count;
    }
}