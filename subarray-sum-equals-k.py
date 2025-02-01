# The algorithm maintains a running prefixSum and uses a hashmap (count) to track its frequency. 
# For each element, it checks how many times (prefixSum - k) has appeared, indicating a valid 
# subarray sum.

# Time & Space Complexity:
# Time Complexity(N) → Single pass through nums.
# Space Complexity: O(N) → Stores prefix sums in a hashmap.
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = {0 : 1}
        ans = 0
        prefixSum = 0
        for num in nums:
            prefixSum += num
            ans += count.get(prefixSum - k, 0)
            count[prefixSum] = count.get(prefixSum, 0) + 1
        return ans