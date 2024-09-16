package S30_Codes.Hashing_2;

// Time Complexity = O(n) // n = num.length
// Space Complexity = O(n)
// Hashing-2

import java.util.HashMap;
import java.util.Map;

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int totalPossibleSubArray = 0;
        int prefixSum = 0;
        for(int i : nums){
            prefixSum += i;

            int access = prefixSum - k;
            totalPossibleSubArray += map.getOrDefault(access, 0);

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) +1);
        }
        return totalPossibleSubArray;
    }
}
