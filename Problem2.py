# 525. Contiguous Array

# Time Complexity: O(n)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Approach:
# Use a hashmap to store the prefix sum and its frequency. For each prefix sum, check if the sum - k is in the hashmap.
# If it is, then we have found a subarray that sums to k. Add the frequency of the sum - k to the count.
# Update the hashmap with the current prefix sum.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxLength = 0
        count = 0
        prefixSum = {0: -1}
        for i, num in enumerate(nums):
            count += 1 if num == 1 else -1
            if count in prefixSum:
                maxLength = max(maxLength, i - prefixSum[count])
            else:
                prefixSum[count] = i
        return maxLength
