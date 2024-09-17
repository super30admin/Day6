import java.util.HashMap;

//Time Complexity O(n)
//Space Complexity O(n)

public class Problem1 {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int total = 0;
        int rSum = 0;

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
