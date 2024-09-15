# -*- coding: utf-8 -*-
"""
Created on Sat Jan  4 22:01:02 2020

@author: WELCOME
"""
"""
Time Complexity = O(N) where N is the number of elements in the list
Space Complexity = O(N)
"""

class Solution:
    def subarraySum(self, nums, k):
        if nums==None or len(nums)==0:
            return -1
        dic={0:1}
        count=0
        add=0
        for i in nums:
            add=add+i
            if add-k in dic:
                count+=dic[add-k]
            if add not in dic:
                dic[add]=1
            else:
                dic[add]+=1
        return count
    
temp=Solution()
print(temp.subarraySum([0,0,0,0,0],0))
    
