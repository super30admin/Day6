
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
    int result = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      currSum += nums[i];
      if (currSum == k) {
        result++;
      }
      if (map.containsKey(currSum - k)) {
        result += map.get(currSum - k);
      }
      if (map.containsKey(currSum)) {
        map.put(currSum, map.get(currSum) + 1);
      } else {
        map.put(currSum, 1);
      }
    }
    return result;
  }

}
