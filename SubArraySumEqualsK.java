//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int cumulativeSum = 0;
        int count = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
        for(int num: nums) {
            cumulativeSum += num;
            int subArraySum = cumulativeSum - k;
            if(prefixSum.containsKey(subArraySum)) {
                count = count + prefixSum.get(subArraySum);

            }
            prefixSum.put(cumulativeSum, prefixSum.getOrDefault(cumulativeSum, 0) + 1);
        }
        return count;

    }
}