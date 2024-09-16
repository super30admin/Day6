import java.util.HashMap;
import java.util.Map;

/**
 * time complexity is O(n)
 * space complexity is O(n)
 */
class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for(int num : nums) {
            sum = sum + num;
            
            if(map.containsKey(sum - k)) {
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}