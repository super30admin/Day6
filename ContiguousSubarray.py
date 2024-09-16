#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 26 08:52:13 2019

@author: tanvirkaur
"""

#time complexity = O(n)
# Space complexity = O(n)
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :r
        """
        dict1 = {0:-1}
        count = 0
        maxlen = 0
        for i in range(len(nums)):
            if nums[i] == 1:
                count += 1
            else:
                count -= 1
            if count in dict1:
                maxlen = max(maxlen, i - dict1[count])
            else:
                dict1[count] = i
        return maxlen