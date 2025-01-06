//Time Complexity = O(n)
//Space.Complexity = O(n)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Your code here along with comments explaining your approach in three sentences only
/**
 * Approach: 
 * The problem is to find the number of subarrays in an integer array whose sum equals a given target k.
 * We keep track of the sum of elements as we go through the array. A HashMap stores how many times each sum 
 * has occurred. If we find that the current sum minus the target k has appeared before, it means there's a subarray that sums to k, and we add to the count
 */ 
class Solution {
    public int subarraySum(int[] nums, int k) {
        // If the input array is null or empty, return 0
        if(nums == null || nums.length == 0) {
            return 0;
        }
        // Initialize a HashMap to store the running sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // rSum keeps track of the running sum of elements in the array
        int rSum = 0;

        // count will keep track of the number of subarrays whose sum equals k
        int count = 0;

        // Initialize the map with a running sum of 0 
        map.put(0, 1);

        // Iterate over the array
        for(int i = 0; i < nums.length; i++) {

            // Update the running sum by adding the current element
            rSum = rSum + nums[i];

            // Check if (rSum - k) is already in the map
            // This means there exists a previous subarray with sum equal to k
            if(map.containsKey(rSum - k)) {

                // If so, increment count by the number of times this sum has occurred
                count = count + map.get(rSum - k);
            }

            // Update the map with the current running sum and its frequency
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }

        // Return the total count of subarrays whose sum equals k
        return count;
    }
}