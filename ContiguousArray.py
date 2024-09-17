"""
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.

"""

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this : Yes


from typing import List

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        map1 = {}
        max1 = 0
        rSum = 0
        
        map1 = {0: -1}
        
        for i in range(len(nums)):
            if nums[i] == 0:
                rSum -= 1
            else:
                rSum = rSum + 1
                
            if rSum in map1:
                max1 = max(max1, i - map1[rSum])
            else:
                map1[rSum] = i
                
        return max1