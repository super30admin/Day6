#LC 560 - Subarray Sum Equals K
#Time Complexity - O(n)
#Space Complexity - O(n)
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        d = {0:1}
        ans = 0
        rsum = 0
        for i in range(len(nums)):
            rsum = rsum + nums[i]
            comp = rsum - k
            if comp in d.keys():
                ans = ans + d[comp]
            if rsum not in d.keys():
                d[rsum] = 1
            else:
                d[rsum] = d[rsum] + 1
        return ans