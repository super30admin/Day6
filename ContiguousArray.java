// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
  public int findMaxLength(int[] nums) {
    if(nums == null || nums.length == 0) return 0;
    Map<Integer, Integer> hashmap = new HashMap<>();
    int maxValue = 0;
    int runningSum = 0;
    // Base case for when the array starts from 0.
    hashmap.put(0, -1);
    for(int i =0; i<nums.length; i++) {
      // Calculating running sum.
      if(nums[i] == 0) runningSum -= 1;
      else runningSum += 1;
      // Checking if the hashmap contains the running sum as a key or not.
      if(!hashmap.containsKey(runningSum)) {
        hashmap.put(runningSum, i);
      }else {
        // Getting the current length of contiguous array and finding max length.
        int current = i - hashmap.get(runningSum);
        maxValue = Math.max(current, maxValue);
      }
    }
    return maxValue;
  }
}