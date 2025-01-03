
/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Approach: We compute the running sum at every index of the array when iterating.
 * For every value of "0" encountered, we subtract 1 from the current sum.
 * For every value of "1" encountered, we add 1 to the current sum.
 * If the current sum at every index is not found in the hashmap, we add it to the hashmap.
 * If current sum is found in the map, we compute the max length and update accordingly.
 */

import java.util.HashMap;
import java.util.Map;

class ContiguousArray {

  public int findMaxLength(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    Map<Integer, Integer> map = new HashMap<>();
    int runningSum = 0;
    int max = Integer.MIN_VALUE;
    map.put(-1, 0);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        runningSum--;
      } else {
        runningSum++;
      }
      if (map.containsKey(runningSum)) {
        max = Math.max(max, i - map.get(runningSum));
      } else {
        map.put(runningSum, i);
      }
    }
    return max;
  }
}