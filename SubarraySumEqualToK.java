// The idea is if the cumulative sum between two indices is at a difference k , then the sum of elements between them is k.
// I'm making use of a hashmap to stare the cumulative sum uo to all the indices with the number of times the same sum occurs. 
// For every sum, I am checking the number of times sum - k has occurred already and incrementing that count to the result.

// Time Complexity : O(n), where n is the length of the array
// Space Complexity : O(n), where n is the length of the array

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualToK {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> presum = new HashMap<>();
        presum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (presum.containsKey(sum - k)) {
                count += presum.get(sum - k);
            }
            presum.put(sum, presum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}