/** contiguous array */
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//we store the values in the form of(count, index).
class Solution {

  public int findMaxLength(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int count = 0;
    int maxlen = 0;

    for (int i = 0; i < nums.length; i++) {
      //we assign 0 to -1 and 1 to +1. So whenever we reach 0 in the map, we know till that point we have equal no of zeroes and 1's
      count = count + (nums[i] == 1 ? 1 : -1);
      if (map.containsKey(count)) {
        maxlen = Math.max(maxlen, i - map.get(count));
      } else {
        map.put(count, i);
      }
    }
    return maxlen;
  }
}
