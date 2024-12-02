# Time Complexity = O(n) 
# Space Complexity = O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

import collections
class Solution:
    def subarraySum(self, nums, k: int) -> int:
        
        # use counter to keep track of sums
        s, t, c = 0, 0, collections.Counter()
        for n in nums:
            c[s] += 1  # increment if s adds up to the key value
            s += n     # iterate through nums by adding elements 
            t += c[s - k]  # increament t(possible subarrays) if sum - k iteratively happens
        return t