# -*- coding: utf-8 -*-
"""
Time Complexity : O(N) as we have to traverse through the given string
Space Complexity : O(N) for hashmap O(1) for lookup in a hashmap

"""

class Solution:
    def subarraySum(self, nums:[], k: int) -> int:
        
        #edge case
        if not nums or len(nums) == 0:
            return -1
        
        rsum_dict = {} #create an empty hashmap
        count = 0
        rsum_dict[0] = 1
        rsum = 0
        
        for i in nums:
            rsum += i
            c = rsum - k #compliment = runningsum - target
            
            if c in rsum_dict:#check for the presence of compliment in the dictionery
                count += rsum_dict[c]#if present, add count
            
            if rsum not in rsum_dict: #if rsum not present in dictionery
                rsum_dict[rsum] = 0 #add 0 to the dictionery
            rsum_dict[rsum] += 1 #else add the sum + 1
        return count
    
    
S = Solution()
nums = [1,2,3]
k = 2
print(S.subarraySum(nums,k))