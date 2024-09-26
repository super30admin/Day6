from collections import defaultdict
from typing import List


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0: return -1
        maxsumarray, runningSummap, runninsum = 0, defaultdict(int), 0
        runningSummap[0] = -1

        for elementindex in range(0, len(nums)):

            if nums[elementindex] == 1:
                runninsum += 1
            else:
                runninsum -= 1
            if runninsum in runningSummap.keys():
                maxsumarray = max(maxsumarray, elementindex - runningSummap[runninsum])
            else:
                runningSummap[runninsum] = elementindex

        return maxsumarray

    #time:- O(n)
    #space:- O(n)