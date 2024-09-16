# Time Complexity : O(n)
# Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No. Implemented class solution.
# class Solution:
#     def subarraySum(self, nums: List[int], k: int) -> int:
#         count = 0
#         for i in range(len(nums)):
#             sum = 0
#             for j in range(i,len(nums)):
#                 sum += nums[j]
#                 if(sum == k):
#                     count += 1
#         return count
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count  = 0
        rSum = 0
        d = {}
        d[0] = 1
        for i,val in enumerate(nums):
            rSum += val
            if rSum-k in d:
                count += d[rSum-k]
            if rSum not in d:
                d[rSum] = 1
            else:
                d[rSum] = d[rSum] + 1
        return count
