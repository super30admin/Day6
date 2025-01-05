"""
Problem 1: Subarray sum equals K
TC: O(n)
SC: O(n)
Approach: Use a hashmap to store the sum and the count of the sum. Iterate through the array and update the sum.
If the sum - k is already present in the hashmap, then increment the count by the value of the sum - k.
If the sum is not present in the hashmap, then add the sum to the hashmap.
Return the count.
"""
from collections import defaultdict
from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) == 0:
            return 0

        count = 0
        sum_ = 0
        sum_map = defaultdict(int)
        sum_map[0] = 1

        for num in nums:
            sum_ += num
            if (sum_ - k) in sum_map:
                count += sum_map[sum_ - k]
            sum_map[sum_] += 1

        return count
