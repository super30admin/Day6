import java.util.*;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
  // As i iterate over array, i maintained left sum in hashmap with key = sum and value = frequency
  // before Adding the sum to map, I check if compliment of sum exists i.e sum + x = k. if yes then there is a index from where the sum till i is k

class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, result = 0;
        map.put(0,1);

        for (int i=0; i<nums.length; i++) {
            sum +=nums[i];
            int compliment = sum - k;
            if (map.containsKey(compliment)) {
                result+=map.get(compliment);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
