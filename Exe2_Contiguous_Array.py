# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        _max = 0
        r_sum = 0
        _dict = {0: -1}
        for i in range(len(nums)):
            if nums[i] == 0:
                r_sum -= 1
            else:
                r_sum += 1
            if r_sum in _dict:
                _max = max(_max, i - _dict[r_sum])
            else:
                _dict[r_sum] = i
        return _max