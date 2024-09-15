# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        len_arr = len(nums)
        r_sum = 0
        result = 0
        _dict = {0: 1}
        for i in range(len_arr):
            r_sum += nums[i]
            if r_sum - k in _dict:
                result += _dict[r_sum - k]
            if r_sum not in _dict:
                _dict[r_sum] = 0
            _dict[r_sum] += 1
        return result