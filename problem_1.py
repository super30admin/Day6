""" Time Complexity : O(n)
 Space Complexity : O(n)
 Did this code successfully run on Leetcode :Yes
 Any problem you faced while coding this : No 
"""

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        dict_count = {}
        count = 0
        rsum = 0
        dict_count[0] = 1
        
        for i in range(len(nums)):
            
            rsum = rsum + nums[i]

            if rsum - k in dict_count:
                count = count + dict_count[rsum - k]
                print(count,dict_count)
            
            if rsum not in dict_count:
                dict_count[rsum] = 1
            else:
                dict_count[rsum] += 1    
            
                
        return count
                