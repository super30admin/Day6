"""
TC: O(n) Iterate throw all elements in nums
SP: O(n) to store running sum for every element
"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hmap = {0:-1}
        rsum = 0
        res = 0
        for i, n in enumerate(nums):
            if n==0:
                rsum-=1
            else:
                rsum+=1
            if rsum in hmap:
                res = max(res, i-hmap[rsum])
            else:
                hmap[rsum] = i
        return res
            

