// Time Complexity: O(n)
// Space Complexity: O(n) 

// Approach: iterate through the nums array. Keep a total sum until that index and a count.
// We create a hashMap of sumUntilThatIndex as key and it's frequency as value.
// Everytime we find the same sum at any other index, we update the frequency.
// We also keep checking if sum-k exists in the map, if it does, we increment the count.

//Leetcode: 560, Subarray Sum Equals K

import java.util.*;

public class SubarraySumEqualsK {
  public int subarraySum(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
      return -1;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int sum = 0, count = 0;

    for (int n : nums) {
      sum = sum + n;

      if (map.containsKey(sum - k)) {
        count = count + map.get(sum - k);
      }

      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
  }
}
