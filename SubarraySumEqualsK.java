// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
  public int subarraySum(int[] nums, int k) {
    if(nums == null || nums.length == 0) return 0;

    Map<Integer, Integer> hashmap = new HashMap<>();
    hashmap.put(0, 1); // Base case

    int runningSum = 0;
    int count = 0;

    for(int num: nums) {
      // Calculating running sum.
      runningSum += num;
      // Checking if the running sum exits as a key in the hashmap.
      if(hashmap.containsKey(runningSum-k)) {
        count += hashmap.get(runningSum-k);
      }
      // Updating the hashmap with the number of times that runningSum has occured.
      hashmap.put(runningSum, hashmap.getOrDefault(runningSum,0)+1);
    }
    return count;
  }
}