# -*- coding: utf-8 -*-
"""
Created on Fri Mar 26 19:47:17 2021

@author: jgdch
"""

#Time complexity: O(N), where N is the length of the array
#Space Complexity:O(N)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count=0
        dictm={0:-1}
        maxLength=0
        if(len(nums)==0):
            return 0
        for i in range(len(nums)):
            #print(dictm)
            if(nums[i]==0):
                count-=1
            if(nums[i]==1):
                count+=1
            if(count in dictm):
                
                maxLength=max(maxLength,i-dictm[count])
                
            else:
                dictm[count]=i
        return maxLength
                
            
        