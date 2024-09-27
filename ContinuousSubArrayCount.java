// Time Complexity : O(n), 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package hashing2;

import java.util.*;

public class ContinuousSubArrayCount {

    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> hMap = new HashMap<>();
        hMap.put(0, 1);
        int count = 0, rSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if (hMap.containsKey(rSum - k)) {
                count += hMap.get(rSum - k);
            }
            if (!hMap.containsKey(rSum)) {
                hMap.put(rSum, 1);
            } else {
                hMap.put(rSum, hMap.get(rSum) + 1);
            }
        }
        return count;
    }
}
