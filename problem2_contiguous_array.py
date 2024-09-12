"""
// Time Complexity : O(N) , N length of an array
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
1) In a single pass , will be calculating running sum
2) will be checking rsum exists in map , if yes then fetch value of index at rsum key , calculate distance as a lenght
3) compare with max , update if its greater than max 
"""
from typing import List


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        map = {0: -1}
        rsum = 0
        max = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -= 1
            if nums[i] == 1:
                rsum += 1
            if rsum in map:
                if i - map[rsum] > max:
                    max = i - map[rsum]
            else:
                map[rsum] = i
        return max