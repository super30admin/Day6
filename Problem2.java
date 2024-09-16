// Time Complexity : O(n)
// Space Complexity : O(n);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem2 {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                prefixSum += -1;
            } else {
                prefixSum += 1;
            }
            if (map.containsKey(prefixSum)) {
                int len = i - map.get(prefixSum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1 };
        System.out.println(findMaxLength(nums));
    }
}
