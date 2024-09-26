# Time Complexity : O(N^2)
# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : not able to solve using hashmap


class Solution:
    def findMaxLength(self, nums):
        
        Max = 0
        for i in range(len(nums)):
            z = 0
            o = 0
            for j in range(len(nums)):
                if nums[j]==0:
                    z += 1
                else:
                    o += 1
                if z==o:
                    Max = max(Max,j-i+1)
        return Max