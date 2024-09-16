#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Nov 26 09:13:48 2019

@author: tanvirkaur
"""

# [3 4 7 2 -3 -1]
# runsum is used to store the sum while iterating through the whole array
# count is use to maintain the sum of subarrays whose sum equal to k
# runsum is used to keep track of the sum while iterating
# complement is used to keep track of the number of subarrays present
# Map is initialized with 0(sum),1(number of times it appear in the map) because the sum 0 is encountered once

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        dict1 = {0:1}
        count = 0
        complement = 0
        runsum = 0
        for i in range(len(nums)):
            runsum += nums[i]
            complement = runsum - k
            if complement in dict1:
                count += dict1[complement]
            if runsum not in dict1:
                dict1[runsum] = 1
            else:
                dict1[runsum] = dict1.get(runsum,dict1[runsum])+1
        return count 