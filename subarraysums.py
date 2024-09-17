##Time Complexity : O(n)
##Space Complexity : O(n)
##Did this code successfully run on Leetcode : Yes

class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        result = 0
        sum = 0
        presum = {0 : 1}
        for n in nums:
            sum +=n
            difference = sum - k
            result += presum.get(difference, 0)
            presum[sum] = 1 + presum.get(sum, 0)
            
        return result