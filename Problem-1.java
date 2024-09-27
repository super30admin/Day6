import java.util.HashMap;

// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

// Use map with [KEY: running sum; VALUE: numbers of subarrays found with that running sum]
// We maintain a running sum while iterating the nums from 0 to n -1
// Then we check if running sum's compliment with k exists in map; if it exists then we increase the "totalSubArrays" by the value of subarray's numbers
// Add/Update the rSum and its count in map in each iteration
class Solution1 {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Dummy entry
        int rSum = 0; // running sum
        int totalSubArrays = 0; // count of subArrays to return

        for (int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            if (map.containsKey(rSum - k)) {
                totalSubArrays += map.get(rSum - k);
            }

            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }

        return totalSubArrays;
    }
}
