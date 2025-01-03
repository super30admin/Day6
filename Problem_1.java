// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Used a HashMap to store the running sum and its frequency, tracking subarrays whose sums equal k.
// At each step, checked if the difference rSum - k exists in the map, incrementing the count by its frequency to capture valid subarrays.

import java.util.HashMap;

class SolutionSubarraySum {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            int diff = rSum - k;
            if(map.containsKey(diff)) {
                count += map.get(diff);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}
