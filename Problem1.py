# 560. Subarray Sum Equals K

# Time Complexity: O(n)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Approach:
# Use a hashmap to store the prefix sum and its frequency. For each prefix sum, check if the sum - k is in the hashmap.
# If it is, then we have found a subarray that sums to k. Add the frequency of the sum - k to the count.
# Update the hashmap with the current prefix sum.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        sum = 0
        prefixSum = {0: 1}
        for num in nums:
            sum += num
            if sum - k in prefixSum:
                count += prefixSum[sum - k]
            prefixSum[sum] = prefixSum.get(sum, 0) + 1
        return count
    
