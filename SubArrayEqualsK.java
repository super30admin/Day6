// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes, had to watch the video once to learn the concept.

/*
 * Approach: To count the number of subarrays - the brute force is O(n^2); To do it in O(n) we can do Sliding window, Running Sum, Dynamic Programming, Two pointer techinques
 * 
 * In this problem the problem requires us to count the number of subarrays that can be summed to k (contiguous). 
 * 1. Have a cache to store the runningSum : count
 * 2. at each running sum, check if you have already passed through a subarray with runningSum-target which exists in cache.? if so, return the count of such apperences 
 *      and add to your count.
 * 3. add the runningSum to the 
 * 
 * Doubts: how do i increase the count? should i increase the diff (runningSum-target) or (runningSum)- Ans: RunningSum; diff is only to check if there are any previous instances.
 */

import java.util.*;

public class SubArrayEqualsK {

    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, 1); // seed value: rSum of 0 is found 1 time at the start of the array
        int rSum = 0;
        int count = 0;

        for (int num : nums) {
            rSum += num;
            int diff = rSum - k;
            if (cache.containsKey(diff)) {
                count += cache.get(diff);

            }
            cache.put(rSum, cache.getOrDefault(rSum, 0) + 1);
        }

        return count;
    }
}