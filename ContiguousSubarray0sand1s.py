# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 19:01:24 2020

@author: WELCOME
"""
"""
Time Complexity = O(N) where N is number of elements in nums
Space Complexity = O(N) which is worst case if all elements in array are 0s or 1s
"""

class Solution:
    def findMaxLength(self, nums):
        dic={0:-1}
        level=0
        maximum=0
        for i in range(len(nums)):
            if nums[i]==1:
                level+=1
            else:
                level-=1
            if level in dic:
                if i-dic[level]>maximum:
                    maximum=i-dic[level]
            else:
                dic[level]=i
        return maximum
    
temp=Solution()
print(temp.findMaxLength([1,1,0,0]))