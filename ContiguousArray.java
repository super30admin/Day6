// Time Complexity: O(n)
// Space Complexity: O(n) 

// Approach: Iterate through the nums array andcreate a map of count as key and
// index as value. Count is the decremented if we see 0 and incremented if we see 1. 
// When count is 0, it means we found a subarray where no. of 0 are equal to no. of 1.

//Leetcode: 525, Contiguous Array

import java.util.*;

public class ContiguousArray {
  public int findMaxLength(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);

    int count = 0;
    int maxLength = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        count = count - 1;
      } else {
        count = count + 1;
      }

      if (map.containsKey(count)) {
        maxLength = Math.max(maxLength, i - map.get(count));
      } else {
        map.put(count, i);
      }
    }

    return maxLength;
  }
}
