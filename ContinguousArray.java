//TimeComplexity - O(N) - N-length of nums
//SpaceComplexity - O(N) - N-length of nums - in worst case


class Solution {
  public int findMaxLength(int[] nums) {

    int maxLen = 0;
    int count = 0;

    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);

    for (int i = 0; i < nums.length; i++) {
      int zeros = 0, ones = 0;

      count += nums[i] == 1 ? 1 : -1;

      if (map.containsKey(count)) {
        maxLen = Math.max(maxLen, i - map.get(count));
      } else {
        map.put(count, i);
      }
    }

    return maxLen;
  }
}
