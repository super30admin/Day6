// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to revisit the lecture video for better understanding.


// Your code here along with comments explaining your approach
// The trick in this case is to understand that at any point of time, if the running sum's complement has been observed before, then it 
// means that the sum of numbers in between form k.
// The comments are mentioned inline

import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        //edge case
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0, sum = 0;
        // HashMap to capture running sum as key and no. of occurrence as value
        HashMap<Integer, Integer> map = new HashMap<>();
        // base case
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            // running sum
            sum += nums[i];
            // checking if compliment of running sum exists or not in the map
            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }
            // adding running sum with its current frequency in the map
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}