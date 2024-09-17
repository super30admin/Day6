
import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        // key = running sum and value = no. of times running sum is seen
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int total = 0;
        map.put(0, 1); // [2, 5]

        for (int i = 0; i < nums.length; i++) {
            rSum = rSum + nums[i];
            if (map.containsKey(rSum - k)) {
                total += map.get(rSum - k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }

        return total;
    }
}