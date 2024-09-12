import java.util.HashMap;
import java.util.Map;

class SubArraySumK {
    public int subarraySum(int[] nums, int k) {
         if (nums == null || nums.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length, sum = 0, count = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            int priorSum = sum - k;
            if (map.containsKey(priorSum)) { 
                count += map.get(priorSum); 
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}