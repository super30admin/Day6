// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
  public static int lenOfContiguousSubArr(int[] nums) {
    Map<Integer, Integer> Hmap = new HashMap<>();
    Hmap.put(0, -1);
    int maxLenOfSubArr = 0, count = 0;
    for (int i = 0; i < nums.length; i++) {
      count = count + (nums[i] == 1 ? 1 : -1);
      if (Hmap.containsKey(count)) {
        maxLenOfSubArr = Math.max(maxLenOfSubArr, i - Hmap.get(count));
      } else {
        Hmap.put(count, i);
      }
    }
    return maxLenOfSubArr;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 1, 0 };
    System.out.println(lenOfContiguousSubArr(nums));
  }
}
