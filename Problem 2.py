## Problem2 (https://leetcode.com/problems/contiguous-array/)

# Time Complexity : O(n)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: To keep track of number of 1's and 0's using a sum , we increment by 1 and decrement by -1, respectively. if sum is at zero, then we have same number of 1 and 0's so we increment by 1. Using a hashmap, we store the index of the sum

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxm = 0
        zero = 0
        d = {}
        for index, val in enumerate(nums):
            if val == 1:
                zero += 1
            else:
                zero -= 1
            if zero == 0:
                maxm = index + 1
            if zero in d:
                if maxm < index - d[zero]:
                    maxm = index - d[zero]             
            else:
                d[zero] = index
        return maxm
        