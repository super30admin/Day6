# -*- coding: utf-8 -*-
"""
Created on Fri Mar 26 19:46:23 2021

@author: jgdch
"""

#Time complexity: O(N) where N is the length  of array
# Space complxity: O(N)
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        sum_dict={0:1}
        rSum=0
        count=0
        for i in range(len(nums)):
            rSum+=nums[i]
            if(rSum-k in sum_dict):
                
                
                count+=sum_dict[rSum-k]
                
                
            if (rSum in sum_dict):
                sum_dict[rSum]+=1
            else:
                sum_dict[rSum]=1
                
            #print(sum_set)
        return count
            
            
        