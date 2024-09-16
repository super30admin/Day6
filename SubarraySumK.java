// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Since we have to find contiguous subarray, we can calculate cumulative sum for each index. Now I will have to find
// a subarray with sum k. This subarray can occur between any two indices (lets say i and j), if the cumulative sum
// at j is (S) and at i is (S-K). Now we have to check how many times, S-k sum has appeared before, that we can keep in
// hashmap. Each time S-K appears again, we increment the count value.

import java.util.HashMap;
import java.util.Map;

public class SubarraySumK {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) return 0;

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for (int val : nums) {
            sum += val;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
