// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store the cumulative sum and its frequency
        Map<Integer, Integer> sumFrequency = new HashMap<>();
        sumFrequency.put(0, 1); // Initialize with sum 0 having frequency 1

        int cumulativeSum = 0;
        int count = 0;

        for (int num : nums) {
            cumulativeSum += num;

            // If (cumulativeSum - k) is found in the map, it means there is a subarray that sums up to k
            if (sumFrequency.containsKey(cumulativeSum - k)) {
                count += sumFrequency.get(cumulativeSum - k);
            }

            // Update the frequency of the current cumulative sum
            sumFrequency.put(cumulativeSum, sumFrequency.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
    }
}