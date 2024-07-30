// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        // HashMap to store the cumulative sum and its first occurrence index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with sum 0 at index -1

        int maxLength = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Update the cumulative sum: treat 0 as -1 and 1 as 1
            cumulativeSum += (nums[i] == 0) ? -1 : 1;

            // Check if the cumulative sum has been seen before
            if (map.containsKey(cumulativeSum)) {
                // Calculate the length of the subarray
                int length = i - map.get(cumulativeSum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store the first occurrence of the cumulative sum
                map.put(cumulativeSum, i);
            }
        }

        return maxLength;
    }
}