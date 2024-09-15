import java.util.*;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
  // As i iterate over array  i replace 0 withh -1, then maintained left sum in hashmap with key = sum and value = earliest_index,
  // before Adding the sum to map, I check if c sum exists in map if yes that means from that index till i the number of 1 and 0 are same
  //Caluclate the maximum length

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0, max=0;
        map.put(0, -1);
        for (int i=0; i<nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : nums[i]);
            if (map.containsKey(sum)) {
                max = Math.max(max, i -map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
