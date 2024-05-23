// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// The logic is based on maintaining a running sum (rsum) and using a hash map to keep track of the
// first occurrence of each running sum.

class Solution {
    public int findMaxLength(int[] nums) {
        // If the input array is null or empty, return 0 as the result.
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // HashMap to store the first occurrence of each running sum.
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;  // This will store the maximum length of the subarray.
        int rsum = 0; // Running sum initialized to 0.

        // Initialize the HashMap with the running sum 0 at index -1.
        map.put(rsum, -1);

        // Iterate through the array.
        for (int i = 0; i < nums.length; i++) {
            // Update the running sum: +1 for 1, -1 for 0.
            if (nums[i] == 1) {
                rsum = rsum + 1;
            } else {
                rsum = rsum - 1;
            }

            // If the running sum has been seen before, a subarray with an equal number of 0s and 1s is found.
            if (map.containsKey(rsum)) {
                // Calculate the length of the subarray and update max if it's the longest found so far.
                max = Math.max(max, i - map.get(rsum));
            } else {
                // If the running sum is seen for the first time, add it to the map with the current index.
                map.put(rsum, i);
            }
        }

        // Return the maximum length of the subarray found.
        return max;
    }
}
