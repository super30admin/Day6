import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int curSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int n : nums) {
            curSum += n;
            int diff = curSum - k;

            if (map.containsKey(diff))
                res += map.get(diff);
            map.put(curSum, 1 + map.getOrDefault(curSum, 0));
        }

        return res;
    }
}