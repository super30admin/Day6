#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Nov 30 12:16:37 2020

@author: gerrard
"""

class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        start = 0
        end = start+1
        total = 0
        
        if nums == None:
            return False
        
        while(start<len(nums)-1):
            
            if end == start + 1:
                total = total + nums[start]+nums[end]
            else:
                total = total+nums[end]
            # print("start")
            # print(start)
            # print("end")
            # print(end)
            # print(total)
            if k == 0 and total == 0:
                return True
            
            elif k != 0 and total%k==0:
                return True
                
            if end == len(nums)-1:
                total = 0
                start = start + 1
                end = start 
                
            end = end + 1
                
        return False