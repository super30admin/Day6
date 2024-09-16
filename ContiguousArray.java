package S30_Codes.Hashing_2;

// Time Complexity = O(n) // n = num.length
// Space Complexity = O(n)
// Hashing-2

import java.util.HashMap;
import java.util.Map;

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int maxLen = 0;
        int prefixSum = 0;
        for(int i=0; i<nums.length; i++){
            prefixSum += (nums[i]==0) ? -1 : 1;

            if(map.containsKey(prefixSum)){
                int prevIdx = map.get(prefixSum);
                int curLen = i-prevIdx;

                maxLen = Math.max(maxLen, curLen);
            }
            else
                map.put(prefixSum, i);
        }

        return maxLen;

    }
}