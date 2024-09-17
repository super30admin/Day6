"""
Time Complexity: O(n)
Space Complexity: O(n)
"""


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count, sum = 0, 0
        map = {}
        map[0] = 1
        for i in range(len(nums)):
            sum += nums[i]
            if (sum-k) in map:
                count += map.get(sum-k)
                map.put(sum, map, get(sum)+1)
        return count
