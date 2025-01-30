//Time Complexity: O(n)
//Space Complexity: O(n)
public class Solution {
    public int SubarraySum(int[] nums, int k) {
        Dictionary<int, int> prefixSumCount = new Dictionary<int, int>();
        prefixSumCount[0] = 1; // Base case: to handle exact matches with k

        int prefixSum = 0;
        int count = 0;

        foreach (int num in nums) {
            prefixSum += num; // Update running sum

            if (prefixSumCount.ContainsKey(prefixSum - k)) {
                count += prefixSumCount[prefixSum - k]; // Add count of subarrays
            }

            if (prefixSumCount.ContainsKey(prefixSum)) {
                prefixSumCount[prefixSum]++;
            } else {
                prefixSumCount[prefixSum] = 1;
            }
        }

        return count;
    }
}