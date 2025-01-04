// TC: O(N)
// SC: O(N), where N is the total numbers in array "nums"

import java.util.*;

class LC25 {
    public int findMaxLength(int[] nums) {
        int rSum = 0;
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            rSum += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(rSum))
                ans = Math.max(ans, i - map.get(rSum));
            map.putIfAbsent(rSum, i);
        }
        return ans;
    }
}
