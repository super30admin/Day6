// Problem 560. Subarray Sum Equals K
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
import java.util.HashMap;

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int rsum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 having one occurrence

        for(int i = 0; i < nums.length; i++) {
            rsum += nums[i]; // Running sum
            // Check if there is a subarray sum that equals to k
            if(map.containsKey(rsum - k)) {
                count += map.get(rsum - k);
            }
            map.put(rsum, map.getOrDefault(rsum, 0) + 1);
        }

        return count;
    }
}
