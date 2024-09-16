import java.util.HashMap;
import java.util.Map;

// Time complexity: O(n)
// Space complexity: O(n)
public class SubArray {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;

        int total = 0, rSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1); // It assumes that rSum 0 occurred once. and it'll handle inputs like [2,5], [3,4]

        for (int num : nums) {
            rSum += num;


            // Subtracting k means after the previous position where we found this difference,
            // there were elements in the input array which made the sum to k
            int diff = rSum - k;

            if (map.containsKey(diff)) {
                total += map.get(diff);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);

        }

        return total;
    }
}
