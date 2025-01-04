/* Description: So here when we try to find each subarray and check which one contains equal 0s and 1s, TC O(n^2). Whenever TC is like this, 
some techniques that should come to mind is rSum, Hashing, 2 pointers, sliding window. Using rSum, where we maintain
the rSum of each element at every index, here it will make no use since we have only 0 and 1. Therefore, 
at every 0 doing -1 and at every 1 doing +1. Use hashmap to store the rSum and index at which it occured, 
whenever there is repeat, update the max with the subraction of current index - the farthest index stored in HM.
If no repeat, add the entry in HM.
 */
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach:
import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        // Checking for base condition
        if (nums.length == 0 || nums.length == 1 || nums == null) {
            return 0;
        }
        // Initializing max variable to 0
        int max = 0;
        // Initializing hashmap for storing the rSum and the index of that rSum
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initializing the rSum to 0
        int rSum = 0;
        // Adding initial rSum 0 and index -1 to the HM, to handle unique case where
        // rsum will be 0 again
        map.put(rSum, -1);
        // Iterate over all elements
        for (int i = 0; i < nums.length; i++) {
            // Decrement if 0
            if (nums[i] == 0) {
                rSum--;
            }
            // Increment if 1
            else if (nums[i] == 1) {
                rSum++;
            }
            // Check if the rSum exist, update max
            if (map.containsKey(rSum)) {
                max = Math.max(max, i - map.get(rSum));
            } else {
                // Else add the entry
                map.put(rSum, i);
            }
        }
        // Return max
        return max;
    }
}