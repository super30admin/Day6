# Time complexity - O(n)
# Space complexity - O(n)

# Approach - Maintain a map of rSum : idx, where increase rSum by 1 for all 1s and decrease
# rSum by 1 for all 0s. Have intial case of 0 : -1 to make sure first element get a chance to
# be included while counting Max.

from typing import List
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        Map = {}
        Map[0] = -1
        rSum = 0
        Max = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum += 1
            if rSum not in Map:
                Map[rSum] = i
            else:
                Max = max(Max, (i - Map[rSum]))
        return Max      