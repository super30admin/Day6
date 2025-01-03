
/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Approach: We use a HashMap to count running sum at every index.
 * For every index which has currentSum we check if (currentSum - k) exists in the Map.
 * If it present, we increment the result with the number of times (currentSum -k) encountered in hashmap.
 */

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

  public int subarraySum(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int currSum = 0;
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      currSum += nums[i];
      if (map.containsKey(currSum - k)) {
        count += map.get(currSum - k);
      }
      map.put(currSum, map.getOrDefault(currSum, 0) + 1);
    }
    return count;
  }

}
