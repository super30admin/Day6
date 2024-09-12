""" Time Complexity : O(n)
 Space Complexity : O(n)
 Did this code successfully run on Leetcode :Yes
 Any problem you faced while coding this : No 
"""


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        dict_count = {}
        count = 0
        max_len = 0
        dict_count[0] = -1
        
        
        for i,ele in enumerate(nums):
            
            if ele == 1:
                count = count + 1
            else:
                count = count - 1
                
            if count not in dict_count:
                dict_count[count] = i
                
            else:
                max_len = max(max_len,i-dict_count[count])
                
        return max_len
                
        