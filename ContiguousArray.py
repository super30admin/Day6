"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: none
"""

class Solution:
    def findMaxLength(self, nums):
        if not nums or len(nums) == 0:
            return 0
        
        len_map = {}
        rsum = 0
        maxlen = 0
        
        for i in range(len(nums)):
            if nums[i] == 0:
                rsum -= 1
            else:
                rsum += 1
            
            if rsum not in len_map:
                len_map[rsum] = i
            else:
                maxlen = max(maxlen, i - len_map[rsum])
                
        return maxlen

s = Solution()
print(s.findMaxLength([0,1,1,1,1,0,0,1,0,1,1,0]))