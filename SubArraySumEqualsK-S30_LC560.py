# Leetcode submission successful.
# Time Complexity = O(n)
# Space Complexity = O(n)
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        rsum = 0
        cnt = 0
        hmap = {}
        hmap[0] = 1    # base case to cover edge conditions.
        for i in range(len(nums)):
            rsum += nums[i]
            if rsum-k in hmap:  # if difference between rsums is k, elements between add up to k.
                cnt += hmap[rsum-k]
            if rsum in hmap:
                hmap[rsum] += 1    # updating occurrence.
            else:
                hmap[rsum] = 1  # occurrence
        return cnt