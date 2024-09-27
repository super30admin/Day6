# Time Complexity: O(n)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No

from collections import defaultdict
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        prefix_sum = 0
        
        # d = defaultdict(int)
        d = {0:1}
        res = 0
        
        for i in nums:
            prefix_sum+= i
            diff = prefix_sum - k
            res += d.get(diff, 0)
            d[prefix_sum] = d.get(prefix_sum, 0) + 1
            # print(d)
                
        return res
            