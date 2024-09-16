/** Subarray sum equals k */
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach

class Solution {

  public int subarraySum(int[] nums, int k) {
    int count = 0, sum = 0;
    //we store the  numbers in the form of (sum, no of occurences of the sum)
    //every time we encounter a new sum, we add it to the hashmap.
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      //if the map contains the sum , we add 1 to the count and we also determine the no of times
      // the sum (sum - k) has occurred as it will determine
      //the number of times a subarray with sum k has occurred up to the current index
      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
  }
}
//[3, 4, 7, 2, -3, 1, 4, 2] k = 7
// 3, 7                        ->cumulative sum
//    1                        -> count
//4 + 3 ->7 sum - k (7 - 7 = 0)
