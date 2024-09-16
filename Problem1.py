#
# Time Complexity  = O(n)
# Space Complexity  = O(n)
# Worked on leetcode
# 
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        from collections import defaultdict
        cumulative_sum = defaultdict(int) #key is cumulative sum, val is index
        curr = 0
        cumulative_sum[0] = 1
        res = 0
        for i in range(len(nums)):
            curr += nums[i]
            res += cumulative_sum[curr-k]
            cumulative_sum[curr] += 1
        return res
