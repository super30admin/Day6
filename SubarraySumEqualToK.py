//Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO


class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if len(nums)==0:
            return 0
        rSum = 0
        count = 0
        d= {}
        d[0]=1
        for i in range(0,len(nums)):
            rSum+=nums[i]
            diff = rSum - k
            if diff in d:
                count+=d.get(diff)
            d[rSum]=d.get(rSum,0)+1
        return count
                