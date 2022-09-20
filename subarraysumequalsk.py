# -*- coding: utf-8 -*-
"""SubarraySumEqualsK.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1Dvw3NmwR5El_tKyy3eXjuIRsVSGkjUI3
"""

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if (nums == None or len(nums) == 0): return 0
        
        sum_dict = {}
        count = 0
        rSum = 0
        sum_dict[0] = 1
        
        for i in range(len(nums)):
            rSum = rSum + nums[i]
            if (rSum-k) in sum_dict:
                count = count + sum_dict[rSum-k]
            sum_dict[rSum] = sum_dict.get(rSum, 0) + 1
        return count