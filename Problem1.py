# -*- coding: utf-8 -*-
"""
Created on Wed Aug 25 18:07:13 2021

@author: User
"""
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if(len(nums)==0):            
            return 0
        map1={}
        map1[0]=1
        count=0
        rsum=0
        for i in range(len(nums)):
            rsum+=nums[i]
            if((rsum-k) in map1):
                count+=map1.get(rsum-k)
            if not(rsum in map1):
                map1[rsum]=1
            else:
                map1[rsum]=map1.get(rsum)+1
        return count