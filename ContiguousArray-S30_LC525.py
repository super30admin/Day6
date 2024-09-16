# Leetcode submission successful.
# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        l = 0
        rsum = 0
        hmap = {}
        # base case to cover edge conditions like [1,0] or [0,1].
        hmap[0] = -1
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -= 1
            else:
                rsum += 1
            if rsum in hmap:
                l = max(l, i - hmap[rsum])  # elements b/w same rsum values have balanced 0s and 1s.
            else:
                hmap[rsum] = i
        return l