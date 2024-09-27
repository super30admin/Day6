// Time Complexity : O(n), 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package hashing2;

import java.util.*;

public class ContiguousArrayLen {

    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> hMap = new HashMap<>();
        hMap.put(0, -1);
        int max = 0, rSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum = rSum - 1;
            } else {
                rSum = rSum + 1;
            }
            if (hMap.containsKey(rSum)) {
                max = Math.max(max, i - hMap.get(rSum));
            } else {
                hMap.put(rSum, i);
            }

        }
        return max;
    }
}
