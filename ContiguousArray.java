// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes, had to watch the video once to learn the concept.

/*
 * we have to return the maximum length of a contiguous subarray with an equal number of 0 and 1
 * If we had to to brute force i will have to go through all the combination of the elements which would be O(n^2). We can go with the optimized approach which can be done in O(n).
 * 
 * Approach: keep the running sum; and cache the running sum vs the index - find the max length
 */

import java.util.*;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int maxLength = 0;
        int rSum = 0;
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, -1); // Seed value ; rSum : count of occurences
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                rSum += -1;
            if (nums[i] == 1)
                rSum += 1;
            if (cache.containsKey(rSum)) {
                maxLength = Math.max(maxLength, i - cache.get(rSum));
            } else {
                cache.put(rSum, i);
            }
        }

        return maxLength;

    }
}