// Time Complexity : O(n) where n is the length of the array
// Space Complexity : O(n) where n is the length of the array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, rSum = 0;
        for (int i = 0; i < nums.length; i += 1) {
            rSum += nums[i];
            if (map.get(rSum - k) != null) {
                count += map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}
