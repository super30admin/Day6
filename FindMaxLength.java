/**
 * @author Vishal Puri
 * // Time Complexity : O(n)
 * // Space Complexity : O(n)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

import java.util.HashMap;
import java.util.Map;

public class FindMaxLength {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
