# -*- coding: utf-8 -*-
"""
Created on Wed Aug 25 18:33:52 2021

@author: User
"""

class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """


    if(len(nums)==0):            
        return 0
    map1={}
    map1[0]=-1
    rsum=0
    maximum=0
    for i in range(len(nums)):
        if(nums[i]==0):
            rsum=rsum-1
        else:
            rsum=rsum+1
        if(rsum in map1):
            maximum=max(maximum,i-map1.get(rsum))
        else:
            map1[rsum]=i
    return maximum