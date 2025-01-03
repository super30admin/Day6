// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Used a HashMap to store the cumulative sum and its first occurrence index. Check if the current sum exists in the map.
// If yes, calculate the length of the subarray and update max. Return max as the length of the longest subarray.

import java.util.HashMap;

class SolutionContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                sum = sum - 1;
            } else {
                sum = sum + 1;
            }
            if(map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
