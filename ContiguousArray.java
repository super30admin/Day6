// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We need to find a subarray with equal 1's and 0's. Since we have to find contiguous subarray, we can calculate
// cumulative sum for each index, adding 1 if value is 1 else -1. Now we will have to find a subarray with sum 0.
// This subarray can occur between any two indices (lets say i and j), if the cumulative sum at j is (S) and at i is (S).
// Now we have to check where S sum has appeared before, that we can keep in hashmap, S and last index. Each time S
// appears again, we can find max length by subtracting current index  with stored index.

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int len = nums.length;
        if (len == 0 || len == 1) return 0;

        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            if (sum == 0) {
                max = Math.max(max, i + 1);
            }
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }

        }

        return max;
    }
}
