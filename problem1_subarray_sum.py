"""
// Time Complexity : O(N) , N length of an array
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


"""

from typing import List


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        map = {0: 1}
        counter = 0
        rsum = 0
        for i in range(len(nums)):

            rsum += nums[i]
            if rsum - k in map:
                counter += map[rsum - k]

            if rsum in map:
                map[rsum] += 1
            else:
                map[rsum] = 1

        return counter

