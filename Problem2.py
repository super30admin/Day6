#
# Time Complexity  = O(n)
# Space Complexity  = O(n)
# Worked on leetcode
#
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hmap = {}
        curr = 0
        hmap[0] = -1
        res = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                curr += 1
            else:
                curr -= 1
            if curr in hmap:
                res = max(res, i-hmap[curr])
            if curr not in hmap:
                hmap[curr] = i
        return res
