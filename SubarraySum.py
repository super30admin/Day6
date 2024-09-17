"""
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.

Constraints:

1 <= nums.length <= 2 * 10^4
-1000 <= nums[i] <= 1000
-107 <= k <= 10^7

"""

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this : Yes

from typing import List

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        result = 0

        for i in range(len(nums)):

            add = 0

            for j in range(i, len(nums)):

                sum += nums[j]

                if add == k:

                    result += 1

        return result




        
