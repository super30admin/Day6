# Time Complexity : 0(n)
# Space Complexity : 0(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

from typing import List


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if len(nums) == 0 or len(nums) == 1: 
            return 0
        max_1 = 0
        rsum = 0
        hash1 = {0 : -1}
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -=  1
            if nums[i] == 1:
                rsum += 1
            if rsum in hash1:
                max_1 = max(max_1 , i - hash1[rsum])
            else:
                hash1[rsum] = i
        return max_1

            



     


