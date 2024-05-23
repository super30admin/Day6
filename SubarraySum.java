// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// The logic involves using a running sum (rsum) and a hash map to keep track of the frequency
// of each running sum encountered so far.

class Solution {
    public int subarraySum(int[] nums, int k) {
        // If the input array is null or empty, return 0 as there are no subarrays.
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // HashMap to store the frequency of each running sum.
        HashMap<Integer, Integer> map = new HashMap<>();
        int rsum = 0; // Running sum initialized to 0.
        int count = 0; // This will store the count of subarrays with sum equal to k.

        // Initialize the HashMap with the running sum 0 having a count of 1.
        map.put(rsum, 1);

        // Iterate through the array.
        for (int i = 0; i < nums.length; i++) {
            // Update the running sum by adding the current element.
            rsum += nums[i];

            // Check if (rsum - k) exists in the map. If it does, it means there are subarrays
            // ending at the current index with a sum equal to k.
            if (map.containsKey(rsum - k)) {
                // Increment count by the number of times (rsum - k) has been seen.
                count += map.get(rsum - k);
            }

            // Update the map with the current running sum.
            // If the running sum is already in the map, increment its count by 1.
            // Otherwise, add it to the map with a count of 1.
            map.put(rsum, map.getOrDefault(rsum, 0) + 1);
        }

        // Return the total count of subarrays with sum equal to k.
        return count;
    }
}
