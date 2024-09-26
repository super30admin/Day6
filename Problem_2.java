// Time Complexity : O(n) where n is the length of the array
// Space Complexity : O(n) where n is the length of the array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        int rSum = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i += 1) {
            rSum += nums[i] == 1 ? 1 : -1;
            if (map.get(rSum) == null) {
                map.put(rSum, i);
            } else {
                maxLen = Math.max(maxLen, i - map.get(rSum));
            }

        }
        return maxLen;
    }
}