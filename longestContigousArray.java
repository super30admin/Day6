// Time Complexity :O(N) 
// Space Complexity :O(N) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findMaxLength(int[] nums) {
        // HashMap to store the first occurrence of each prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize with prefix sum 0 at index -1
        map.put(0, -1);

        int prefixSum = 0; // Variable to store the current prefix sum
        int longestPalindrome = 0; // Variable to store the length of the longest subarray with equal number of 0s and 1s

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Update the prefix sum: decrement for 0, increment for 1
            if (nums[i] == 0) prefixSum--;
            else prefixSum++;
            
            // Check if the prefix sum has been seen before
            if (map.containsKey(prefixSum)) {
                // Update the longest palindrome length if a longer subarray is found
                longestPalindrome = Math.max(i - map.get(prefixSum), longestPalindrome);
            } else {
                // Store the first occurrence of the prefix sum
                map.put(prefixSum, i);
            }
        }

        return longestPalindrome; // Return the length of the longest subarray
    }
}
