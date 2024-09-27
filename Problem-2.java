import java.util.HashMap;

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Use map with [KEY: running sum; VALUE: index]
// We maintain a running sum while iterating the nums from 0 to n -1
// If we get 0 decrement the running sum 
// If we get 1 increment the running sum
// Then we add the rSum into map with index as value
// If map already contains this rSum then - there is a balanced subarray
class Solution2 {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>(); // key: running sum; value: index
        map.put(0, -1); // Dummy entry, for considering subarray starting from index 0
        int rSum = 0; // running sum
        int maxLength = 0; // maximum length of balanced array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                rSum--;
            } else {
                rSum++;
            }
            if (map.containsKey(rSum)) {
                int currLength = i - map.get(rSum);
                maxLength = Math.max(maxLength, currLength);
            } else {
                map.put(rSum, i);
            }
        }

        return maxLength;
    }
}
