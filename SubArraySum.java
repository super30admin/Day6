// Time complexity: O(n) where n is the length of array.
// Space complexity: O(n) where n is the length of array.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;
class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int total_subarrays = 0;
        int rSum = 0;
        map.put(0, 1);      // For starting subarray.
        for(int i = 0; i < nums.length; i++) {
            rSum = rSum + nums[i];
            if(map.containsKey(rSum - k)) {
                total_subarrays += map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);   // Updates the key's value if present(Instead of using if conditions). 
        }
        return total_subarrays;
    }
}