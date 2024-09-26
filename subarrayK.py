"""
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
import collections
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        m = collections.defaultdict(int)
        m[0] = 1
        count, _sum = 0, 0
        for i in range(len(nums)):
            
            _sum += nums[i]
            count += m.get(_sum - k, 0)
            m[_sum] += 1
            
        return count