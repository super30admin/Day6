# TimeComplexity: O(n)
# Space Complexity:O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: no
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        count = 0
        rsum = 0
        sum_map = {0:1}
        for num in nums:
            rsum = rsum + num 
            if sum_map.has_key(rsum-k):
                count = count + sum_map[rsum-k] 
            if sum_map.has_key(rsum):
                sum_map[rsum] = sum_map[rsum] + 1
            else:
                sum_map[rsum] = 1
        return count