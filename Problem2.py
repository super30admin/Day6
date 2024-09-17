## Problem2 (https://leetcode.com/problems/contiguous-array/)

# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes. No problems

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if not nums:
            return 0
        rsum = 0
        rsumIndex = {0:-1}
        finalmax = 0
        for i,num in enumerate(nums):
            rsum = rsum+1 if num==1 else rsum-1
            if rsum not in rsumIndex:
                rsumIndex[rsum] = i
            else:
                finalmax = max(finalmax,i - rsumIndex[rsum])
        return finalmax
        