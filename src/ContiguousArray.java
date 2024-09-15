// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

import java.util.*;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {

        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int rSum = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                rSum += 1;
            }
            else {
                rSum -= 1;
            }

            if (map.containsKey(rSum)) {
                result = Math.max(result, i - map.get(rSum));
            }
            else {
                map.put(rSum, i);
            }
        }

        return result;
    }
}
