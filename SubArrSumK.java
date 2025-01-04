/* Description: So here when we try to find each subarray and sum of each, TC O(n^2). Whenever TC is like this, 
some techniques that should come to mind is rSum, Hashing, 2 pointers, sliding window. Using rSum, where we maintain
the rSum of each element at every index, and then checking in hashmap if the rSum-K has occurred before. If yes, 
increment the count and return count at end to return the total number of subarrays.
 */
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach:
import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // Checking for base condition
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        // Initializing the intial rSum=0 and num of subarrays(cnt)=0
        int rSum = 0;
        int cnt = 0;
        // Initializing HM to store the rSum as keys and the number of times it has
        // occurred as it's values
        HashMap<Integer, Integer> map = new HashMap<>();
        // Put the initial rSum entry, to handle unique case where later there is
        // occurence of rSum as 0
        map.put(0, 1);
        // Go through all the elements
        for (int i = 0; i < nums.length; i++) {
            // Calc the rSum
            rSum = rSum + nums[i];
            // Check if that rSum-K is already present in map(we are doing minus k bcoz if
            // there is value by removing k, that means we have added k to achieve the
            // current value)
            if (map.containsKey(rSum - k)) {
                // It it is, increment the counter by the number of occurences of that rSum-K
                cnt = cnt + map.get(rSum - k);
            }
            // Add the entry in map if new entry, else update the number of occurrence by
            // adding 1 to it
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        // Return the number of subarrays stored in cnt
        return cnt;
    }
}