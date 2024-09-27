// Time Complexity - O(n)
// Space Complexity - O(n)

import java.util.HashMap;

public class SubArraySumEqualsK {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int rSum = 0;
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                rSum += nums[i];
                if (map.containsKey(rSum - k)) {
                    result = result + map.get(rSum - k);
                }
                if (!map.containsKey(rSum)) {
                    map.put(rSum, 0);
                }
                map.put(rSum, map.get(rSum) + 1);
            }
            return result;
        }
}
