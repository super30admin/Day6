// TC: O(N)
// SC: O(N), where N is the number of numbers in array "nums"

import java.util.*;

class LC560 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int rSum = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            rSum += nums[i];
            int tar = rSum - k;
            ans += map.getOrDefault(tar, 0);
            if (map.containsKey(rSum)) {
                map.put(rSum, map.get(rSum) + 1);
            } else {
                map.put(rSum, 1);
            }
        }
        return ans;
    }
}