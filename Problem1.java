// Time Complexity : O(n)
// Space Complexity : O(n);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.util.*;

public class Problem1 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int prefixSum = 0;
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            target = prefixSum - k;
            count += map.getOrDefault(target, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}