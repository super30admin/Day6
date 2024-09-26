// Time Complexity: O(n)
// Space Complexity: 0(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

import java.util.HashMap;

public class subarraySum {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int rSum = 0; int res = 0;
        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if (map.containsKey(rSum - k)) {
                res += map.get(rSum-k);
            }

            if (map.containsKey(rSum)) {
                map.put(rSum, map.get(rSum) + 1);
            } else {
                map.put(rSum, 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(arr, k));
    }
}
